package com.example.yangsiyoung.badwatchtest.data.heros.cookiehandler;

import android.util.Log;
import android.webkit.CookieManager;

import com.example.yangsiyoung.badwatchtest.BattleNetLoginActivity;
import com.example.yangsiyoung.badwatchtest.MainActivity;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yang Si Young on 2016-10-06.
 */

public class WebViewCookieHandler extends CookieHandler {

    private CookieManager webViewCookieManager = CookieManager.getInstance();

    @Override
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> requestHeaders){
        String url = uri.toString();
        String cookieValue = this.webViewCookieManager.getCookie(BattleNetLoginActivity.battleNetLoginUrl);
        Map<String, List<String>> cookies = new HashMap<>();
        try {

            if (cookieValue == null) {
                cookieValue = "";
            }

            cookies.put("Cookie", Arrays.asList(cookieValue));

        }catch (Exception e){
            Log.d("error", "CookieHandler Get error is " + e.toString());
        }
        return cookies;
    }

    @Override
    public void put(URI uri, Map<String, List<String>> responseHeaders) {
        try {
            String url = uri.toString();

            for (String header : responseHeaders.keySet()) {
                if (header.equalsIgnoreCase("Set-Cookie") || header.equalsIgnoreCase("Set-Cookie2")) {
                    for (String value : responseHeaders.get(header)) {
                        this.webViewCookieManager.setCookie(url, value);
                    }
                }
            }
        } catch (Exception e) {
            Log.d("error", "CookieHandler Put error is " + e.toString());
        }
    }
}
