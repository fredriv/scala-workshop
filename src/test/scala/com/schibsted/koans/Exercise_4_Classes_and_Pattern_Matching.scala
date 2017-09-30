/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 *
 * Several tests have been borrowed from Scala Koans. Scala Koans is licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License
 */
package com.schibsted.koans

import org.scalatest.{FunSuite, Matchers}

/**
  * Make the following tests pass, typically by replacing a specific value,
  * '__' or '???' with the correct value or implementation.
  *
  * Run tests in IntelliJ from Run menu or with Ctrl+Shift+F10 / Ctrl+Shift+R,
  * or with Gradle on the command line:
  *
  * ~/gradlew test -t
  */
class Exercise_4_Classes_and_Pattern_Matching extends FunSuite with Matchers {

  /*
   * =================================
   *              Optional
   * =================================
   */

  test("Get the length of the String if it's there, otherwise -1") {
    def length(str: Option[String]): Int = str.map(_.length).getOrElse(-1) // fix this

    // can you solve this in multiple ways?

    assert(length(Some("text")) === 4)
    assert(length(None) === -1)
  }

  /*
   * =================================
   *           Pattern matching
   * =================================
   */

  test("Match the types") {
    val elements = List(23, "Hello", 8.5, 'q')

    val types = elements map {
      case i: Int => "Int"
      case s: String => "String"
      case d: Double => "Double"
      case c: Char => "Char"
      case _ => "failed" // fix this
    }

    assert(types === List("Int", "String", "Double", "Char"))
  }

  test("Extract the value from case class") {
    case class Person(name: String, age: Int)

    val person = Person("Fredrik", 40)

    val name = person match {
      case Person(name, age) => name
      case _ => "failed" // fix this
    }

    assert(name === "Fredrik")
  }

  test("Match the first element of the list") {
    val list = List("Scala", "is", "powerful")

    val first = list match {
      case first :: rest => first
      case _ => "failed" // fix this
    }

    assert(first === "Scala")
  }

  test("Match the second element of the list") {
    val list = List("Scala", "is", "powerful")

    val second = list match {
      case _ :: second :: rest => second
      case _ => "failed" // fix this
    }

    assert(second === "is")
  }

}
