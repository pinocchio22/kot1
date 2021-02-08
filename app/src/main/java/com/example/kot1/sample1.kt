package com.example.kot1

fun main(){
    helloworld()
    println(add(4,5))

    // 3. String Template

    val name = "choi"
    val lastName = "nice"
    println("my name is ${name + lastName}I'm 23") //띄어쓰기가 필요하면 대괄호

    println("is this true? ${1==0}")

    println("this is 2\$a") // "\"는 escape문자

    checkNum(1)

    forAndWhile()

    nullcheck()
}

// 1.함수

fun helloworld() : Unit{    //리턴타입이 없으면 생략가능(Unit)
    println("Hello world!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
// val = value

fun hi(){

    val a : Int = 10
    var b : Int = 9

    b = 100

    val c = 100
    var d = 100
    var name : String = "choi"
}

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int {

    if( a > b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a: Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1-> 1
        2-> 2
        else-> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement : 코틀린에서 모든 함수는 Expression (return 값이 존재)

// 5. Array vs List

// Array

// List 1.List 2.MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",2,3f)
    val list2 = listOf(1,"d",2,3L)

    array[0] = 3
    // list[0] = 2 는 불가능
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

// 6. For / While

fun forAndWhile(){
    val students = arrayListOf("a","b","c","d")

    for(name in students){
        println("${name}")
    }

    for ((index,name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for ( i in 10 downTo 1){
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("current index : ${index}")
        index++
    }
}

// 7.Nullable / NonNull

fun nullcheck(){
    //NPE :NUll pointer Exception

    var name: String = "choi"
    var nullname : String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullname?.toUpperCase()

    // ?:

    val lastName : String? = null
    val fullName = name +" "+ (lastName ?: "NO lastName")
    println(fullName)


    // !!:


}

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()


    val email : String? = "choi@nana.com"
    email?.let{
        println("my email is ${email}")
    }
}





















