package ru.skillbranch.devintensive.utils

object Utils {

//    TODO FIX ME!!!
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        val parts : List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return Pair(firstName, lastName)
    }
}