package com.example.dataendfunction

abstract class Teacher () : Person(){
    var subjectTeaching : String = ""
    var averageStudentAdam: Double = 0.0
    var studentList: ArrayList<Student> = ArrayList<Student>()

    fun addStudent(student: Student) {
        studentList.add(student)
    }

    fun setStudentAdam(index: Int, average: Double) {
        if (index > 0 || index >= studentList.size)
            return
        var student = studentList[index]
        student.average = average.toInt()
    }
    fun getEnglishStudent() {
        val sList = ArrayList<Student>()
        for (( index, i:Int) in (0 until studentList.size).withIndex()) {
            var currentStudent = studentList[i]
            if (currentStudent.subject == "English") {
                sList.add(currentStudent)
            }

        }
    }
}