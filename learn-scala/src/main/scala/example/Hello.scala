package example

import fibonacci.Fibonacci
import models.Animal
import models.Bird

object Hello extends Greeting with App {
  println(greeting)
  println(Fibonacci.fib(10))
  tryFor()
  def twice(f:Int=>Int) = f compose f
  println(twice(_+3)(7))
  val b: Animal = new Bird()
  b.eat()
}

case class Weekday(name: String, index: Int)

trait Greeting {
  lazy val greeting: String = "hello"

  def tryFor(): Unit = {
    val week = List(
      Weekday("Monday", 1),
      Weekday("Tuesday", 2),
      Weekday("Wednesday", 3),
      Weekday("Thursday", 4),
      Weekday("Friday", 5),
      Weekday("Saturday", 6),
      Weekday("Sunday", 7)
    )
    val workdays = for (d <- week if d.index < 6)
      yield d
    workdays.foreach(d => println(d.name))
  }
}
