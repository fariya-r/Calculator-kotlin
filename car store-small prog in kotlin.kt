import java.util.*

fun main(){


    //program that take email and ph number from user, show a list of cars with prices to user,ask user
    // if he want to buy any car? then asks if he wants to pay on instalments or all at a time?
    //if on instalments he has to deposit 2000rs as first instalment, or if he deposit more it will show
    // remaining to user
    val obj = Scanner(System.`in`)
    println("PLEASE ENTER YOUR EMAIL: ")

    var email = obj.next()
    println("PLEASE ENTER YOUR PHONE NUMBER: ")

    var ph = obj.nextDouble()
    val cars = arrayOf("MUSTANG ","FERRARI ", "HONDA ", "LEMOZINE ")
    println("THE AVAILABLE CARS ARE: ")
    println(cars.joinToString ())
    val prices = arrayOf(10000 , 20000 ,30000 , 40000)
    println(prices.joinToString ())

    println("DO YOU WANT TO BUY ANY CAR? TYPE yes OR no: ")
    val str1 = obj.next()
    if(str1 == "yes"){
        println("CHOOSE ANY OF THE CARS: ")
        println(cars.joinToString ())
        println(prices.joinToString ())

    }


    var choose = obj.next()





    println("DO YOU WANT TO BUY ON INSTALEMENTS OR FULL PRICE AT A TIME? TYPE instalment FOR INSTALMENTS AND TYPE full FOR PAYING FULL PRICE: ")
    val str2 = obj.next()


    if(str2 == "instalment"){
        println("YOU HAVE TO PAY ATLEAST 2000 AS FIRST INSTALMENT:")
        println("ENTER THE AMOUNT YOU WANT TO PAY: ")
        val pay = obj.nextInt()
        if(pay < 2000){
            println("SORRY INVALID AMOUNT")
        }else{
            println("PLEASE REASSURE YOUR CHOICE:")
            println(cars.joinToString())
            var chosed = obj.next()
            println("YOUR REMAINING PAYMENT: ")
            if(chosed == "MUSTANG"){
                println(10000 - pay)
            }else if(chosed == "FERRARI"){
                println(20000 - pay)
            }else if(chosed == "HONDA"){
                println(30000 - pay)
            }else if( chosed == "LEMOZINE"){
                println(40000 - pay)
            }



        }

    }else{
        println("VISIT THE OFFICE! THANK YOU!")
    }





}



