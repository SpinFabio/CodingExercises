fun main() {
    var greetings=birthdayGreetings(years=110*10)
    println(greetings)
}

fun birthdayGreetings(name:String="to You",years:Int ):String{
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $years years old!"
    return nameGreeting+'\n'+ageGreeting
}