package wagner.norbert.gametrueorfalse

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }
    fun onClickGIT(v: View) {
        val gourl= Intent(Intent.ACTION_VIEW)
        gourl.data = Uri.parse("https://www.github.com/nProgrammer")
        startActivity(gourl)
    }
}
