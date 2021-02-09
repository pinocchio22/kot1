package com.example.kot1

data class Ticket(val companyName : String, val name : String, var date : String, val seatNum : Int)
// toString(). hashCode(), equals(), copy() - 자동생성

class TicketNomal(val companyName : String, val name : String, var date : String, val seatNum : Int)
// dataclass가 아닌 그냥 class로 만들고 출력시에는 데이터 주소값이 출력된다.


fun main(){
    val ticketA = Ticket("koreanAir", "humva", "2020-02-15", 14)
    val ticketB = TicketNomal("koreanAir", "humva", "2020-02-15", 14)

    println(ticketA)
    println(ticketB)
}