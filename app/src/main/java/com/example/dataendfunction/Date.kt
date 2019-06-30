package com.example.dataendfunction

import android.provider.ContactsContract

class Date() {
    var day: Int = 0
    var month: Int = 0
    var year: Int = 0
    var dayOfWeek: Int = 1
    var manyDay: Int = 10

    val DAYS_IN_YEAR = 365
    val DAYS_IN_MONTH = 30

    fun getDayOfWeek(dayOfWeek: Int): String {
        var dayOfWeekString = "ERROR"
        when (dayOfWeek) {
            1 -> {
                dayOfWeekString = "Sunday"
            }
            2 -> {
                dayOfWeekString = "Monday"
            }
            3 -> {
                dayOfWeekString = "Tuesday"
            }
            4 -> {
                dayOfWeekString = "Wednesday"
            }
            5 -> {
                dayOfWeekString = "Thursday"
            }
            6 -> {
                dayOfWeekString = "Friday"
            }
            7 -> {
                dayOfWeekString = "Saturday"
            }
        }
        return dayOfWeekString
    }

    fun getMonthOfYear(monthMonthOfYear: Int): String {
        return when (monthMonthOfYear) {
            1 -> {
                "January"
            }
            2 -> {
                "February"
            }
            3 -> {
                "March"
            }
            4 -> {
                "April"
            }
            5 -> {
                "May"
            }
            6 -> {
                "June"
            }
            7 -> {
                "July"
            }
            8 -> {
                "August"
            }
            9 -> {
                "September"
            }
            10 -> {
                "October"
            }
            11 -> {
                "November"
            }
            12 -> {
                "December"
            }
            else -> ""
        }
    }

    fun setDayOfWeekValue(month: Int) {
        if (day < 1 || day > 7)
            dayOfWeek = 1
        else
            dayOfWeek = day
    }

    fun setMonthValue(month: Int) {
        if (month < 1 || month > 12)
            dayOfWeek = 1
        else
            dayOfWeek = day
    }

    constructor(day: Int, month: Int, year: Int) : this() {
        this.day = day
        this.month = month
        this.year = year
    }

    fun getLaterDate(date1: Date, date2: Date): Date {
        if ((date1.year > date2.year)) {
            return date1
        } else if (date2.year > date1.year) {
            return date2
        } else { //date1.year == date2.year
            if (date1.month > date2.month) {
                return date1
            } else if (date2.month > date1.month) {
                return date2
            } else {
                if (date1.day > date2.day) {
                    return date1
                } else if (date2.day > date1.day) {
                    return date2
                } else
                    return date1
            }
        }
    }

    fun getEarlyData(date1: Date, date2: Date): Date {
        if (date1.year > date2.year) {
            return date2
        } else if (date1.year == date2.year) {
            if (date1.month > date2.month) {
                return date2
            } else if (date1.month == date2.month) {
                if (date1.day > date2.day) {
                    return date2
                } else {
                    return date1
                }
            } else {
                return date1
            }
        } else {
            return date1
        }
    }

    fun getMidDate(date1: Date, date2: Date): Date {
        return convertDaysToDate((convertDateToDays(date1) + convertDateToDays(date2)) / 2)
        //        val total2 = (convertDateToDays(date1) +  convertDateToDays(date2))/2
        //        val midDate = convertDaysToDate(total2)
        //        return  midDate
    }

    private fun convertDateToDays(date: Date): Int {
        val yearsToDays: Int = date.year * DAYS_IN_YEAR
        val monthToDays: Int = date.month * DAYS_IN_MONTH
        return yearsToDays + monthToDays + date.day
    }

    private fun convertDaysToDate(days: Int): Date {
        val daysToYears: Int = days / DAYS_IN_YEAR
        val remainingDaysFromYear: Int = days % DAYS_IN_YEAR
        val daysToMonth: Int = remainingDaysFromYear / DAYS_IN_MONTH + 1
        val remainingDays: Int = remainingDaysFromYear % DAYS_IN_MONTH
        return Date(remainingDays, daysToMonth, daysToYears)
    }

    fun getBirthdayDateDescription(birthdayDateDescription: Date): String {
        var birthdayDateDescriptionString: String = "ERROR"
        when (birthdayDateDescription) {
            Date(27, 3, 1984) -> {
                birthdayDateDescriptionString = "My Birthday"
            }
            Date(17, 4, 1984) -> {
                birthdayDateDescriptionString = "Birthday My Wife"
            }
            Date(2, 1, 2012) -> {
                birthdayDateDescriptionString = "Birthday My Eldest Son"
            }
            Date(27, 7, 2018) -> {
                birthdayDateDescriptionString = "Birthday My Younger Son"
            }
        }
        return birthdayDateDescriptionString
    }

    fun getCashDateDescription(cashDateDescription: Date): String {
        var cashDateDescriptionString = "ERROR"
        when (cashDateDescription) {
            Date(10, 7, 2019) -> {
                cashDateDescriptionString = "My Payment"  //maskoret
            }
        }
        return cashDateDescriptionString
    }
}
