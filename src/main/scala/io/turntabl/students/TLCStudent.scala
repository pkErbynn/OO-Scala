package io.turntabl.students

import java.time.Year

class TLCStudent(val fname: String,
                 val lname: String,
                 val githubURL: String = "https://github.com/turntabl",
                 year: Int = 2016   // constructor param and not instance field...
                ) extends TurntablEmployee{
  override def toString: String = s"$fname $lname"

  def termOfService =  Year.now.getValue - year

  def sameTermOfService_?(student: TLCStudent, year: Int): Boolean = student.termOfService equals termOfService   // since many params, hence ":"

  import io.turntabl.grades._
  // def evaluated at each construction...for val, once
  val topGrade: Grade = Grade("Financial Basics", 95.5)

  override val GetWorkload: String = "works supper hard :)"

}

// factory method (ie. apply()) with companion object
// i think, static members goes in here
object TLCStudent{    // object + same class name.....hence, companion
  def apply(fname: String, lname: String,
            githubURL: String): TLCStudent = new TLCStudent(fname, lname, githubURL)  // factory(), hence no `new` keyword in construction
  def say() =  "static...."
}



