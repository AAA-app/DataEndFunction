package com.example.dataendfunction

class Person () {
    var name = ""
    var age: Double = 0.0
    var id: Int = 0
    var address = ""
    var motherName = ""
    var fatherName = ""


    fun haveSameName(person1: Person, person2: Person): Boolean {
        return person1.name == person2.name
    }

    fun haveSameAge(person1: Person, person2: Person): Boolean {
        return person1.age == person2.age
    }

    fun getOlderPerson(person1: Person, person2: Person): Person {
        return if (person1.age > person2.age) {
            person1
        } else {
            person2
        }
    }
    fun getMotherName(person1: Person) : String {
        return motherName
    }
    fun getaddress(person1: Person) : String {
        return address
    }

    fun getGraid (person1: Person) : String{
        var person1String = "err"
        when (person1){
            Person() -> {
                person1String = "yes i'm Student"
            }
        }
        return person1String
    }
}

