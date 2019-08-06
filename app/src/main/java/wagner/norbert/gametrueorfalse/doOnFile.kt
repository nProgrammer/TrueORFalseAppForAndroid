package wagner.norbert.gametrueorfalse

import java.io.File

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

fun doonFile(score: Int): String{

    val file = File("/data/data/wagner.norbert.gametrueorfalse/data.txt")
    file.writeText(score.toString())
    var x = file.readLines()
    return x[0]

}