package com.dalston.dalston

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DalstonApplication

fun main(args: Array<String>) {
    runApplication<DalstonApplication>(*args)
}