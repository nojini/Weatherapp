package com.faskn.app.weatherapp.core

/**
 * Created by Furkan on 2019-10-16
 */

object Constants {

    object NetworkService {
        const val BASE_URL = "http://api.openweathermap.org/data/2.5/"
        const val API_KEY_VALUE = "96527b8e56e593d8bae881cd0540bb3f"
        const val RATE_LIMITER_TYPE = "data"
        const val API_KEY_QUERY = "appid"
    }

    object AlgoliaKeys {
        const val APPLICATION_ID = "LEK179A3SC"
        const val SEARCH_API_KEY = "782c4c5049475aeae4904ea601932b5e"
    }

    object Coords {
        const val LAT = "lat"
        const val LON = "lon"
        const val METRIC = "metric"
    }
}
