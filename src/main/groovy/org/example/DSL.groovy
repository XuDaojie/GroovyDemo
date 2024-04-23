package org.example

import pipeline.proceccing.Date
import pipeline.proceccing.Strip



static void main(String[] args) {
    println("DSL")

    def config = [:]

    def dirtyData = new HashMap()

    Map<String, Object> map = new HashMap<>()
    map.put("field1", "2022-02-22");
    map.put("field2", "2022-02-23");
    map.put("field3", " sdas  2-23  ");
    map.put("field4", " 2-23  ");

    def strip = new Strip()
    strip.put(map)

    strip.with {
        match "field3"
    }

    println(map.get("field3"))
}