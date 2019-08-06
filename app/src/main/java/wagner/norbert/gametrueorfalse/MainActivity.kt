package wagner.norbert.gametrueorfalse
/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    // goToGIT button
    fun onClickGIT(v: View) {
        val gourl= Intent(Intent.ACTION_VIEW)
        gourl.data = Uri.parse("https://www.github.com/nProgrammer")
        startActivity(gourl)
    }
    // goToInfo
    fun onClickInfo(v: View){
        val goToInfo = Intent(applicationContext, InfoActivity::class.java)
        startActivity(goToInfo)
    }
}
