package org.example

import groovy.transform.Field
import pipeline.proceccing.Strip

@Field
def static dirtyData = "1"

println("DSL")

if (dirtyData == "1") {
    println("dirtyData is 1")
}


