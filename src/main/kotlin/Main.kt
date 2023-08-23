import kotlin.math.*

fun main(args: Array<String>) {
    println("Hello Kotlin!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    //forever()

    var sun = 1

//    do {
//        println(sun)
//        sun += 1
//    } while (sun < 1000)

    while (sun < 1000) {
        sun += 1
        println(sun)
        if (sun == 500)
            break
    }
}

//fun add(): Unit {
//    val result = 2 + 2
//    println(result)
//}

fun forever(): Nothing {
    while (true) {
        Thread.sleep(1000)
        println("oi")
    }
}



