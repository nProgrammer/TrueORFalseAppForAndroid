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
        var setClass = ""
        var score = 0 // player score
        val maxQuest = 9 // maxQuest number (0-9)
        var numberQuest = 0 // what quest it is
        val toast = Toast.makeText(this, "SCORE SAVED!", Toast.LENGTH_SHORT) // toast on the end
        questionView.setText(questions(numberQuest)) // writing question

        //TRUE BUTTON click listener
        trueB.setOnClickListener {
            //Good answer
            if (numberQuest == 1 || numberQuest == 2 || numberQuest == 4 || numberQuest == 7 || numberQuest == 8) {

                score++
                var points = doonFile(score)
                pointsView.setText("Score: " + points)
                numberQuest++
                questionView.setText(questions(numberQuest))
            } else if(score == 10 || numberQuest == 10){ //MAX questins or points
                var points = doonFile(score)
                notificationView.setText("You won! Backing to home")
                Thread.sleep(1000)
                score = 0
                toast.show()
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else { //BAD answer

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
        //FUNCTION with questions

}
