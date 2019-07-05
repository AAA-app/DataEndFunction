package com.example.dataendfunction

class Person () {
    var name = ""
    var age: Double = 0.0
    var id: Int = 0
    var address = ""
    var motherName = ""
    var fatherName = ""
    var sonName = Boolean
    var fatherName1 = Boolean
    var grandmotherName = Boolean


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

    fun getMotherName(person2: Person): Person {
        return person2
    }

    fun getAddress(person1: Person): Person {
        return person1
    }

    fun getGraid(person3: Person): String { // shkolnik
        var person1String = "err"
        when (person3) {
            Person() -> {  // zakonchit
                person1String = "yes i'm Student"
            }
        }
        return person1String
    }

    fun isAdult(per1: Person, per2: Person, per3: Person): Boolean.Companion { /// do 18 rebionok
        if (age > 1 || age < 18) {
            return sonName
            } else  if (age > 18 || age < 65){
            return fatherName1
        } else {
            return grandmotherName

        }
    }
}

