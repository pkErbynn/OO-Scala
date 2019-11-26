package io.turntabl.students

abstract class TurntablEmployee {
  val GetWorkload: String
//  def printWorkload(ttEmployee: TurntablEmployee) = println(s"$ttEmployee's workload: $GetWorkload")
  def termOfService: Int
}
