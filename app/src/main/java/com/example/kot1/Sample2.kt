package com.example.kot1

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있ㄴ느 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int) - Int 자리에 Lamda를 이용하여 fun을 넣을 수 있음
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number*number} // 방법1

val nameAge = {name : String, age : Int ->  //방법2
    "my name is ${name}, I'm ${age}"
}


fun main(){
    println(square(12))
    println(nameAge("choi",12))
    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("jin",19))

    println(calculateGrade(45))


    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))

    println(invokeLamda({it > 3.22}))
    println(invokeLamda{it > 3.22})
    // 위의 두 식은 같음. 즉, 괄호 생략가능


}

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it}years old"}  // 파라미터가 하나일때는 it으로 대체가능
    return name.introduceMyself(age)
}

// 람다의 Return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "good"
        else -> "don't know"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

//
















