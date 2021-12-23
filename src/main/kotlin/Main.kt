fun main(args: Array<String>) {
    welcome()
}
fun welcome() {
    println("Student Management Program")
    println("""
        students - John, Alice, Bill
        admin's password - der parole
    """.trimIndent())
    println("Please, login (\"admin\" for administrative executive)")
    val input = readLine()!!
    val regex = "admin".toRegex()
    if (!input.toLowerCase().matches(regex)) {
        studentview(input)
    } else {
        println("Please, provide password (if you are a student, leave blank): ")
        val password = readLine()!!
        if (password == "der parole") adminview() else welcome()
    }
}
fun studentview(name: String) {
    for (i in points) {
       if (i.name == name) {
           println("""
               student name - ${i.name}
               English      - ${i.english} /100
               Maths        - ${i.maths} /100
               Science      - ${i.science} /100
           """.trimIndent())
       }
    }
    welcome()
}
fun adminview() {
    lateinit var inputName: String
    val regex = "(,)".toRegex()
        println("Do you want to change student points? (yes or no)")
        val input = readLine()!!
        if (input == "yes") {
            println("Please, write down student's name: (John, Alice, Bill)")
            inputName = readLine()!!
            for (i in points) {
                if (i.name == inputName) {
                    println("English")
                    i.english = readLine()!!.replace(regex,".")
                    println("Maths")
                    i.maths = readLine()!!.replace(regex,".")
                    println("Science")
                    i.science = readLine()!!.replace(regex,".")
                    println("Is all correct?")
                    println(
                        """
            student name - ${i.name}    
                    English      - ${i.english} /100 Overall is ${Math.round(i.english.toFloat() / 100 * 100)}
                    Maths        - ${i.maths} /100 Overall is ${Math.round(i.maths.toFloat()   / 100 * 100)}
                    Science      - ${i.science} /100 Overall is ${Math.round(i.science.toFloat() / 100 * 100)}
        """.trimIndent()
                    )
                }
            }
            adminview()
        } else if (input == "no") {
            pointsView()
        }
}
fun pointsView() {
    for (i in points) {
        println("""
                    student name - ${i.name}    
                    English      - ${i.english} /100 Overall is ${Math.round(i.english.toFloat() / 100 * 100)}
                    Maths        - ${i.maths} /100 Overall is ${Math.round(i.maths.toFloat()   / 100 * 100)}
                    Science      - ${i.science} /100 Overall is ${Math.round(i.science.toFloat() / 100 * 100)}
                   
                """.trimIndent())
    }
    welcome()
}





