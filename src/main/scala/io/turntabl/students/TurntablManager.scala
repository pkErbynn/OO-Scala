package io.turntabl.students

class TurntablManager extends TurntablEmployee{
  override val GetWorkload: String = "works very hard"

  override def printWorkload(ttEmployee: TurntablEmployee): Unit = super.printWorkload(ttEmployee)
}
