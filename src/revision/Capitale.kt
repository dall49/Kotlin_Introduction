package revision

class Capitale : Ville {

    lateinit var admin:String

    constructor(n:String, h:Int, c:String):super(n,h){
        admin = c
    }


    override fun afficher(){
        print("dfdfd")
    }


}