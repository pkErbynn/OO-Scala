package io.turntabl.collections

class collectionsScala {
  val n = ("john", "scala")
  var name, fav = n

  val capitals = Map("ghana" -> "accra",
    "uk" -> "london",
    "south afric" -> "cape town"
  )
  val moreCapitals = capitals + ("a" -> "b", "c" -> "d")

  capitals.getOrElse("norway", "unknown")

  val names = Set("justice", "onga", "peter", "samuel", "samuel")
  names count (e => e == "samuel"); // names count(_=="samuel")

  val nameList = List("raph", "anthony", "grace", "boyd", "selase")
  val result = nameList.foreach(println)

  val res = nameList.foreach(e => e.length > 6)
  println(res)

  // nameList.foreach(e => if(e.length >= 6) println(e))
  val moreThan6Letters = nameList.filter(e => e.length >= 6).foreach(println) // intermediate op to terminal


  //  val moreThan6LettersCount = nameList.foreach(_.count)
  val moreThan6LettersCount = nameList.filter(e => e.length > 6)
  println(moreThan6LettersCount)

  val moreThan6CharCount = nameList.count(e => e.length > 5)
  println(moreThan6CharCount)
}



