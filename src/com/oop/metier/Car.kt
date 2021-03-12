package com.oop.metier

import java.util.*

// PREMIERE MANIERE

open class Car(var type:String="NoType" , var model:Int=0 , protected var price:Double=0.0) {


    init{
        println("Un objet de la classe Car a été instancié (créé)")
    }



     open fun getCarPrice(miles:Double):Double{
        return price - miles*0.005
    }

    // version lambda de getCarPrice
    var Carprice = {miles:Double -> price - miles*0.005}


    companion object{
        //val va:Int = 2
        fun test():Int = 1
        /*
        fun test():Int{
            return 1 ;
        }
         */
    }

    // Getter
    fun getPrice2() = price

    fun getPrice3():Double{
        return price
    }


    // Setter
    fun setPrice2(p:Double) {price = p}


}




// DEUXIEME MANIERE : Classique
/*
open class Car(){ // "open" afin de la rendre héritable

    public var type:String?=null // la visibilité par défaut est public
    var model:Int?=null
    private var price:Double?=null // on peut mettre "private" ou "protected"


    // constructeur
    constructor(type:String , model:Int , price:Double):this(){
        this.type = type
        this.model = model
        this.price = price
    }

    open fun getCarPrice(miles:Double):Double{
        return price!! - miles*0.005
    }

    // version lambda de getCarPrice
    var Carprice = {miles:Double -> price!! - miles*0.005}


    fun getPrice():Double{
        return this.price!!
    }

}
*/


fun main(){


    val car1 = Car("BMW" , 2019 , 30000.0)
    println(car1.type)
    car1.model=2016
    println(car1.model)
    println(car1.getPrice2())
    println(car1.getCarPrice(12000.7))
    println(car1.Carprice(12000.7))
    Car.test()

    /*
    val car2 = Car("Mercedes" , 2017 , 29000.0)
    println(car2.type)
    println(car2.model)
    println(car2.price)
    println(car2.getCarPrice(87452.7))
    println(car2.Carprice(87452.7))
    */


    val listOfCars = mutableListOf<Car>()
    listOfCars.add(Car("BMW" , 2019 , 30000.0))
    listOfCars.add(Car("Mercedes" , 2017 , 29000.0))

    // listOfCars.forEach { car -> println(car.type) }

    for(c in listOfCars){
        println( c.type )
    }



}