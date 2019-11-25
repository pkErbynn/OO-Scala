package io.turntabl.scalagettingstarted

object OOTest {
  3.+(3)

  class Person

  val person = new Person
  person.toString


  class Person2(val fn: String, val ln: String)
  val p = new Person2("john", "erbynn")
  p.fn
  p.ln

  // with default val
  class Car(val color: String, val brand: String = "corola") {
    println(s"$color $brand constructed")

    def this(color: String) = this(color, "wine")
  }

  val car = new Car("red", "toyota")
  car.brand
  val car2 = new Car("blue")

  // no field Car
  class Car2(color: String, brand: String = "corola") {
    val carrr = s"$color $brand constructed"
  }

  val c = new Car2("white", "foo")
  c.carrr

  // constructor with field
  class Person3(fname: String, lname: String){
    val fullname = s"$fname  $lname"
  }
  val p = new Person3("raph", "erbynn")

  class Persion4(fn: String, ln: String){
    def isRelated(p: Persion4) = p.ln eq p.fn
  }
  val p = new Persion4("john", "erbynn")
  val q = new Persion4("raph", "erbynn")
  p isRelated q

}
