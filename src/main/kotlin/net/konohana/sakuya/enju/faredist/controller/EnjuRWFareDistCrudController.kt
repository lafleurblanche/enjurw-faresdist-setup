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
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW08FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW09FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW10FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW11FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW12FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW13FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW14FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW15FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW16FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW17FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW18FareDist
import net.konohana.sakuya.enju.faredist.models.enju.EnjuRW19FareDist
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
            route("enjurw08faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW08FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW08FareDist"))
                }
            }
            route("enjurw09faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW09FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW09FareDist"))
                }
            }
            route("enjurw10faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW10FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW10FareDist"))
                }
            }
            route("enjurw11faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW11FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW11FareDist"))
                }
            }
            route("enjurw12faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW12FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW12FareDist"))
                }
            }
            route("enjurw13faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW13FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW13FareDist"))
                }
            }
            route("enjurw14faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW14FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW14FareDist"))
                }
            }
            route("enjurw15faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW15FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW15FareDist"))
                }
            }
            route("enjurw16faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW16FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW16FareDist"))
                }
            }
            route("enjurw17faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW17FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW17FareDist"))
                }
            }
            route("enjurw18faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW18FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW18FareDist"))
                }
            }
            route("enjurw19faredist") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW19FareDist)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW19FareDist"))
                }
            }
        }
    }
}
