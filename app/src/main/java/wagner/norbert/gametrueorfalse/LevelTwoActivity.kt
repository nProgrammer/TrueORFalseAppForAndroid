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

        var score = 10 // player score
        var numberQuest = 0
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
                if (numberQuest == 10) { //MAX questins or points
                    var points = doonFile(score)
                    notificationView.setText("You won! Backing to home")
                    Thread.sleep(1000)
                    score = 0
                    toast.show()
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    questionView.setText(questionsLV2(numberQuest))
                }
            }  else {
                numberQuest++
                score--
                pointsView.setText("Score: " + score)
                questionView.setText(questionsLV2(numberQuest))
                if (numberQuest == 10) { //MAX questins or points
                    var points = doonFile(score)
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    notificationView.setText("You won! Backing to home")
                    Thread.sleep(1000)
                    score = 0
                    toast.show()
                    startActivity(intent)
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
                if (numberQuest == 10) { //MAX questins or points
                    var points = doonFile(score)
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    notificationView.setText("You won! Backing to home")
                    Thread.sleep(1000)
                    score = 0
                    toast.show()
                    startActivity(intent)
                    questionView.setText(questionsLV2(numberQuest))
                }
            } else {
                    numberQuest++
                    score--
                    pointsView.setText("Score: " + score)
                    questionView.setText(questionsLV2(numberQuest))
                    if (numberQuest == 10) { //MAX questins or points
                        var points = doonFile(score)
                        notificationView.setText("You won! Backing to home")
                        Thread.sleep(1000)
                        score = 0
                        toast.show()
                        val intent = Intent(applicationContext, MainActivity::class.java)
                        startActivity(intent)
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