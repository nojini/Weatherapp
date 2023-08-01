object _Dependencies {
    // kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinVersion}"

    // android support
    const val supportv4 = "androidx.legacy:legacy-support-v4:${Versions.supportVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesignVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    const val cardView = "androidx.cardview:cardview:${Versions.supportVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"

    // lifecycle
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    const val lifecycleAnnotation = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtxVersion}"

    // navigation
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    // room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"

    // hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"

    // rx
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
    const val rxAnimations = "com.mikhaellopez:rxanimation:${Versions.rxAnimationsVersion}"

    // network
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"

    // moshi
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverterVersion}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshiVersion}"
    const val moshiKapt = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"

    // picasso
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"

    // shadowView
    const val shadowView = "com.loopeer.lib:shadow:${Versions.shadowViewVersion}"

    // threetenabp
    const val threetenabp = "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabpVersion}"

    // algolia
    const val algolia = "com.algolia:algoliasearch-android:${Versions.algoliaVersion}"

    // stetho
    const val stethoCore = "com.facebook.stetho:stetho:${Versions.stethoVersion}"
    const val stethoOkHttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stethoVersion}"
    const val stethoUrlConnection = "com.facebook.stetho:stetho-urlconnection:${Versions.stethoVersion}"

    // timber
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    // test
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTestRunnerVersion}"
    const val androidxTestRules = "androidx.test:rules:${Versions.androidxTestRunnerVersion}"
    const val junitTestExt = "androidx.test.ext:junit-ktx:${Versions.junitExtVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val truth = "com.google.truth:truth:${Versions.truthVersion}"
    const val truthExt = "androidx.test.ext:truth:${Versions.truthExtVersion}"
    const val mockK = "io.mockk:mockk:${Versions.mockKVersion}"
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.coreTestingVersion}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectricVersion}"
}
