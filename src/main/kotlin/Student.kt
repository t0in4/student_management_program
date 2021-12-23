data class Student (val name: String, var english: String, var maths: String, var science: String)

val points = mutableListOf<Student>(
    Student("John", "60", "70", "80"),
    Student("Alice", "60", "70", "80"),
    Student("Bill", "80", "70", "80")
)