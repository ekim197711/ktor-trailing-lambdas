package com.example

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.gson.*
import io.ktor.features.*
import javafx.scene.text.FontWeight


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.moduleAlien(testing: Boolean = false) {
    routing {
        get("/alien") {
            call.respond(Alien("Mike", 192.0, 114.5))
        }
    }
}
data class Alien(val name: String, val height: Double, val weight: Double)


