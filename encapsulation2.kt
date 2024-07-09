import java.util.Scanner

fun main(){
    val obj = Form1()
    val input = Scanner(System.`in`)
    println("ENTER YOUR FIRSTNAME: ")
    var username = input.next()
    println("ENTER YOUR LASTNAME: ")
    var last = input.next()
    println("ENTER YOUR GENDER: ")
    var gender = input.next()
    println("enter your phone number: ")
    var phone = input.nextLong()
    println("ENTER YOUR EMAIL: ")
    var email = input.next()
    println("ENTER YOUR ADDRESS: : ")
    var address = input.next()
    obj.setfirstname(username)
    obj.getfirstname()
    obj.setlastname(username)
    obj.getlastname()
    obj.setphone(phone)
    obj.getphone()
    obj.setemail(email)
    obj.getemail()
    obj.setgender(gender)
    obj.getgender()
    obj.setaddress(address)
    obj.getaddress()
    obj.chkph()
    obj.authenticateEmail()






}
class Form1{
    private var firstname="ali"
    private var lastname = "raza"
    private var phone =111111111111
    private var email= "maria"
    private var gender="female"
    private var address= "jrwnla"

    fun setfirstname(firstname:String){
        this.firstname=firstname
    }
    fun getfirstname():String{
        return firstname
    }
    fun setlastname(lastname:String){
        this.lastname=lastname
    }
    fun getlastname():String{
        return lastname
    }
    fun setemail(email:String){
        this.email = email
    }
    fun getemail():String{
        return email
    }
    fun setphone(phone:Long){
        this.phone= phone
    }
    fun getphone():Long{
        return phone
    }
    fun setgender(gender:String){
        this.gender=gender
    }
    fun getgender():String{
        return gender
    }
    fun setaddress(address:String){
        this.address=address
    }
    fun getaddress():String {
        return address
    }

    fun authenticateEmail(){
        if(email.contains("@gmail.com")){
            println("welcome!!")
        }else{
            println("invalid email!!")
        }
    }


    fun chkph(){
        val phone = phone.toString()
       if(phone.length != 11){
           println("invalid phone number!")
       }


    }
    //gender , address



}