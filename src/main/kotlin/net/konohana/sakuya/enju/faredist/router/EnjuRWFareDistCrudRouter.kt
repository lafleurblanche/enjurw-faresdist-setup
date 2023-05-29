package net.konohana.sakuya.enju.faredist.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.enju.faredist.controller.enjuRWFareDistCrudController

fun Route.enjuRWFareDistCrudRouter() {
    enjuRWFareDistCrudController()
}
