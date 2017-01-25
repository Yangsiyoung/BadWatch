package com.example.yangsiyoung.badwatchtest.data.heros.cookiehandler;

import android.webkit.CookieManager;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * Created by Yang Si Young on 2016-10-06.
 */

public class WebViewCookieJar implements CookieJar {
    private CookieManager webViewCookieManager = CookieManager.getInstance();

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {

    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        return null;
    }
}
