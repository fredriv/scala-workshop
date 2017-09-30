/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 *
 * Several tests have been borrowed from Scala Koans. Scala Koans is licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License
 */
package com.schibsted.koans

import org.scalatest.{FunSuite, Matchers}

import scala.util.control.NonFatal

/**
  * Make the following tests pass, typically by replacing a specific value,
  * '__' or '???' with the correct value or implementation.
  *
  * Run tests in IntelliJ from Run menu or with Ctrl+Shift+F10 / Ctrl+Shift+R,
  * or with Gradle on the command line:
  *
  * ~/gradlew test -t
  */
class Exercise_2_Expressions_Methods_and_Functions extends FunSuite with Matchers {

  /*
   * =================================
   *           Expressions
   * =================================
   */

  test("if expressions return a value") {
    val char = '7'
    val isLetter = if (char.isLetter) "Letter" else "Something else"

    assert(isLetter === "Something else") // fix this
  }

  test("for the odd numbers") {
    val odd = for (i <- 0 until 10) yield i * 2 + 1

    assert(odd === List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19))
  }

  test("try-catch blocks also return a value") {
    val result = try {
      if (true) new RuntimeException("foo")
      42
    } catch {
      case NonFatal(ex) => -1
    }

    assert(result === 42) // fix this
  }

  /*
   * =================================
   *             Methods
   * =================================
   */

  test("A method's last statement will be what is returned, there is no need for a `return` keyword") {
    def add(a: Int, b: Int): Int = {
      a + b // Implement this
    }

    assert(add(2, 2) === 4)
  }

  test("Greetings") {
    def greeting(name: String): String = s"Hello $name!" // implement this

    assert(greeting("Joan") === "Hello Joan!")
    assert(greeting("SPT") === "Hello SPT!")
  }

  test("A method can have an explicit early `return`, for example to handle special input") {
    def safeReverse(s: String): String = {
      // fix handling of `null` values by adding early return
      if (s == null)
        return null

      s.reverse
    }

    // Can you think of a better way to handle this than with an explicit return?

    assert(safeReverse("foo") === "oof")
    assert(safeReverse(null) === null)
  }


  /*
   * =================================
   *             Functions
   * =================================
   */

  test("Functions can be assigned to variables") {
    val add: (Int, Int) => Int = (a: Int, b: Int) => a + b // implement this

    assert(add.apply(2, 2) === 4) // can call function with .apply
    assert(add(10, 5) === 15)     // or drop it (Scala compiler inserts it automagically)
  }

  test("Small increments") {
    val increment: (Int) => Int = (i: Int) => i + 1 // implement this

    assert(increment(1) === 2)
    assert(increment(4) === 5)
  }

  test("Can you hear me?") {
    val shout: (String) => String = (s: String) => s.toUpperCase // implement this

    assert(shout("Hello") === "HELLO")
    assert(shout("Can you hear me?") === "CAN YOU HEAR ME?")
  }

  test("Partial functions are only defined for some values in the input domain") {
    val letterOrDigit: PartialFunction[Char, String] = {
      // implement this
      case c if c.isLetter => "Letter"
      case d if d.isDigit => "Digit"
    }

    assert(letterOrDigit('a') === "Letter")
    assert(letterOrDigit('7') === "Digit")
    assert(letterOrDigit.isDefinedAt(' ') === false)
  }

}
