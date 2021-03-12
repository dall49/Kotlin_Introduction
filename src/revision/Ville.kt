package revision

open class Ville(var nom:String, var hab:Int){

     open fun afficher(){
        println("La ville $nom est peuplée de $hab habitants")
    }

}


fun main() {

    val v = Ville("Rabat", 200)
    v.afficher()

    val c = Capitale("Rabat", 455, "Hassan")
    c.afficher()

}
