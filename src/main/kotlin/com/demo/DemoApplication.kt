package com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication @EnableJpaRepositories @EntityScan class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
