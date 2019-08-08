package wagner.norbert.gametrueorfalse

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

fun questionsLV3(numberQest: Int): String {
    var x = numberQest
    var quest = ""
    if (x == 0) {
        quest = "Kotlin works on JVM" // True
    }else if (x == 1) {
        quest = "Java was invented in 1995" //True
    }else if (x == 2) {
        quest = "Android Studio is Kotlin/Swift IDE for writing application for Android" //False
    }else if(x == 3){
        quest = "Angular is JavaScript framework" //True
    }else if(x == 4){
        quest = ".NET is JS framework" //False
    }else if(x == 5){
        quest = "Git is version control app" //True
    }else if(x == 6){
        quest = "Android layouts are made in Kotlin language" //False
    }else if(x == 7){
        quest = "Scala works on JVM" //True
    }else if(x == 8){
        quest = "In Java language to make loop we're writing loopFor(){}" // False
    }else if(x == 9){
        quest = "39 % 2 = 0" // False
    }
    return quest
}