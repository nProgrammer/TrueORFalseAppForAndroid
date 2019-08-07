package wagner.norbert.gametrueorfalse

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

fun questionsLV2(numberQest: Int): String {
    var x = numberQest
    var quest = ""
    if (x == 0) {
        quest = "JavaFX was officially removed from JDK 11" // True
    }else if (x == 1) {
        quest = "Kotlin was made by JetBrains Team" //True
    }else if (x == 2) {
        quest = "HTML is programming language" //False
    }else if(x == 3){
        quest = "JavaScript is the same that Java" //False
    }else if(x == 4){
        quest = "JSON is JS framework" //False
    }else if(x == 5){
        quest = ".NET is C# framework" //True
    }else if(x == 6){
        quest = "Android layouts are made in XML language" //True
    }else if(x == 7){
        quest = "Python is the best programming language for machine learning" //True
    }else if(x == 8){
        quest = "In Java language to write something in console we're writing println()" // False
    }else if(x == 9){
        quest = "73 % 2 = 0" // False
    }
    return quest
}