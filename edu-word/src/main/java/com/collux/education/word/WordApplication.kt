package com.collux.education.word

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * 单词微服务应用入口
 * @author Siyi Lu
 * @since 2020/9/18
 */
@SpringBootApplication
@EnableEurekaClient
open class WordApplication

fun main(args: Array<String>) {
    runApplication<WordApplication>(*args)
}