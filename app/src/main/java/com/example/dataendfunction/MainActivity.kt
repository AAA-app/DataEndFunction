package com.example.dataendfunction

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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





        var sasha = Date(27,3,1984)
        var anna = Date(17,4,1984)
        var adam = Date(2,1,2012)
        var ronhel = Date(27,7,2018)
        var kesh = Date(10, 7, 2019)

        var birthday   = sasha.getMidDate(adam,ronhel)
        Log.d("test1","${birthday.day}/${birthday.month}/${birthday.year}")
        birthday  = sasha.getMidDate(sasha,anna)
        Log.d("test2","${birthday.day}/${birthday.month}/${birthday.year}")
        birthday   = sasha.getMidDate(sasha,anna)
        Log.d("test3","${birthday.day}/${birthday.month}/${birthday.year}")
        birthday   = sasha.getMidDate(adam,anna)
        Log.d("test4","${birthday.day}/${birthday.month}/${birthday.year}")
        birthday = sasha.getMidDate(ronhel,anna)
        Log.d("test5","${birthday.day}/${birthday.month}/${birthday.year}")

        var month = sasha.getMidDate(adam,ronhel)
        Log.d("test1","${month.day}/${month.month}/${month.year}")


        //class tests
        var date1: Date =  Date(29,6,2019)
        var date2: Date = Date(10, 10, 2018)
        var date3:Date =  Date(13, 4, 2083)

        var resultDate = sasha.getLaterDate(date1, date2)
        Log.d("TEST1", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate  = sasha.getLaterDate(date1, adam)
        Log.d("TEST2", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate = sasha.getLaterDate(date1, ronhel)
        Log.d("TEST3", "${resultDate.day}/${resultDate.month}/${resultDate.year}")
        resultDate = sasha.getLaterDate(date1, date3)
        Log.d("TEST4", "${resultDate.day}/${resultDate.month}/${resultDate.year}")

        var date4:Date =  Date(13, 4, 2004)
        var date7:Date =  Date(13, 4, 2004)

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

        var p1 = Person ()
        var p2 = Person ()
        var p3 = Person ()
        p3.name = "Adam"
        p3.age = 7.5

        p1.name = "Sasha"
        p1.age = 35.5
        p1.id = 524222487
        p1.fatherName = "Papa"
        p1.address =  "Netanya"

        p2.name = "Anna"
        p2.age = 34.5
        p2.id = 545654461
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


        var father  = Person ()
        father.age = 35.5
        father.name = "Sasha"

        var son = Person ()
        son.age = 7.5
        son.name = "Adam"

        var grandmother = Person ()
        grandmother.age = 67.5
        grandmother.name = "Larisa"

        var adultString = son.isAdult(per1 = son, per2 = father, per3 = grandmother)
        Log.d("TEST7", adultString.toString())

    }


}