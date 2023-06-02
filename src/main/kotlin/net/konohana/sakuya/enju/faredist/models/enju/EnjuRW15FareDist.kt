package net.konohana.sakuya.enju.faredist.models.enju

import org.jetbrains.exposed.sql.Table

/**
 * ## EnjuRW15FareDistモデル
 * * 荍谷線営業キロ情報
 * @author lafleurblanche
 */
object EnjuRW15FareDist : Table("enju_rw15_faredist") {
    /** ID(自動採番) */
    val id = integer("id").autoIncrement()
    /** 駅名コード */
    val staCode = varchar("sta_code", length = 20)
    /** 駅名 */
    val staName = varchar("sta_name", length = 20)
    /** 起点駅コード */
    val startingPointStaCode = varchar("strt_pt_sta_code", length = 20)
    /** 営業キロ */
    val distance = double("distance")
}
