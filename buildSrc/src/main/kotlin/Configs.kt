import java.text.SimpleDateFormat
import java.util.*

object Configs {
    const val applicationId = "com.faskn.app.weatherapp"

    const val buildToolsVersion = "33.0.1"
    const val compileSdkVersion = 33
    const val targetSdkVersion = 33
    const val minSdkVersion = 21

    const val versionCode = 3
    const val versionName = "1.1.0"

    val buildTime = Date().format("yyyy-MM-dd'T'HH:mm'Z'", TimeZone.getTimeZone("UTC"))
    const val archivesBaseName = "weatherapp"
}

@Suppress("SimpleDateFormat")
private fun Date.format(format: String, tz: TimeZone) = SimpleDateFormat(format).apply {
    timeZone = tz
}.format(this)
