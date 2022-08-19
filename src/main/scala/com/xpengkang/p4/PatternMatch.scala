package com.xpengkang.p4

/**
  * @Author: kang.peng
  * @Date: 2022/8/19 10:58 AM
  * @Version 1.0
  */
object PatternMatch extends App{

  val storeID = 1234
  val storeName = storeID match {
    case 1 => "kfc"
    case 2 => "dell"
    case 3 => "apple"
    case _ => "third class grand"
  }
  println(storeName)

  case class OrderDetail(
                        OrderId: Long,
                        daytime: Long
                        )

  val personGreeting = OrderDetail match {
    case OrderDetail(n, a) => s" order ID is $n ， and today is  $a ."
    case _ => "Something else"
  }

  // deconstructing tuples
  val aTuple = ("java", "scala")
  val bandDescription = aTuple match {
    case (java, flink) => s"$java and $flink"
    case (java, scala) => "true"
    case _ => "others ======"
  }

  // decomposing lists
  val aList = List(1,2,3)
  val listDescription = aList match {
    case List(_, 2, _) => "List containing 2 on its second position"
    case _ => "unknown list"
  }

}
