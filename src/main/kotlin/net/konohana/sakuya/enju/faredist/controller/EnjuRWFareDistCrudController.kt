package net.konohana.sakuya.enju.faredist.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW01FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW02FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW03FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW04FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW05FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW06FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW07FareDist
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
            route("enjurw03faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW03FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW03FareDist"))
                }
            }
            route("enjurw04faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW04FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW04FareDist"))
                }
            }
            route("enjurw05faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW05FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW05FareDist"))
                }
            }
            route("enjurw06faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW06FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW06FareDist"))
                }
            }
            route("enjurw07faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW07FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW07FareDist"))
                }
            }
        }
    }
}
