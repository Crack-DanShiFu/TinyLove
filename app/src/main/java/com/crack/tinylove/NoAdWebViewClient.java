package com.crack.tinylove;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NoAdWebViewClient extends WebViewClient {

    private Context context;

    public NoAdWebViewClient(Context context) {
        this.context = context;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        String js = ADFilterTool.getClearAdDivJs(context);
        Log.v("adJs",js);
        view.loadUrl(js);
    }


}
