package io.turntabl.scalaOO

import io.turntabl.grades.Grade
import io.turntabl.students.TLCStudent

object MyApp extends App {
  val student1 = new TLCStudent("john", "erbynn", "github.com/pkerbynn", 2015)
  val student2 = new TLCStudent("anthony", "erbynn", null, 2012)

  println(student1)
  println(student2)

  val res = student1.termOfService(2015)
  println(s"Term of service of ${student1.fname}: $res")

  val res2 = student1.sameTermOfService_?(student2, 2014)
  println(res2)

  private val str: String = TLCStudent.say()
  println(str)

  val topGrade: Grade = student1.topGrade()
  println(s"TopGrad: $topGrade")
  private val subject: String = student1.topGrade().subject
  private val grad: Int = student1.topGrade().grad
  println(s"Grad => Stubject : $grad => $subject")
}
