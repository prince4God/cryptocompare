# CryptoCompare
Andela Android Learning Community Intermediate Track Challenge; A Google/Andela Learning Community (ALC) 2.0 Assessment Project for Nigerians and Kenyans by Prince Chimaobim Nwaubuikwu

# CryptoCompare Andela-ALC-Assessment


# The Challenge

Build an Android application to show the latest exchange rate between cryptocurrencies (BTC and ETH) and 20 major world currencies including Naira. Use the crypyocompare public api to get the latest exchange rate

Users can create cards on the application screen to show the exchange rate between cryptocurrency and any of 20 major world currency including Naira. Take a look at this Clicking each card should take you to conversion screen. User can enter an amount to be converted in a base currency User should get conversion result

# Dependencies

Uses Internet permissions in AndroidManifest.xml file.

compile fileTree(dir: 'libs', include: ['*.jar']) androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', { exclude group: 'com.android.support', module: 'support-annotations' }) compile 'com.android.support:appcompat-v7:26.+' compile 'com.android.support.constraint:constraint-layout:1.0.2' testCompile 'junit:junit:4.12'

    
    //Add Library
    compile 'com.android.support:cardview-v7:26.+'
    compile 'com.android.support:support-v4:26.+'

    //material Spinner
    compile 'com.jaredrummler:material-spinner:1.1.0'

    //Retrofit + Picassa
    compile 'com.squareup.retrofit2:retrofit:2.3.0'
    compile 'com.squareup.retrofit2:converter-gson:2.3.0'
    compile 'com.squareup.picasso:picasso:2.5.2'

    // RecyclerView
    compile 'com.android.support:recyclerview-v7:26.+'


    compile 'com.android.support:design:26.+'

    // Glide
    compile 'com.github.bumptech.glide:glide:3.7.0'

    //
    compile 'org.jbundle.util.osgi.wrapped:org.jbundle.util.osgi.wrapped.org.apache.http.client:4.1.2'
    compile 'com.android.volley:volley:1.0.0'
    testCompile 'junit:junit:4.12'
    
    This app converts crypto-currencies into at least 20 currencies including Nigeria Naira. This is what the crypto-currency dashboard looks like: https://user-images.githubusercontent.com/25517682/32408645-e24b0f4a-c19b-11e7-8b70-8cb55ab4f7bb.png
    

Cryptocurrency fast convert page: https://user-images.githubusercontent.com/25517682/32408647-e80ee686-c19b-11e7-98c9-2c1faa37ce27.png

About page: https://user-images.githubusercontent.com/25517682/32408657-26274e2c-c19c-11e7-88bf-e337ff190e4b.png

Credit page: https://user-images.githubusercontent.com/25517682/32408658-275b4ab4-c19c-11e7-9bbf-58c0c70fa9b8.png
