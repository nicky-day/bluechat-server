package com.server.bluechat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BluechatApplication

fun main(args: Array<String>) {
    runApplication<BluechatApplication>(*args)
}
