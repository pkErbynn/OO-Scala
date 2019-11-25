package io.turntabl.scalagettingstarted

import java.time.Year

class TLCStudent(val fname: String,
                 val lname: String,
                 val githubURL: String = "https://github.com/turntabl",
                 year: Int = Year.now.getValue
                ){

  override def toString: String = s"$fname $lname"

//  def this(year: String) = this(year, new java.util.Date().toString)

  val thisYear: Int = Year.now.getValue
  def termOfService(year: Int) =  thisYear - year

  def sameTermOfService_?(student: TLCStudent) = student.thisYear

}

// factory with companion object
object TLCStudent{
  def apply(fname: String, lname: String, githubURL: String): TLCStudent = new TLCStudent(fname, lname, githubURL)
}

