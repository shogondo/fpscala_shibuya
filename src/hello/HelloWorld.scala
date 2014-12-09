object HelloWorld extends App {
    println("Hello Scala !!")

    val helloFunction = { str:String => println(str) }
    helloFunction("Hi Scala.")
    println("")

    // Print 1 to 10.
    (1 to 10).foreach(println)
    println("")

    // Print 2 to 20 step by 2.
    (1 to 10).map(_ * 2).foreach(println)
    println("")

    // Print even numbers between 1 and 10.
    (1 to 10).filter(_ % 2 == 0).foreach(println)
    println("")
}
