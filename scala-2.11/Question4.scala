/**
  * A program to sum of the digits of the product of numbers from 1 to n.
  */
class Sumofdigits {    // class to find the sum  of digits of the product of numbers
  var sum=0
  val number = 7
  var i = 1
  var product = 1

  while (i < number) {       // looping in to calculate the product
      product = product * i
    i=i+1
  }
  println(s"product = $product")
  while(product>0) {        // looping in to calculate the sum of digits
    var rem = product % 10
    product=product/10
    sum=sum+rem

  }
  println(s"sum = $sum")
}
object Question4 extends App {
  val sumobj = new Sumofdigits()    //Instantiating the class Sumofdigits
}
