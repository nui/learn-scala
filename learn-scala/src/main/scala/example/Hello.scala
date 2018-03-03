package example

object Hello extends Greeting with App {

//  classes.run()
//  currying.run()
//  Implicit.run()
//  learn.future.run()
  learn.enumeration.run()
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
