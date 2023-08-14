object Question_03 extends App {
  val toUpper: String => String = _.toUpperCase()
  val toLower: String => String = _.toLowerCase()

  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  println(formatNames(name1, toUpper))
  println(formatNames(name2, (name: String) => toUpper(name.slice(0, 2)) + toLower(name.slice(2, 8))))
  println(formatNames(name3, toLower))
  println(formatNames(name4, (name: String) => toUpper(name.slice(0, 1)) + toLower(name.slice(2, 6))))

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }
}
