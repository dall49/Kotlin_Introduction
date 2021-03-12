
// INTERFACE
interface CreditCard{
    val cardNumber : String

    fun score(age:Int)
}


class MasterCard(override val cardNumber: String) :CreditCard{

    override  fun score(age:Int){
        if(age>50) println("Negative")
        else println("Positive")
    }
}


class Visa(override val cardNumber: String) :CreditCard{

    override  fun score(age:Int){
        if(age>60) println("Negative")
        else println("Positive")
    }
}


// Delegation
class PayPal(client:CreditCard):CreditCard by client{

    fun printNumber(){
        println(this.cardNumber)
    }
}






// CLASSE ABSTRAITE
abstract class CreditCard2{

    fun creditID():String{
        return "4357357357"
    }

    abstract fun newCredit() // Méthode abstraite
}


class UserInfo: CreditCard2() {

    override fun newCredit(){
        println("new card created")
    }
}








fun main(){

    var visa = Visa("12465465464")
    visa.score(60)

    var mc = MasterCard("658787876656565")
    mc.score(60)

    // Delegation
    var payPal = PayPal(mc)
   // println(payPal.cardNumber)
    payPal.printNumber()
    payPal.score(60)

}