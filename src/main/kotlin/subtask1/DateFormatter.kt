package subtask1

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*
import java.util.Calendar

class DateFormatter {


    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
       return try {
           val cal = GregorianCalendar()
           cal.isLenient = false
           cal.set(Calendar.DAY_OF_MONTH, day.toInt())
           cal.set(Calendar.MONTH, month.toInt() - 1)
           cal.set(Calendar.YEAR, year.toInt())

           val date = SimpleDateFormat("d MMMM, EEEE", Locale("ru"))
           date.format(cal.time)

       }
       catch (e:Exception){
           "Такого дня не существует"
       }
    }
}
