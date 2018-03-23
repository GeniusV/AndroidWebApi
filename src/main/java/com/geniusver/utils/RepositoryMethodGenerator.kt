package com.geniusver.utils

import com.geniusver.entities.Course

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/23/18.
 */


fun generateMethods(name: String, fields: Array<String>): List<String> {

    val fieldsArrangementList = FullArrangement.run(fields)

    val result = ArrayList<String>()
    for (fieldArrangement in fieldsArrangementList) {
        val methodName = "findBy" + fieldArrangement.joinToString("And")
        val params = fieldArrangement.map {
            "@Param(\"${it.toLowerCase()}\") $it ${it.toLowerCase()}"
        }
        val notStaticParams = params.joinToString(", ")

        val template = "Page<$name> $methodName($notStaticParams, Pageable page);"
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
    output(generateMethods("Claxx", arrayOf("Major")))
    output(generateMethods("Course", arrayOf("Collage")))
    output(generateMethods("Major", arrayOf("Collage")))
    output(generateMethods("Score", arrayOf("Student", "Course", "Term")))

}



