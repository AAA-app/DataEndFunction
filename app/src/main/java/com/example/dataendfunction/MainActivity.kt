package com.example.dataendfunction

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
//        val textView = TextView(this)
//        linearLayout.addView(textView)
//        val datePicker = DatePicker(this)
//        textView.text = "Year: "+datePicker.year+ " Month: "+ (datePicker.month+1) +" Day: "+ datePicker.dayOfMonth
//        val calendarView = Calendar.getInstance()
//        calendarView.timeInMillis = System.currentTimeMillis()
//        datePicker.init(calendarView.get(Calendar.YEAR), calendarView.get(Calendar.MONTH), calendarView.get(Calendar.DAY_OF_MONTH),
//            DatePicker.OnDateChangedListener { datePicker, year, month, day->
//                textView.text = "Year: "+ year + " Month: "+ (month+1) + " Day: "+day
//            })
//        linearLayout.addView(datePicker)


        var sasha = Date(27, 3, 1984)
        var anna = Date(17, 4, 1984)
        var adam = Date(2, 1, 2012)
        var ronhel = Date(27, 7, 2018)
        var kesh = Date(10, 7, 2019)

        var birthday = sasha.getMidDate(adam, ronhel)
        Log.d("test1", "${birthday.day}/${birthday.month}/${birthday.year}")
        birthday = sasha.getMidDate(sasha, anna)
        Log.d("test2", "${birthday.day}/${birthday.month}/${birthday.year}")
        birthday = sasha.getMidDate(sasha, anna)
        Log.d("test3", "${birthday.day}/${birthday.month}/${birthday.year}")
        birthday = sasha.getMidDate(adam, anna)
        Log.d("test4", "${birthday.day}/${birthday.month}/${birthday.year}")
        birthday = sasha.getMidDate(ronhel, anna)
        Log.d("test5", "${birthday.day}/${birthday.month}/${birthday.year}")

        var month = sasha.getMidDate(adam, ronhel)
        Log.d("test1", "${month.day}/${month.month}/${month.year}")


        //class tests
        var date1: Date = Date(29, 6, 2019)
        var date2: Date = Date(10, 10, 2018)
        var date3: Date = Date(13, 4, 2083)

        var resultDate = sasha.getLaterDate(date1, date2)
        Log.d("TEST1", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate = sasha.getLaterDate(date1, adam)
        Log.d("TEST2", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate = sasha.getLaterDate(date1, ronhel)
        Log.d("TEST3", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate = sasha.getLaterDate(date1, date3)
        Log.d("TEST4", "${resultDate.day}/${resultDate.month}/${resultDate.year}")

        var date4: Date = Date(13, 4, 2004)
        var date7: Date = Date(13, 4, 2004)

        resultDate = sasha.getLaterDate(date4, date7)
        Log.d("TEST5", "${resultDate.day}/${resultDate.month}/${resultDate.year}")

        resultDate = sasha.getLaterDate(date4, date4)
        Log.d("TEST7", "${resultDate.day}/${resultDate.month}/${resultDate.year}")


        var dayString = sasha.getDayOfWeek(1)
        Log.d("TESTSTRING1", dayString)
        dayString = sasha.getDayOfWeek(2)
        Log.d("TESTSTRING2", dayString)
        dayString = sasha.getDayOfWeek(3)
        Log.d("TESTSTRING3", dayString)
        dayString = sasha.getDayOfWeek(4)
        Log.d("TESTSTRING4", dayString)
        dayString = sasha.getDayOfWeek(5)
        Log.d("TESTSTRING5", dayString)
        dayString = sasha.getDayOfWeek(6)
        Log.d("TESTSTRING6", dayString)
        dayString = sasha.getDayOfWeek(7)
        Log.d("TESTSTRING7", dayString)
        dayString = sasha.getDayOfWeek(8)
        Log.d("TESTSTRING8", dayString)

        var p1 = Person()
        var p2 = Person()
        var p3 = Person()
        p3.name = "Adam"
        p3.age = 7.5
        p3.profession = "Student"

        p1.name = "Sasha"
        p1.age = 35.5
        p1.id = 524222487
        p1.fatherName = "Papa"
        p1.profession = "Teacher"
        p1.address = "Netanya"

        p2.name = "Anna"
        p2.age = 34.5
        p2.id = 545654461
        p2.profession = "Teacher2"
        p2.motherName = "Mama"
        p2.address = "Netaniya"

        var nameString = p1.haveSameName(person1 = p1, person2 = p2)
        Log.d("TEST1", nameString.toString())

        var ageString = p1.haveSameAge(person1 = p1, person2 = p2)
        Log.d("TEST2", ageString.toString())

        var OlderString = p1.getOlderPerson(person1 = p1, person2 = p2)
        Log.d("TEST3", OlderString.toString())

        var MotherString = p1.getMotherName(person2 = p2)
        Log.d("TEST4", MotherString.toString())

        var addressString = p1.getAddress(person1 = p1)
        Log.d("TEST5", addressString.toString())

        var graidString = p3.getGraid(person3 = p3)
        Log.d("TEST6", graidString)


        var father = Person()
        father.age = 35.5
        father.name = "Sasha"

        var son = Person()
        son.age = 7.5
        son.name = "Adam"

        var grandmother = Person()
        grandmother.age = 67.5
        grandmother.name = "Larisa"

        var adultString = son.isAdult(per1 = son, per2 = father, per3 = grandmother)
        Log.d("TEST7", adultString.toString())

    }


    private fun checkArray() {
        var date1: Date = Date(29, 6, 2019)
        var date2: Date = Date(10, 10, 2018)
        var date3: Date = Date(13, 4, 2083)
        var date4: Date = Date(13, 4, 2083)

        var dateArray: ArrayList<Date> = arrayListOf(date1)
        //dateArray.add(date2)
        dateArray.set(0, date2)
        dateArray.removeAt(0) //steret marah date2
        var datearr: ArrayList<Date> = arrayListOf<Date>(date1, date2, date3, date4)
        dateArray.addAll(datearr)

        for (i: Int in 0 until dateArray.size){
            var date: Date = dateArray[i]
            if (date.year >= 2020)
               Log.d("TEXT_DATE_ARRAY", "After 2020 ${date.getCashDateDescription(Date())}")
            else
               Log.d("TEXT_DATE_ARRAY", "Before 2020 ${date.getCashDateDescription(Date())}")
    }
    }
    private fun chekShapeArray() {
        var triangle1 = Triangle(height = 5, width = 10)
        var triangle2 = Triangle(height = 10, width = 5)
        var triangle3 = Triangle(height = 10, width = 10)
        var circle1 = Circle(height = 5.5, width = 10.5,h = Double, w = Double.MAX_VALUE)
        var circle2 = Circle(height = 10.5, width = 5.5,h = Double, w = Double.NaN)
        var circle3 = Circle(height = 6.5, width = 15.5,h = Double, w = Double.MIN_VALUE)
        var square1 = Square(height = 15.5, width = 6.5,h = Double, w = Double.MAX_VALUE)
        var square2 = Square(height = 28.9, width = 36.5,h = Double, w = Double.MIN_VALUE)
        var square3 = Square (height = 25.5, width = 35.5,h = Double, w = Double.NaN)

        var shapeArrayList: ArrayList<Shape> = arrayListOf()
        shapeArrayList.add (triangle1)
        shapeArrayList.add (triangle2)
        shapeArrayList.add (triangle3)
        shapeArrayList.add (circle1)
        shapeArrayList.add (circle2)
        shapeArrayList.add (circle3)
        shapeArrayList.add (square1)
        shapeArrayList.add (square2)
        shapeArrayList.add (square3)

        for (i: Int in 0 until shapeArrayList.size){
            var value: Shape = shapeArrayList[i]
            Log.d("TesT_Shape", value.getArea().toString())

        }
    }
}
