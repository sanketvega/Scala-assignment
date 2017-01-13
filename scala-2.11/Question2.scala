/**
  * A program to find the maximum element from list.

  */
class Maximum { // class for implementation of maximum of numbers in a list

  val numbers = List(1,8,6,4,59,10,23) // List for holding a list of numbers
  var max=numbers(0) //variable to hold initial maximum element
  for(number <- numbers){
    if(number>max) max=number//iterating through out the list to find the maximum element
  }
  println(max)
}

object Question2 extends App{

  val maxobject = new Maximum() // Instantiating the Maximum class

}