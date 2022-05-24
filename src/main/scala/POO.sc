//traits
trait Speaker {
  def speak(): String
}

trait  TailWagger {
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")
}

class Dog(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String =  "Woof!"
}

class Cat(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Meow"
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")
}

val d = new Dog("Faust")
println(d.speak())

val c = new Cat("Miette")
println(c.speak())
c.startRunning()
c.stopRunning()

//Classes
class Person(var firstName: String, var lastName: String) {
  def printFullName(): Unit = println(s"$firstName $lastName")
}

val p = new Person("John", "Shepard")
p.printFullName()