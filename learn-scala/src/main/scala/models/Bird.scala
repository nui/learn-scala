package models

class Bird extends Animal {
  override def eat(): Unit = println("Bird peck")

  println("Bird")
}
