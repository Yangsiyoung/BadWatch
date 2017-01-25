package com.example.yangsiyoung.badwatchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.yangsiyoung.badwatchtest.data.heros.code.ResultCode;
import com.example.yangsiyoung.badwatchtest.data.heros.cookiehandler.WebViewCookieHandler;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BattleNetLoginActivity extends AppCompatActivity implements ResultCode{

    public static final String battleNetLoginUrl = "https://kr.battle.net/login/ko/?ref=https://kr.battle.net/oauth/authorize?scope%3Dwow.profile%2Bsc2.profile%26response_type%3Dcode%26redirect_uri%3Dhttps%253A%252F%252Fdev.battle.net%252Fio-docs%252Foauth2callback%26client_id%3D56gqej5eenkvwgp5ke3nr4gpz7x2a4qd&app=oauth";

    @Bind(R.id.webViewBattleNetLogin)
    WebView webView;

    CookieManager cookieManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_net_login);
        ButterKnife.bind(this);

        webView.setWebViewClient(new WebClient());
        WebSettings set = webView.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);

        cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        webView.loadUrl(battleNetLoginUrl);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("isLoginSuccess", false);
        setResult(BATTLE_NET_LOGIN_FAIL,intent);
        finish();
    }

    class WebClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if(url.equals(battleNetLoginUrl)){
                view.loadUrl(url);
                return true;
            }else{
                String loginCookie = cookieManager.getCookie(battleNetLoginUrl);
                cookieManager.setCookie("http://bad.watch/api/session", loginCookie);
                Log.d("aaaa", "Cookie Value is " + loginCookie);
                Log.d("aaaa", "Redirect 된 페이지의 Cookie는 " + cookieManager.getCookie(url));
                Intent intent = new Intent();
                intent.putExtra("isLoginSuccess", true);
                intent.putExtra("loginCookie", loginCookie);
                setResult(BATTLE_NET_LOGIN_SUCCESS, intent);
                finish();
                return true;
            }
        }
    }
}
