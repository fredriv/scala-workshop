package com.schibsted

import org.scalatest.exceptions.TestFailedException
import org.scalatest.matchers.Matcher

package object koans {

  /*
   * =================================
   *           Helper methods
   * =================================
   */
  def __ : Matcher[Any] = throw new TestFailedException("Please replace '__' with your answer/implementation", 1)

  def ??? : Nothing = throw new TestFailedException("Please replace '???' with your answer/implementation", 1)
}
