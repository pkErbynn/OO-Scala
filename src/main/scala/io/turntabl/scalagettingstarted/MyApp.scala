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


    def isWeekendDay_?(day: String) = day match {
        case "saturday" | "sunday"  => true
        case  _ => false
    }
    isWeekendDay_?("monday")


    def areWeekendDays_?(days: String*) = days map(d => isWeekendDay_?(d))
    areWeekendDays_?("monday", "tuesday", "saturday")

    // printing with foreach
    areWeekendDays_?("monday", "tuesday", "saturday").foreach(println)


    def numOfTimes(word: String, times: Integer) = print( word * times)
    numOfTimes("erbynn", 5)


}
