package com.xpengkang

/**
  * @Author: kang.peng
  * @Date: 2022/8/18 11:48 PM
  * @Version 1.0
  */
object Basics extends App{
  val age:Int = 33

  val name = "tim"
  val age1 = 33

  val ifexample = if(age > 18) age else 17

  val codeBlock = {
    // 代码块
    val value1 = 88
    value1 + 100
  }

  // functions
  def myFunction1(x:Int, y:String):String = {
    y + " " + x
  }


  // 递归, 不使用loop, ITERATION
  def myRecirtion(n: Int) : Int = {
    if(n <= 1) 1
    else n * myRecirtion(n - 1)
  }

  println("this is unit")

  def myUnitFunction1():Unit = {
    println("hello, Unit is equal to void")
  }













}
