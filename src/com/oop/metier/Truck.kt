package com.oop.metier

class Truck:Car {

    var subType:String?=null

    constructor(type:String , model:Int , price:Double , subType:String):super(type , model , price){
        this.subType = subType
    }

    override fun getCarPrice(miles: Double): Double {
        return price!! - miles*0.010
    }

    fun getCarPriceWrapper(miles:Double):Double{
        // return super.getCarPrice(miles) // retourne la méthode de la classe mère "Car"
        return this.getCarPrice(miles) // retourne la méthode de la classe courante "Truck"
    }


}




fun main(){

    val t1 = Truck("BMW" , 2019 , 30000.0, "Remoque")
    println(t1.type)
    println(t1.model)
    println(t1.getPrice2())
    println(t1.subType)
    println("${t1.getCarPrice(12000.7)} $")

    val t2 = Truck("Mercedes" , 2017 , 29000.0, "Garbage")
    println(t2.type)
    println(t2.model)
    println(t2.getPrice2())
    println(t2.subType)
    println("${t2.getCarPrice(87452.7)} $")

}