import java.util.*

fun main(){
//    var i = 0
//    do{
//        println(i)
//        i++
//    }while(i % 3 == 0 && i<= 10)


    // CALCULATOR
    val obj = Scanner(System.`in`)

    do {
        println("PLEASE ENTER NUMBER 1")
        var num1 = obj.nextDouble()
        println("PLEASE ENTER NUMBER 2")
        var num2 = obj.nextDouble()
        println("PLEASE ENTER OPERATOR")
        val operator = obj.next()[0]
        val result = when(operator){
            '+' -> println(num1+num2)
            '-' -> println(num1-num2)
            '*' -> println(num1*num2)
            '/' -> println(num1/num2)
            else -> throw IllegalArgumentException("cannot perform")
        }


        println("DO YOU WANT TO PRINT THE RESULT AGAIN? TYPE yes or no")
        val str = obj.next()
    }while (str == "yes" )





}