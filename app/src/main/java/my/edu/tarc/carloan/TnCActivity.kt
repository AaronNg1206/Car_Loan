package my.edu.tarc.carloan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TnCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tn_cactivity)
        val webViewTnc: WebView = findViewById(R.id.webViewTnC)

        webViewTnc.loadUrl("https://seekt.000webhostapp.com/")
    }
}