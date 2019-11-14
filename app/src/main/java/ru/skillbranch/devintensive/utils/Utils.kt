package ru.skillbranch.devintensive.utils

object Utils {

//    TODO FIX ME!!!
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts : List<String>? = fullName?.split(" ")

        val firstName = if(parts?.getOrNull(0) != "") parts?.getOrNull(0) else null
        val lastName = if(parts?.getOrNull(1) != "") parts?.getOrNull(1) else null

        return Pair(firstName, lastName)
    }

    fun transliteration(payload:String, divider:String = " "):String {
        TODO("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        fun toFirstChar(name: String?): String? {
            var s: String?
            if (name?.length?: 0 > 0)
                when (name?.get(0).toString()){
                    " " -> s = null
                    else -> s = name?.get(0).toString().toUpperCase()
                }
            else s = null
            return s
        }
        return if(toFirstChar(firstName) != null || toFirstChar(lastName) != null) "${toFirstChar(firstName) ?: ""}${toFirstChar(lastName) ?: ""}" else null
    }
}