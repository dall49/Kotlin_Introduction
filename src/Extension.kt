

// Création de l'extension d'une classe (dans notre cas la classe ArrayList<Int>)
fun ArrayList<Int>.findMax():Int{
    var max = 0
    for( e in this){
        if(e > max) max = e
    }
    return max
}


fun main(){

    var listOfElements = ArrayList<Int>()

    listOfElements.add(12)
    listOfElements.add(8)
    listOfElements.add(23)
    listOfElements.add(4)
    listOfElements.add(58)

    println(listOfElements.findMax()) // appel de l'extension

}