
// Une classe qui a comme objectif unique la représentation des données (pas de méthodes)
data class  Person(val name:String , val age:Int , val gender:String)

fun main(){

    val person = Person("Ahmed" , 14 , "Male")

    println("Name : ${person.name}")
    println("Age : ${person.age}")
    println("Gender : ${person.gender}")

}