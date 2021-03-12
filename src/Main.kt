import java.util.*
import kotlin.collections.*


fun main() {

// **************************************************************
// **************************************************************

/* 1. Afficher un message sur la sortie standard
   (un commentaire multi-lignes)
*/
    // println(10) // avec retour à la ligne
    // print("Salam tout le monde") // sans retour à la ligne
    //  print("Hey \t everybody\n")
    //  print("OK")


// **************************************************************
// **************************************************************

// 2. variables et types primitifs

    /*
    // Création d'une varible en deux actions : déclaration + affectation d'une valeur (en une seule ligne)
    // Pas besoin de spécifier le type de cette variable (c'est optionnel)
    val str = "Driss"
    println("Welcome to Kotlin " + str)

    // Déclaration d'une variable puis affectation de valeur (deux lignes de code)
    // Il faut obligatoirement spécifier le type de cette variable
    val a:Int
    a = 7
    println(a)

    // val : permet de définir une variable "immuable" (ayant la valeur inchangeable)
    val name = "Ahmed"
    val age = 18
    val cin = "A125648"

    // name = "Ahmed ROSSI" // impossible de changer la valeur de cette variable "immuable"
    // Concaténation (String + variable) : type 1 (semblable à Java)
    println("Name : " + name)
    println("Age : " + age)
    println("CIN : " + cin)

    // Concaténation (String + variable) : type 2 (propre à Kotlin)
    println("Name : $name")
    println("Age : $age")
    println("CIN : $cin")

    // var : permet de définir une variable "mutable" (ayant la valeur changeable)
    var x = 12
    x = 10
    println(x)

    var b:Double
    b = 898.5

    // Nous avons ajouté le "?" Afin de prévenir le compilateur qu'une variable peut ne pas avoir une valeur par défaut au début (marks a type as nullable)
    // les "{!!}" ajoutés au message de println signifient que la valeur de la variable ne doit pas être nulle (asserts that an expression is non-null)
    var departement:String?
    departement = null
    departement = "Informatique"
    println("Departement : ${departement!!}")

    */


    /*
    // le mot clé "lateinit" permet de reporter l'initialisation d'un objet au moment de sa création
    lateinit var a:String
    a = "Salam alaikum"
    print(a)
    */


// **************************************************************
// **************************************************************

// 3. Entrée d'un programme (demander à l'utilisateur d'insérer des valeurs)

    /*
    val name = readLine()
    val age = readLine()
    val cin = readLine()

    println("Name : $name")
    println("Age : $age")
    println("CIN : $cin")
    */

    // afin de forcer un type particulier de données nous pouvons faire :

    /*
    print("Nom : ")
    var name:String = readLine()!!.toString() // on interdit la réception de la valeur nulle avec le symbole !!
    print("Age : ")
    var age:Int = readLine()!!.toInt() // on interdit la réception de la valeur nulle avec le symbole !!
    print("CIN : ")
    var cin:String = readLine().toString() // on accèpte ici la valeur nulle (pas de !!)

    println("=====User Info=====")
    println("Name : $name")
    println("Age : $age")
    println("CIN : $cin")
    */

// **************************************************************
// **************************************************************

// 4. Opérations arithmétiques et logiques

    /*
    print("Nbre 1 : ")
    var nb1 = readLine()!!.toDouble()
    print("Nbre 2 : ")
    var nb2 = readLine()!!.toDouble()
    // val somme = nb1 + nb2
    println("somme : ${nb1+nb2}")
    println("soustraction : ${nb1-nb2}")
    println("multiplication : ${nb1*nb2}")
    println("division : ${nb1/nb2}")
    println("modulo (reste de la division) : ${nb1%nb2}")
    */

    // Priorité des opérations arithmétiques : * , / , % , + , -
    // println(3+10*2%4-8/5)

    // Incrémentation et decrémentation
    /*
    var i = 1
    i += 1       // i = i + 1
    i++
    println(i)
    i -= 1       // i = i - 1
    i--
    println(i)
    */

    /*
    var b:Boolean
    b = 3<8
    println(b)
     */

    // Autres opérations de comparaison : >  <  >=  <=  == !=
    // opérations logiques : &&   ||   !   xor

    // range : in .. (détermine une plage de valeurs)
    //  val age = 17
    //  println(age in 10..20)


// **************************************************************
// **************************************************************

// 5. Conditions :  IF  / ELSE / WHEN

    // IF ... ELSE
    /*
    print("Veuillez saisir votre age : ")
    var age: Int = readLine()!!.toInt()

    if (age < 60) {
        println("Vous êtes toujours jeune !")
    } else println("Vous pouvez prendre votre retraite !")
    */

    // IF ... ELSE IF
    /*
    print("Veuillez saisir votre note : ")
    var note: Double = readLine()!!.toDouble()

    if (note >= 18) {
        println("Très bien")
    } else if (note in 14..18) {
        println("Bien")
    } else if (note in 12 .. 14) {println("Assez bien")
    } else println("passable")
    */


    // WHEN : semblable au "switch case" de Java
    /*
    print("Entrer un nbre pour choisir votre plat : ")
    var foodID:Int = readLine()!!.toInt()

    when(foodID){

        1->{ print("Sandwich") }
        2->{ print("Pizza") }
        3->{ print("Salade") }
        else-> { print("Harira") }
    }
    */

/*
    // IF imbriqué (nested IF statement)

    print("Veuillez saisir votre note : ")
    var note: Double = readLine()!!.toDouble()

    if (note >= 18) {
        if (note == 20.0) {
            println("Excellent")
        } else {
            println("Très bien")
        }
     }
*/

/*
    val isMarried = true
    var age = 34

    // OPERATION TERNAIRE
    var isQualified = if(isMarried && age > 18) 1 else 0
    println(isQualified)

    // Autre utilisation de l'opérateur WHEN
    var isOld = when(age){
        60->true
        else->false
    }
    println(isOld)
*/


// **************************************************************
// **************************************************************

// 6. Boucles :  FOR  / WHILE / DO WHILE

    /*
    println("Start a new FOR loop")
    for(i in 1..5){
        println("Hello world $i")
    }

    println("Start a new FOR loop")
    for(i in 0..20 step 2){
        println(i)
    }

    println("Start a new FOR loop")
    for(i in 20 downTo 0){
        println(i)
    }


    println("Start a new WHILE loop")
    var i = 1
    while (i<=10){
        println(i)
        i++
    }

    println("Start a new DO WHILE loop")
    var a = 1
    do{
        println(a)
        a+=1
    }while(a<=10)
*/


// **************************************************************
// **************************************************************

// 7. Tableaux :

    /*
    var tab:Array<String> = Array(3) {""} // Créer un tableau en précisant sa taille

    // var tab:Array<String> = arrayOf("aa", "bb", "cc") // utiliser la fonction "arrayOf(...)" qui permet
    // de créer un tableau en initialisant ces éléments par des valeurs

    // Initialisation
    for(i in 0..2) {
        tab[i] = readLine()!!.toString()
    }
    // Parcours pour l'affichage
    for(i in tab.indices) {
        println("Element $i est : ${tab[i]}")
    }
    */

// **************************************************************
// **************************************************************

// 8. Chaînes de caractères : String

    /*
    val msg = "Welcome to Kotlin"
    val name = "Reda"

    val message1 = msg + " " + name
    val message2 = "$msg $name"
    println(message1)
    println(message2)
    println(message1[0])
    println(message1.toLowerCase())
    println(message1.toUpperCase())

    val a = "       Salam"
    println(a.trim()) // enlève les espaces au début de la chaîne

    val tokens:List<String> = msg.split(" ")
    for(t in tokens){  // boucle for each
        if(! t.contains("to"))
            println("Token : $t")
    }
*/


// **************************************************************
// **************************************************************

// 9. ArrayList

    /*
    // Création d'une ArrayList
    var mylist:ArrayList<String> = ArrayList()

    // Ajout des éléments à la ArrayList créée
    for(i in 1..3){
        mylist.add(readLine()!!.toString())
    }

    // Parcours de l'Arraylist via une boucle "for each" (pour afficher ses éléments)
    for(e in mylist){
        println(e)
    }

    // Parcours avec une boucle for (en utilisant x until y)
    for(i in 0 until mylist.size){
        println(mylist.get(i))
    }

     */


// **************************************************************
// **************************************************************

// 10. LinkedList

    /*
    var mylinkedlist:LinkedList<String> = LinkedList()

    for(i in 1..3){
        mylinkedlist.add(readLine()!!.toString())
    }

    for(e in mylinkedlist){
        println(e)
    }

     */


// **************************************************************
// **************************************************************

// 11. HashMap

    /*
    var myMap = HashMap<Int,String>()
    myMap[1] = "Ahmed"
    myMap[2] = "Amine"
    myMap[3] = "Anas"

    myMap[1] = "Rachid"

    println("ID 1 is : ${myMap[1]}")

    // parcours des keys de la map (myMap.keys retourne un Set) et affichage de leur valeur
    for(key in myMap.keys)
        println("$key : ${myMap[key]}")

    */


// **************************************************************
// **************************************************************

// 12. Mutable vs Immutable


    // immutable : you cannot update, you cannot add more
    var listOfFruits:List<String> = listOf("Ananas" , "Banane" , "Pomme")
    for(fruit in listOfFruits) println(fruit)


    // mutable : you can update, you can add more
    var listOfFruits2:MutableList<String> = mutableListOf("Ananas" , "Banane" , "Pomme")
    listOfFruits2[0] = "Orange"
    for(fruit in listOfFruits2) println(fruit)





// **************************************************************
// **************************************************************

// 13. Fonctions


/*
    println( addNumbers(1.5 , 5.56) )
    println( addNumbers(21.3) )
    println( addNumbers(y=14.2) )
    println( addNumbers() )


    displayInfo(names = *arrayOf("Ahmed" , "Ali" , "Adil"))

 */

    // Lambda function call
  //  println(sum(3,4))

    /*
    // Lambda expression for collections
    var listOfNumbers = listOf<Int>(1, 54, 87, 23)
    listOfNumbers.forEach{ number ->
        println(number)
    }

     */


    }





fun addNumbers(x:Double=1.0 , y:Double=1.0):Double{
    return x + y
}

// variable number of arguments
fun displayInfo( vararg  names:String){
    for(name in names)
        println(name)
}


// Lambda function definition
val sum = { nb1:Int , nb2:Int -> nb1+nb2 }
