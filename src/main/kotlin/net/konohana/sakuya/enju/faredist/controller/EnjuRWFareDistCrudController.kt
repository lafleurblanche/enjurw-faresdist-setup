package net.konohana.sakuya.enju.faredist.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW01FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW02FareDist
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Route.enjuRWFareDistCrudController() {
    route("enju") {
        route("crud") {
            route("enjurw01faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW01FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW01FareDist"))
                }
            }
            route("enjurw02faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW02FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW02FareDist"))
                }
            }
        }
    }
}
