package com.newland.tcc.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @version V1.0
 * @Description: (用一句话描述该文件做什么)
 */
public class ResultHolder {

    public static Map<String, String> actionOneResults = new ConcurrentHashMap<>();

    public static Map<String, String> actionTwoResults = new ConcurrentHashMap<>();

    public static void setActionOneResult(String txId, String result) {
        actionOneResults.put(txId, result);
    }

    public static String getActionOneResult(String txId) {
        return actionOneResults.get(txId);
    }

    public static void setActionTwoResult(String txId, String result) {
        actionTwoResults.put(txId, result);
    }

    public static String getActionTwoResult(String txId) {
        return actionTwoResults.get(txId);
    }

}
