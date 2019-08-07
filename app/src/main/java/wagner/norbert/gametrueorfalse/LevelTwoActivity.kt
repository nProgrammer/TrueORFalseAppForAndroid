package wagner.norbert.gametrueorfalse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*

class LevelTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_two)
        var setClass = ""
        var score = 10 // player score
        val maxQuest = 9 // maxQuest number (0-9)
        var numberQuest = 0 // what quest it is
        val toast = Toast.makeText(this, "SCORE SAVED!", Toast.LENGTH_SHORT) // toast on the end
        questionView.setText(questionsLV2(numberQuest)) // writing question
        //TRUE BUTTON click listener
        trueB.setOnClickListener {
            //Good answer
            if (numberQuest == 0 || numberQuest == 1 || numberQuest == 5 || numberQuest == 6 || numberQuest == 7 ) {

                score++
                pointsView.setText("Score: " + score)
                numberQuest++
                questionView.setText(questionsLV2(numberQuest))
            } else if(score == 20 || numberQuest == 10){ //MAX questins or points
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
                    score--

                } else {
                    score--
                    pointsView.setText("Score: " + score)
                    questionView.setText(questionsLV2(numberQuest))
                }
            }
        }
        falseB.setOnClickListener {
            if (numberQuest == 2 || numberQuest == 3 || numberQuest == 4 || numberQuest == 9 || numberQuest == 8) {

                score++
                pointsView.setText("Score: " + score)
                numberQuest++
                questionView.setText(questionsLV2(numberQuest))

            }else if(score == 20 || numberQuest > maxQuest){
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
                    score--
                } else {
                    score--
                    pointsView.setText("Score: " + score)
                    questionView.setText(questionsLV2(numberQuest))
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

}