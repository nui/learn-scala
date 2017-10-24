package learn

import scala.math.pow

object currying {
  def run(): Unit = {
    val power_3: Double => Double = powerN(3.0)
    println(power_3(2.17))
  }

  def powerN(n: Double)(x: Double): Double = {
    pow(x, n)
  }
}
