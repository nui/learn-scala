package example

import fibonacci.Fibonacci

object Hello extends Greeting with App {
  println(greeting)
  println(Fibonacci.fib(10))
}

trait Greeting {
  lazy val greeting: String = "hello"
}
