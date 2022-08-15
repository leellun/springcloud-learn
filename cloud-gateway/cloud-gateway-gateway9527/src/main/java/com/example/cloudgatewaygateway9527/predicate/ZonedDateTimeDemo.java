package com.example.cloudgatewaygateway9527.predicate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Author: leell
 * Date: 2022/8/15 00:40:58
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zny);
    }
}
