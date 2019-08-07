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
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

/*
* Made by nProgrammer (Norbert Wagner)
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val file = File("/data/data/wagner.norbert.gametrueorfalse/data.txt")
        var score = file.readLines()
        var points = score[0].toInt()
        if(points < 10) {
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Your level is 1")
        }else if(points <= 20) {
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Your level is 2")
        }

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

    override fun onResume() {
        super.onResume()
        // NEXT LEVELS
        goToGame.setOnClickListener{
            val rankFile = File("/data/data/wagner.norbert.gametrueorfalse/data.txt").readLines()
            val rankFull = rankFile[0].toInt()
            if(rankFull < 10 || rankFull == null) {
            val goToGame = Intent(applicationContext, GameActivity::class.java)
            startActivity(goToGame)
            }else if(rankFull <= 20){
                val goToGame = Intent(applicationContext, LevelTwoActivity::class.java)
                startActivity(goToGame)
            }
        }
    }
}
