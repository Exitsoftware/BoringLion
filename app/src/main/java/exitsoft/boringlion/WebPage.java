package exitsoft.boringlion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPage extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web = (WebView) findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://shuttlecock.herokuapp.com/");

        web.setWebViewClient(new WebViewClient() {

        });

        web.setWebChromeClient(new WebChromeClient() {

        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        if (web.canGoBack()) {
            web.goBack();
        } else {
            finish();
        }
    }
}
