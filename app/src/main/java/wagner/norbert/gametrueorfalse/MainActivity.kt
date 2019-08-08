package wagner.norbert.gametrueorfalse
/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Level 1")
        }else if(points < 20) {
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Level 2")
        }else if(points < 30) {
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Level 3")
        }else if(points < 40) {
            lastScre.setText("Your last score: " + file.readLines().toString() + ". Level 4")
        }else if(points == 40){
            lastScre.setText("Your last score: " + file.readLines().toString() + ". You end game. Now you will start again from 1 level")
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
        goToGame.setOnClickListener {
            val rankFile = File("/data/data/wagner.norbert.gametrueorfalse/data.txt").readLines()
            val rankFull = rankFile[0].toInt()
            if (rankFull < 10 || rankFull == null) {
                var tost = Toast.makeText(applicationContext, "Started level 1", Toast.LENGTH_SHORT)
                tost.show()
                val goToGame = Intent(applicationContext, GameActivity::class.java)
                startActivity(goToGame)
            } else if (rankFull < 20) {
                var tost = Toast.makeText(applicationContext, "Started level 2", Toast.LENGTH_SHORT)
                tost.show()
                val goToGame = Intent(applicationContext, LevelTwoActivity::class.java)
                startActivity(goToGame)
            } else if (rankFull < 30) {
                var tost = Toast.makeText(applicationContext, "Started level 3", Toast.LENGTH_SHORT)
                tost.show()
                val goToGame = Intent(applicationContext, LevelThreeActivity::class.java)
                startActivity(goToGame)
            }else if (rankFull < 40) {
                var tost = Toast.makeText(applicationContext, "Started level 4", Toast.LENGTH_SHORT)
                tost.show()
                val goToGame = Intent(applicationContext, LevelFourActivity::class.java)
                startActivity(goToGame)
            }else if (rankFull == 40) {
                var tost = Toast.makeText(applicationContext, "Started level 1", Toast.LENGTH_SHORT)
                tost.show()
                val goToGame = Intent(applicationContext, GameActivity::class.java)
                startActivity(goToGame)
            }
        }
    }
}
