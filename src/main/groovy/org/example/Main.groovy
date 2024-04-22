package org.example

import pipeline.Input
import pipeline.proceccing.Date
import pipeline.proceccing.Strip


static void main(String[] args) {
    println("----" + args)

    def dirtyDataRow = []

    println "Hello world!"

//    def closure = {
//        println("hello")
//    }
//    closure()

    // 闭包传参
    def aa = { hello ->
        println(hello)
    }

    aa "aaa"

//    定义
    def total = 0
    def a = { number ->
        total += number
        return this
    }
    def b = { number ->
        total *= number
        return this
    }

//dsl
    a 2
    b 3
    println total

    def input = { closure ->
        println "closure input"
        closure()
    }

    def date = { closure ->
        println "bbbb"
        closure()
    }

    def date1 = { closure ->
        println "bbbb"
        closure()
    }

    input {
        println "input"
        date {
            println "date"
        }
        date1 {
            println "date1"
        }
    }

////     闭包传参1
//    def date2 = new proceccing.Date();
//    date2.with {
//        match("2022-02-22", "yyyy-MM-dd")
//    }

    //     闭包传参2
//    def date3 = new proceccing.Date();
//    date3.with {
//        match "2022-02-22", "yyyy-MM-dd"
//    }

    // 讲输入传入闭包
    Map<String, Object> map = new HashMap<>()
    map.put("field1", "2022-02-22");
    map.put("field2", "2022-02-23");
    map.put("field3", " sdas  2-23  ");
    map.put("field4", " 2-23  ");
    def date4 = new Date();
    date4.put(map)
    def strip = new Strip()
    strip.put(map)

    date4.with {
        match "field1", "yyyy-MM-dd"
    }
    strip.with {
        match "field3"
    }
    strip.with {
        match "field4"
    }
    date4.with {
        match "field2", "yyyy-MM-dd"
    }


    def inputClass = new Input()
    // 二级
    inputClass.with {
        date4.with {
            match "field2", "yyyy-MM-dd"
        }
    }

//    input {
//        file {
//            type: "csv"
//        }
//    }
//
//    processing {
//        date {
//            match ["date", "yyyy-MM-dd", "iso8601"]
//        }
//    }
//
//    output {
//        mysql {
//            host: "localhost"
//            port: 3306
//            database: "test"
//            table: "test"
//            username: "root"
//            password: "root"
//            data: dirtyDataRow
//        }
//    }
}