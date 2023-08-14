object Question_01 extends App {
  val calculateInterest: Double => Double = (dep: Double) => {
    if (0 >= dep) {
      0
    } else if (dep <= 20000) {
      0.02 * dep
    } else if (dep <= 200000) {
      0.04 * dep
    } else if (dep <= 2000000) {
      0.035 * dep
    } else {
      0.065 * dep
    }
  }

  print("Enter the deposit amount : ")
  val dep = scala.io.StdIn.readDouble()
  val inter = calculateInterest(dep)
  println(f"Interest for $dep%1.2frs is $inter%1.2frs")
}
