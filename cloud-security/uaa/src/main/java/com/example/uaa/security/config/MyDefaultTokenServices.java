package com.example.uaa.security.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;

import java.util.concurrent.TimeUnit;

/**
 * Author: leell
 * Date: 2022/9/2 22:27:05
 */
public class MyDefaultTokenServices extends DefaultTokenServices {
    @Autowired
    private RedisTemplate redisTemplate;
    private TokenStore tokenStore;

    @Override
    public void setTokenStore(TokenStore tokenStore) {
        super.setTokenStore(tokenStore);
        this.tokenStore = tokenStore;
    }

    @Override
    public OAuth2AccessToken createAccessToken(OAuth2Authentication authentication) throws AuthenticationException {
        User user = (User) authentication.getUserAuthentication().getPrincipal();
        JSONObject jsonObject = JSONObject.parseObject(user.getUsername());
        redisTemplate.opsForValue().set(jsonObject.getString("username") + "===//", jsonObject.getLongValue("time"), 30 * 60, TimeUnit.SECONDS);
        return super.createAccessToken(authentication);
    }

    @Override
    public OAuth2AccessToken refreshAccessToken(String refreshTokenValue, TokenRequest tokenRequest) throws AuthenticationException {
        OAuth2AccessToken oAuth2AccessToken = super.refreshAccessToken(refreshTokenValue, tokenRequest);
        OAuth2RefreshToken refreshToken = tokenStore.readRefreshToken(refreshTokenValue);
        OAuth2Authentication authentication = tokenStore.readAuthenticationForRefreshToken(refreshToken);
        JSONObject jsonObject = JSONObject.parseObject((String) authentication.getUserAuthentication().getPrincipal());
        redisTemplate.opsForValue().set(jsonObject.getString("username") + "===//", jsonObject.getLongValue("time"), 30 * 60, TimeUnit.SECONDS);
        return oAuth2AccessToken;
    }
}
