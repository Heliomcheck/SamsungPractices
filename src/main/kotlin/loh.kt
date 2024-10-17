fun main() {
    val student: Student? = Student()
    student?.let { st ->
        st.hi()
        st.bye()
        st.name = "Kolya"
    }
    println(student?.name)
    val student2 = student?.apply { this.Student
    hi()
    bye()
    name = "LolKek"
    }
}