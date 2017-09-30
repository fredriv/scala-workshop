/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 *
 * Several tests have been borrowed from Scala Koans. Scala Koans is licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License
 */
package com.schibsted.koans

import org.scalatest.{FunSuite, Matchers}

import scala.collection.immutable.{HashMap, HashSet, TreeMap, TreeSet}

class Exercise_5_Collections_part_II extends FunSuite with Matchers {

  test("Split the odd and even numbers") {
    val numbers = List(17, 42, 314)

    val (even, odd) = numbers.partition( ??? ) // fix this

    assert(even === List(42, 314))
    assert(odd === List(17))
  }


  val quote =
    """Try not.
      |Do... or do not.
      |There is no try.""".stripMargin

  test("Find the words in the quote") {
    val lines = quote.lines.toList

    // try doing it both with a flatMap and a for comprehension
    val words: List[String] = ??? // fix this

    words should be (List("Try", "not.", "Do...", "or", "do", "not.", "There", "is", "no", "try."))
  }

  test("Find the length of the words in the quote") {
    val lines = quote.lines.toList

    // try doing it both with a flatMap and a for comprehension
    val lengths: List[Int] = ??? // fix this

    lengths should be (List(3, 4, 5, 2, 2, 4, 5, 2, 2, 4))
  }


  test("Collect just the numbers") {
    val elems: List[Any] = List(17, "This is an String", 42, 314)
    val result = elems.collect {
      case _ => ???
    }
    assert(result === List(17, 42, 314))
  }

  test("Collect just the even numbers") {
    val elems: List[Any] = List(17, "This is an String", 42, 314)
    val result = elems.collect {
      case _ => ???
    }
    assert(result === List(42, 314))
  }

  test("Collect just the numbers and add 1 to them") {
    val elems: List[Any] = List(17, "This is an String", 42, 314)
    val result = elems.collect {
      case _ => ???
    }
    assert(result === List(18, 43, 315))
  }

  test("Retrieve all nested categories with their parent categories separated by a dot (.)") {
    val s = "C1 > C2 > C3"
    val categories = s.split(">").map(_.trim())

    val categoryTree: List[String] = ??? // hint: use scanLeft

    assert(categoryTree === List("C1", "C1.C2", "C1.C2.C3"))
  }

  test("Collections are equal when") {
    // they are in the same overall category (Seq, Set, or Map)
    assert(List(1, 2, 3) === Vector(1, 2, 3))
    assert(HashSet(3, 1, 2) === TreeSet(1, 2, 3))
    assert(HashMap(1 -> "one", 2 -> "two") === TreeMap(2 -> "two", 1 -> "one"))

    // they contain the same elements (as defined by ==)
    assert(List(1, 2, 3) != List(1, 2, 3, 4))

    // for sequences, the elements are in the same order
    assert(List(1, 2, 3) != List(3, 2, 1))

    // Arrays have no redefined equals method so they need some help
    assert(Array(1, 2, 3) != Array(1, 2, 3))
    assert(Array(1, 2, 3) sameElements Array(1, 2, 3))

    // Nested arrays
    assert(Array(Array(1, 2), Array(3)).deep == Array(Array(1, 2), Array(3)).deep)
  }

}
