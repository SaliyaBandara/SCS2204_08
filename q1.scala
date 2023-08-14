@main def init() ={
    val calculateInterest: Double => Double = (deposit: Double) => deposit match {
        case d if d <= 20000 => d * 0.02
        case d if d <= 200000 => d * 0.04
        case d if d <= 2000000 => d * 0.035
        case d => d * 0.065
    }

    println(calculateInterest(10000))
    println(calculateInterest(20000))
    println(calculateInterest(200000))
    println(calculateInterest(2000000))
    println(calculateInterest(20000000))
}