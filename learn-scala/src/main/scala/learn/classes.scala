package learn

import models.{Animal, Bird}

object classes {
  def run(): Unit = {
    val b = new Bird()
    val a: Animal = b
    a.eat()
    b.eat()
  }
}
