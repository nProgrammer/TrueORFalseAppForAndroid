package wagner.norbert.gametrueorfalse

/*
* Made by nProgrammer(Norbert Wagner)
* Contact me wagner.norbert277@gmail.com
*/

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