package com.xpengkang

import scala.math

/**
  * @Author: kang.peng
  * @Date: 2022/8/19 7:25 AM
  * @Version 1.0
  */
object MyObj extends App {
  //和 Java 一样，可以定义类和变量，成员方法
  class Order_tab {
    private val cnt = 10
    def count() = println(cnt + 1)
  }

  // 和Java 一样，可以new
  val order_tab = new Order_tab

  class Order_001(name: String) extends Order_tab

  val tab00 = new Order_001("tab001")
  private val unit: Unit = tab00.count(); // 继承
  println(unit)

  // 抽象类，和Java一样。abstract关键字，无方法的实现
  abstract class User{
    def buy():Unit
  }

  trait Buyer{
    def fav():Unit
  }

  class Customs extends Order_tab with Buyer {
    override def fav(): Unit = ???
  }

  object MySingleton {
    def value = 232323
    def myMethod():Int = 121213
    def apply(x :Int):Int = x + 1
  }

  MySingleton.apply(1)
  MySingleton.value
  MySingleton.myMethod()

  case class Person(name:String,age: Int )
  case class OrderDetail(
                             id:Long,
                             user_id:Long,
                             cancel_time:Long,
                             cancel_reason:Int,
                             gds_timestamp:Long,
                             command:String
                           )


}
