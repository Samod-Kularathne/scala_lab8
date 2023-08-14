object Question_02 extends App {
  val check: Int => Unit = (value: Int) => {
    if (0 >= value) {
      println("Negative/Zero Input")
    } else if (value % 2 == 0) {
      println("Even number is given")
    } else if (value % 2 == 1) {
      println("Odd number is given")
    }
  }

  print("Enter the Integer: ")
  val inp = scala.io.StdIn.readInt()
  check(inp)
}
