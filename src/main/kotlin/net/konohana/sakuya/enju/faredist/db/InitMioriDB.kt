package net.konohana.sakuya.enju.faredist.db

import org.jetbrains.exposed.sql.Database

fun initMioriDB(url: String, username: String, password: String) = Database.connect(
    url = url,
    driver = "org.postgresql.Driver",
    user = username,
    password = password
)
