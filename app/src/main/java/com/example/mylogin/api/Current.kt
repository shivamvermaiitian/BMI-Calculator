package com.example.realtimeweather.api

//data class Current(
//    val cloud: Int,
//    val condition: Condition,
//    val dewpoint_c: Double,
//    val dewpoint_f: Double,
//    val feelslike_c: Double,
//    val feelslike_f: Double,
//    val gust_kph: Double,
//    val gust_mph: Double,
//    val heatindex_c: Double,
//    val heatindex_f: Double,
//    val humidity: Int,
//    val is_day: Int,
//    val last_updated: String,
//    val last_updated_epoch: Int,
//    val precip_in: Double,
//    val precip_mm: Double,
//    val pressure_in: Double,
//    val pressure_mb: Double,
//    val temp_c: Double,
//    val temp_f: Double,
//    val uv: Double,
//    val vis_km: Double,
//    val vis_miles: Double,
//    val wind_degree: Int,
//    val wind_dir: String,
//    val wind_kph: Double,
//    val wind_mph: Double,
//    val windchill_c: Double,
//    val windchill_f: Double
//)
data class Current(
    val cloud: String,
    val condition: Condition,
    val dewpoint_c: String,
    val dewpoint_f: String,
    val feelslike_c: String,
    val feelslike_f: String,
    val gust_kph: String,
    val gust_mph: String,
    val heatindex_c: String,
    val heatindex_f: String,
    val humidity: String,
    val is_day: String,
    val last_updated: String,
    val last_updated_epoch: String,
    val precip_in: String,
    val precip_mm: String,
    val pressure_in: String,
    val pressure_mb: String,
    val temp_c: String,
    val temp_f: String,
    val uv: String,
    val vis_km: String,
    val vis_miles: String,
    val wind_degree: String,
    val wind_dir: String,
    val wind_kph: String,
    val wind_mph: String,
    val windchill_c: String,
    val windchill_f: String
)


