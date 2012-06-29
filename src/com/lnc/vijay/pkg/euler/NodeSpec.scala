package com.lnc.vijay.pkg.euler

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.GivenWhenThen
import scala.collection.mutable.MutableList
import scala.io.Source
import java.io.File

@RunWith(classOf[JUnitRunner])
class NodeSpec extends FlatSpec with GivenWhenThen {

  "A leaf node" should "have value" in {
    val node = Node(200)
    assert(node.value === 200)
    assert(node.l === null)
    assert(node.r == null)
  }

  "A parent node" should "contain children" in {
    val node = Node(200, Node(100), Node(300))
    assert(node.value === 200)
    assert(node.l != null)
    assert(node.r != null)
    assert(node.l.value === 100)
    assert(node.r.value === 300)
  }

  "root node" must "give infix notation" in {

    given("a root node")
    val root = Node(60, Node(30, Node(10), Node(40)), Node(80, Node(70), Node(90)))
    when("infix notation is applied")
    var infixList = new MutableList[Int]
    val result = root.infix(infixList)
    then("sorted order of elements")
    println(infixList)
    assert(infixList.size > 0)
    assert(isOrdered(infixList))
  }

  "leaf node" must "have maxValue=value" in {
    given("leaf")
    val root = Node(100)
    when("calculate cost")
    val cost = root.maxValue
    then("")
    assert(100 === cost)
  }

  "A parent node" must "find mostprofitable cost" in {
    given("parent node")
    val root = Node(100, Node(20), Node(25))
    when("calculate most profitable route")
    val cost = root.maxValue
    then("return")
    assert(125 === cost)
  }

  "A root node" must "find mostprofitable position" in {
    given("root node")
    val root = Node(3, Node(7, Node(2, Node(8), Node(5)), Node(4, Node(5), Node(9))),
      Node(4, Node(4, Node(5), Node(9)), Node(6, Node(9), Node(3))))
    when("find maxValue")
    val cost = root.maxValue
    then("return")
    assert(23 === cost)
  }

  "A graph" must "find mostprofitable postion" in {
    given("graph String")
    val graphString = "75\n" +
      "95 64\n" +
      "17 47 82\n" +
      "18 35 87 10\n" +
      "20 04 82 47 65\n" +
      "19 01 23 75 03 34\n" +
      "88 02 77 73 07 63 67\n" +
      "99 65 04 28 06 16 70 92\n" +
      "41 41 26 56 83 40 80 70 33\n" +
      "41 48 72 33 47 32 37 16 94 29\n" +
      "53 71 44 65 25 43 91 52 97 51 14\n" +
      "70 11 33 28 77 73 17 78 39 68 17 57\n" +
      "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
      "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
      "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"
    val graph = Node(graphString)
    when("find maxValue")
    println(graph.value)
    val cost = graph.maxValue
    then("validate")
    println(cost)
    assert(1074 === cost)
  }

  "Read file" must "convert to string" in {
    given("Given a file name")
    val filename = "C:/triangle.txt"
    when("read a file")
    val source = Source.fromFile(new File(filename))
    val lines = source.mkString
    source.close()
    val graph = Node(lines)
    then("validate")
    println(lines)
  }

  def isOrdered(l: Seq[Int]) = (l, l.tail).zipped.forall(_ <= _)
}