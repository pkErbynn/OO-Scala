package io.turntabl.students

import java.time.Year

class TLCStudent(val fname: String,
                 val lname: String,
                 val githubURL: String = "https://github.com/turntabl",
                 year: Int = Year.now.getValue    // constructor param and not field
                ){
  override def toString: String = s"$fname $lname"

  val thisYear: Int = Year.now.getValue
  def termOfService(year: Int) =  thisYear - year

  def sameTermOfService_?(student: TLCStudent, year:Int) = student.termOfService(year) eq termOfService(year)   // stu.thisYear.equal(thisYear)

  import io.turntabl.grades._
  def TopGrade() = Grade.apply("Java OO", 99)
}

// factory method (ie. apply()) with companion object
object TLCStudent{    // object + same class name.....hence, companion
  def apply(fname: String, lname: String,
            githubURL: String): TLCStudent = new TLCStudent(fname, lname, githubURL)  // factory(), hence no `new` keyword in construction
}



