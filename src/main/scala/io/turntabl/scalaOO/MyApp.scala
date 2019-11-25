package io.turntabl.scalaOO

import io.turntabl.students.TLCStudent

object MyApp extends App {
    val student1 = new TLCStudent("john", "erbynn", "github.com/pkerbynn", 2015)
    val student2 = new TLCStudent("anthony", "erbynn")

    println(student1)
    println(student2)

}
