/**
  * A program to get the nth Fibonacci number.
  */
class Fibonacci {                        //fibonacci element finding class
  var number1 = 0
  var number2 = 1
  var number3 = 0
  def fib1(n: Int): Int = {              // method to find required nth fibo number
    var i:Int=2
    if (n == 0|| n==1)                   //initial fibonacci values
     return n                             //returnin nth number
     else
      while(i<n)                          //loopin in to generate the required fibonacci number
        {
          number3 = number1+number2
          number1 = number2
          number2 = number3
          i = i+1
        }
    return number3                        //returnin nth number


  }
}

object Question3 extends App{
  val Fibonacciobject = new Fibonacci()
  val fibovalue = Fibonacciobject.fib1(1)                      //calling the function for fibonacci number
  println(s"$fibovalue")
}