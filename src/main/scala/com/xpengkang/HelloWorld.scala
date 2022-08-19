package com.xpengkang

/**
  * @Author: kang.peng
  * @Date: 2022/8/18 11:13 AM
  * @Version 1.0
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello xpengkang")
    println("every + - * / is the method in scala: ", 5.+(2222))


    val myStrArr = Array("love", "like", "thumb up")

    println(myStrArr.toString)

    val tuple = ("bigdate", 3, 56565, 3.00)

    // tuple can directly print in line
    println(tuple)


    var value = List("bigdata", "hadoop")


    val iterator1 = Iterator("hadoop", "spark", "flink")
    while(iterator1.hasNext){
      println(iterator1.next())
    }


  }

}
