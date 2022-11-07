@main
def main(): Unit = {
  //println("Hello world!")

  //val x = new Foo // compilation error
  val y = new Foo with ConcreteTrait // works
  val test = new Foo with TestTrait // for testing
}