package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        //throw NotImplementedError("Not implemented")
        var intMin:Int=minute.toInt()
        var intHour:Int=hour.toInt()
        var outputStr:String?
        var outStr:String?

        val list:Array<String> = arrayOf("","one","two","three","four","five","six",
        "seven","eight","nine","ten","eleven","twelve","thirteen","fourteen",
        "fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one",
        "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
        "twenty eight","twenty nine")
        outStr=(when(intHour){
            1->list[1]
            2->list[2]
            3->list[3]
            4->list[4]
            5->list[5]
            6->list[6]
            7->list[7]
            8->list[8]
            9->list[9]
            10->list[10]
            11->list[11]
            12->list[12]
                else -> ""
            })
        outputStr=(when{
            (intMin==0)->"${list[intHour]} o' clock"
            (intMin==1)->"${list[intMin]} minute past ${list[intHour]}"
            (intMin==15)->"quarter past ${list[intHour]}"
            (intMin>1 && intMin<30)->"${list[intMin]} minutes past ${list[intHour]}"
            (intMin==30)->"half past ${list[intHour]}"
            (intMin==45)->"quarter to ${list[intHour+1]}"
            (intMin>30&&intMin<60)->"${list[60-intMin]} minutes to ${list[intHour+1]}"
            else->""
        })
        return outputStr
    }
}
