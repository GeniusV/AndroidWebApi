package com.geniusver.utils

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/23/18.
 */


fun generateMethods(name: String, fields: Array<String>, baseNames: Array<String> = arrayOf(), baseTypes: Array<String> = arrayOf()): List<String> {

//    val fieldsArrangementList = FullArrangement.run(fields)
//
//
    val result = ArrayList<String>()
//    for (fieldArrangement in fieldsArrangementList) {
//        val methodName = "findBy" + fieldArrangement.joinToString("And")
//        val params = fieldArrangement.map {
//            "@Param(\"${it.toLowerCase()}\") $it ${it.toLowerCase()}"
//        }
//        val notStaticParams = params.joinToString(", ")
//
//        val template = "Page<$name> $methodName($notStaticParams, Pageable page);"
//        result.add(template)
//    }

    val paramList = ArrayList<HashMap<String, String>>()

    // add custom type(like name in Student entity) field to paramList
    fields.mapTo(paramList) { hashMapOf<String, String>(Pair("type", it), Pair("name", it.toLowerCase())) }

    // add entiry type(like Student) to paramList
//    for (i in 0 until baseNames.size) {
//        val map = hashMapOf<String, String>(Pair("type", baseTypes[i]), Pair("name", baseNames[i]))
//        paramList.add(map)
//    }
    (0 until baseNames.size).mapTo(paramList) { hashMapOf<String, String>(Pair("type", baseTypes[it]), Pair("name", baseNames[it])) }

    // get full arrangement list of fields
    val fieldsArrangementList = FullArrangement.run(paramList.toTypedArray())


    for (fieldArrangement in fieldsArrangementList) {
        val params = fieldArrangement.map { "@Param(\"${it["name"]}\") ${it["type"]} ${it["name"]}" }
        val methodNames = fieldArrangement.map { it["name"]?.capitalize() }
        val methodNameString = "findBy" + methodNames.joinToString("And")
        val paramsString = params.joinToString(", ")
        val template = "Page<$name> $methodNameString($paramsString, Pageable page);"

        result.add(template)
    }






    return result

}

fun output(list: List<String>) {
    for (string in list) {
        println(string)
    }
    print("\n\n")
}


fun main(args: Array<String>) {
    output(generateMethods("Student", arrayOf("Claxx"), baseNames = arrayOf("name"), baseTypes = arrayOf("String")))
    output(generateMethods("Claxx", arrayOf("Major"), baseNames = arrayOf("name"), baseTypes = arrayOf("String")))
    output(generateMethods("Course", arrayOf("Collage"), baseNames = arrayOf("name"), baseTypes = arrayOf("String")))
    output(generateMethods("Major", arrayOf("Collage"), baseNames = arrayOf("name"), baseTypes = arrayOf("String")))
    output(generateMethods("Score", arrayOf("Student", "Course", "Term")))

}



