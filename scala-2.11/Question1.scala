/**
  * A program using string interpolation and a list.

  */
class Interpolation { //class to print the list elements along with their respective indexes

  val numbers = List(1,2,3,4,5) //List declaration and initialization
  for(number<- 0 until numbers.length) //iterating through the list
    println(s"$number = ${numbers(number)}") // printing index with value

}

object Question1 extends App{

  val Interpolationobject = new Interpolation() // Instantiating the Interpolation class
}
