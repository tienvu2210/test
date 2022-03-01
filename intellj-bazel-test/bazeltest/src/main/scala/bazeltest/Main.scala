package bazeltest
 
import othermodule.Worker
 
object Main extends App {
  println("IN MAIN now: ")
  val worker = new Worker
  worker.doSomething()
 
 
  def status(): String = "OKi"
}