@main def init() ={
  val toUpper: String => String = (str: String) => str.toUpperCase
  val toLower: String => String = (str: String) => str.toLowerCase

  val formatNames: (String, String => String) => String = (name, formatFunc) => {
    formatFunc(name)
  }

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  for ((name, index) <- names.zipWithIndex) {
    val output = index % 4 match {
      case 0 => formatNames(name, toUpper)
      case 1 => formatNames(name, x => toUpper(x.take(2)) + toLower(x.drop(2)))
      case 2 => formatNames(name, toLower)
      case 3 => formatNames(name, x => toUpper(x.take(1)) + toLower(x.drop(1).dropRight(1)) + toUpper(x.takeRight(1)))
      case _ => name
    }
  
    println(output)
  }

}