package wagner.norbert.gametrueorfalse

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

fun questionsLV4(numberQest: Int): String {
    var x = numberQest
    var quest = ""
    if (x == 0) {
        quest = "Kotlin was invented in 2011" // True
    }else if (x == 1) {
        quest = "Kernel was invented by Linus Torvalds" //True
    }else if (x == 2) {
        quest = "The lambda expression was added to JAVA from JDK 8" //True
    }else if(x == 3){
        quest = "Kotlin loop look like in this ex.: for(i in 0..10){}" //True
    }else if(x == 4){
        quest = ".NET is JAVA framework" //False
    }else if(x == 5){
        quest = "Vue is JavaScript" //True
    }else if(x == 6){
        quest = "In Kotlin we're writing switchCase() instead of switch()" //False
    }else if(x == 7){
        quest = "JAVA was made by James Gosling" //True
    }else if(x == 8){
        quest = "99 % 2 - 2 = -1.5545" // False
    }else if(x == 9){
        quest = "77 % 2 = 0" // False
    }
    return quest
}