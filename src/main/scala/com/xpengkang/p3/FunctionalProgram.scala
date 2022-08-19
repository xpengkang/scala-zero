package com.xpengkang.p3

/**
  * @Author: kang.peng
  * @Date: 2022/8/19 8:24 AM
  * @Version 1.0
  */
object FunctionalProgram extends App{

  class Person(name : String) {
    def apply(age: Int) = println(s"age is $age")
  }

  val bob = new Person("tim")
//  age is 89
//  age is 88
  bob.apply(89)
  bob(88)


  // 函数 编程 = 所有的函数 是 函数类型的 实例 instance
  // 语法糖
  val doubler: Function1[Int, Int] = (x:Int) => 2*x
  doubler(4) // 8
  println(doubler(8))  // 16

  // highre-order functions, map
  val mapList = List(1, 2,3).map(x => x + 1) // List(2, 3, 4)
  println(mapList) // List(2, 3, 4)

  // flatmap
  val flatList: List[Int] = List(1, 2, 3).flatMap(x => List(x, 2 * x))
  println(flatList)

//  private val flatList: List[Int] = List(1, 2, 3).flatMap {
//    x => List(x, 2 * x)
//  }


  private val value: List[Int] = List(1, 2, 3, 4, 5).filter(x => x == 3)
  println(value)  //List(3)

  private val value1: List[Int] = List(21, 22, 23, 24).filter(_ <= 22)
  println(value1)







}
