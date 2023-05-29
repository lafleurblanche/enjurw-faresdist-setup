package net.konohana.sakuya.enju.faredist

import io.ktor.server.application.Application
import net.konohana.sakuya.enju.faredist.db.initMioriDB
import net.konohana.sakuya.enju.faredist.plugins.configureRouting
import net.konohana.sakuya.enju.faredist.plugins.configureSerialization


fun main(args: Array<String>): Unit =
    io.ktor.server.jetty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val url = environment.config.property("ktor.mioridb.uri").getString()
    val username = environment.config.property("ktor.mioridb.username").getString()
    val password = environment.config.property("ktor.mioridb.password").getString()
    initMioriDB(url, username, password)
    configureSerialization()
    configureRouting()
}
