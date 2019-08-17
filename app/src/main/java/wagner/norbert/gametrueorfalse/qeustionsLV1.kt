package wagner.norbert.gametrueorfalse

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

fun questionsLV1(numberQest: Int): String {
    var x = numberQest
    var quest = ""
    if (x == 0) {
        quest = "You can write android apps only in: Java, Ktolin" // False
    }else if (x == 1) {
        quest = "Android is dist of linux" //True
    }else if (x == 2) {
        quest = "To make android application in C# you can use Xamarin" //True
    }else if(x == 3){
        quest = "JVM is Java Version Mode" //False
    }else if(x == 4){
        quest = "JDK is Java Development Kit" //True
    }else if(x == 5){
        quest = "Alexa echo was made by Google" //False
    }else if(x == 6){
        quest = "You can't write IOS app in Kotlin" //False
    }else if(x == 7){
        quest = "Swift is officially IOS language" //True
    }else if(x == 8){
        quest = "Kotlin is officially Android language" // True
    }else if(x == 9){
        quest = "Kotlin fun is the same that Java class" // False
    }
    return quest
}