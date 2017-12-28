package learn

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

object future {

  case class Body[T](consumeData: Future[T])

  private def getFutureResult = Future {
//    throw new Exception("ex 1")
    Body(
      Future {
//        throw new Exception("ex 2")
        "body Data"
      }
    )
  }

  def run(): Unit = {
    val f = getFutureResult
      .flatMap { body =>
//        throw new Exception("ex 3")
        body.consumeData.map { data =>
//          throw new Exception("ex 4")
          data + " naja"
        }
      }
      .map { x =>
//        throw new Exception("ex 5")
        println(x)
      }
      .recover {
        case e: Throwable => println(e.getMessage)
      }
    Await.result(f, 10 seconds)
  }
}
