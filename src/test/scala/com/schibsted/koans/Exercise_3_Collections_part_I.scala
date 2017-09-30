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
class Exercise_3_Collections_part_I extends FunSuite with Matchers {

  /*
   * =================================
   *            Filtering
   * =================================
   */

  test("Find the numbers below 100") {
    val numbers = List(17, 314, 123, 42, 100)

    val numbersBelowHundred = numbers.filter( ??? ) // fix this
    assert(numbersBelowHundred === List(17, 42))
  }

  test("Find people whose name does not start with the letter 'L'") {
    val names = List("Luke", "Leia", "Anakin", "Han")

    val result = names.filterNot( ??? ) // fix this
    assert(result === List("Anakin", "Han"))
  }

  test("Find teens") {
    case class Person(name: String, age: Int)
    val people = List(Person("Luke", 19), Person("Leia", 19), Person("Anakin", 42), Person("Han", 29))

    val teens = people.filter( ??? ) // fix this
    assert(teens === List(Person("Luke", 19), Person("Leia", 19)))
  }


  /*
   * =================================
   *          Transformation
   * =================================
   */

  test("Find lengths of words") {
    val words = "The answer is 42".split(" ")

    val lengths = words.map( ??? ) // fix this
    assert(lengths === List(3, 6, 2, 2))
  }

  test("Find names of people") {
    case class Person(name: String, age: Int)
    val people = List(Person("Luke", 19), Person("Leia", 19), Person("Anakin", 42), Person("Han", 29))

    val names = people.map( ??? ) // fix this
    assert(names === List("Luke", "Leia", "Anakin", "Han"))
  }

  test("Find names of teens") {
    case class Person(name: String, age: Int)
    val people = List(Person("Luke", 19), Person("Leia", 19), Person("Anakin", 42), Person("Han", 29))

    val names = people.filter( ??? ) // fix this
    assert(names === List("Luke", "Leia"))
  }


  /*
   * =================================
   *             Sorting
   * =================================
   */

  test("Sort words by length") {
    val words = "The answer is 42".split(" ")

    val sorted = words // fix this - hint: sortBy
    assert(sorted === List("is", "42", "The", "answer"))
  }


  /*
   * =================================
   *             Aggregating
   * =================================
   */

  test("Find largest number below 100") {
    val numbers = List(17, 314, 123, 42, 100)

    val largestBelow100 = numbers(0) // fix this
    assert(largestBelow100 === 42)
  }

  test("Find average of numbers") {
    val numbers = List(17, 314, 123, 42, 100)

    val average = numbers(0) // fix this
    assert(average === 119)
  }

  test("Find longest word") {
    val words = "The answer is 42".split(" ")

    val longest = words(0) // fix this - hint: maxBy
    assert(longest === "answer")
  }

}
