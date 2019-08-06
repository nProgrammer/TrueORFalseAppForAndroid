package wagner.norbert.gametrueorfalse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import java.io.File

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        var points1 = File("/data/data/wagner.norbert.gametrueorfalse/data.txt").readLines()
        var score = 0
        val maxQuest = 9
        var numberQuest = 0
        val toast = Toast.makeText(this, "SCORE SAVED!", Toast.LENGTH_SHORT)
        questionView.setText(questions(numberQuest))
        trueB.setOnClickListener {
            if (numberQuest == 1 || numberQuest == 2 || numberQuest == 4 || numberQuest == 7 || numberQuest == 8) {

                score++
                var points = doonFile(score)
                pointsView.setText("Score: " + points)
                numberQuest++
                questionView.setText(questions(numberQuest))

            }else if(score == 10 || numberQuest == 10){
                var points = doonFile(score)
                notificationView.setText("You won! Backing to home")
                Thread.sleep(1000)
                score = 0
                toast.show()
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {

                numberQuest++
                if (numberQuest > maxQuest) {
                    notificationView.setText("END!")
                    questionView.setText("END!")
                    trueB.setText("END!")
                    falseB.setText("END!")

                } else {
                    questionView.setText(questions(numberQuest))
                }
            }
        }
        falseB.setOnClickListener {
            if (numberQuest == 0 || numberQuest == 3 || numberQuest == 5 || numberQuest == 6 || numberQuest == 9) {

                score++
                pointsView.setText("Score: " + score)
                numberQuest++
                questionView.setText(questions(numberQuest))

            }else if(score == 10 || numberQuest > maxQuest){
                var points = doonFile(score)
                notificationView.setText("You won! Backing to home")
                Thread.sleep(1000)
                toast.show()
                score = 0
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {

                numberQuest++
                if (numberQuest > maxQuest) {
                    notificationView.setText("END!")
                    questionView.setText("END!")
                    trueB.setText("END!")
                    falseB.setText("END!")

                } else {
                    questionView.setText(questions(numberQuest))
                }
            }

        }

        exitB.setOnClickListener{
            var points = doonFile(score)
            Thread.sleep(1000)
            score = 0
            toast.show()
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun questions(numberQest: Int): String {
        var x = numberQest
        var quest = ""
        if (x == 0) {
            quest = "2+2*3 = 12" // False
        }else if (x == 1) {
            quest = "Android is dist of linux" //True
        }else if (x == 2) {
            quest = "5*5+3+4*2 = 36" //True
        }else if(x == 3){
            quest = "777 - 88 = 688" //False
        }else if(x == 4){
            quest = "Cetacean is mammal" //True
        }else if(x == 5){
            quest = "5^7 - 2 = 33" //False
        }else if(x == 6){
            quest = "Pseudopseudohypoparathyroidism is the longest word in English language" //False
        }else if(x == 7){
            quest = "554 - 7*4 - 3 * 3 = 507" //True
        }else if(x == 8){
            quest = "There are 1 420 000 000 Chinese in the world" // True
        }else if(x == 9){
            quest = "999 - 999*2 = 0" // False
        }
        return quest
    }
}
