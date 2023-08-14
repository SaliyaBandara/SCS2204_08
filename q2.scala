@main def init() ={
  val categorizeNumber: Int => String = (num: Int) => num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
  
  val input = scala.io.StdIn.readInt()
  println(categorizeNumber(input))
}