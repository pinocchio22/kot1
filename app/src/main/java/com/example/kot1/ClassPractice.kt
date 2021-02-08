package com.example.kot1





open class Human (val name : String = "Anonymous") {

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old ")
    }

    // init 블록이 제일먼저 생성
    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("Tihs is so YUMMMMYYY")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){

    override fun singASong(){
        println("랄라라")
        println("my name is :${name}")
    }
}





fun main(){
//    val human = Human("choi")
//
//    val stranger = Human()
//
//    human.eatingCake()

    val mom = Human("kuri", 52)

//    println("this human's name is ${human.name}")

    val korean = Korean()
    korean.singASong()
}