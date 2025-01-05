plugins {
    id 'com.gradle.build-scan' version '3.15'
}

buildScan {
    // Optional settings for your build scan
    publishAlways()
    termsOfServiceUrl = 'https://gradle.com/terms-of-service'
    termsOfServiceAgree = 'yes'
}
