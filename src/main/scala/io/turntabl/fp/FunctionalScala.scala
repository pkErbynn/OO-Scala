package io.turntabl.fp

object FunctionalScala extends App {

  val triple = (i: Int) => i * 3
  println(triple(4))

  val stringLength = (str: String) => str.length
  println(stringLength("Erby"))

  val stringSpaced = (str: String) => str count (_ == ' ')
  println("count: " + stringSpaced("Erbynn john kwesi"))

  val ApplyToString = (str: String, fxn: (String => Int)) => fxn(str)
  println(ApplyToString("john erbynn", stringSpaced))

  val op = (x: Int, y: Int, operator: String) => operator match {
    case "add" => x + y
    case "subtract" => x - y
    case "multiply" => x * y
    case _ => "invalid operator"
  }
  val calculate = (operator: String) => op(4, 5, "add")
  println(s"Add: ${calculate("add")}")
  println(s"Subtract: ${calculate("subtract")}")
  println(s"Multiply: ${calculate("multiply")}")
  println(s"Error: ${calculate("default")}")

// alt
  val calculate2 = (operator: String) => operator.toLowerCase match {
    case "add" => (x: Int, y: Int) => x + y
    case "subtract" => (x: Int, y: Int) => x - y
    case "multiply" => (x: Int, y: Int) => x * y
    case "divide" => (x: Int, y: Int) => x / y
    case _ => "invalid operator"
  }
  val res = calculate2("add");
  println(s"add $res")

}
