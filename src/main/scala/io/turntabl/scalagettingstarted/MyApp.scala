package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, Pkay")

    val fname = "John"
    val town = "Elmina"
    print(s"$fname was born in $town")

    // can try in scratch pad
    def threeTimes(name: String) = name * 3     // 3 * name...doesnt work
    threeTimes("Erbynn")

    def even_?(num: Int) = num % 2 == 0
    even_?(3)

    def odd_?(num: Int)= !even_?(num)


    def wordsToLowerCase(words: String*) = words map (_.toLowerCase())
//    def wordsToLowerCase(words: String*) = words.map(_.toLowerCase())        // similar to java
    wordsToLowerCase("HEY", "JOHN")


    def isWeekendDay(day: String) = day match {
        case "monday" | "tuesday" | "wednesday" | "thursday" | "friday" => true
        case  _ => false
    }
    isWeekendDay("monday")
}
