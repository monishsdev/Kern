package com.kern.security

class AbuseDetection {
    private val abusePatterns = listOf(
        "spam",
        "harassment",
        "hate speech",
        "threatening behavior"
    )

    fun isAbusive(message: String): Boolean {
        return abusePatterns.any { pattern -> message.contains(pattern, ignoreCase = true) }
    }
}

fun main() {
    val detector = AbuseDetection()
    val testMessages = listOf(
        "This is a spam message.",
        "I will hurt you!",
        "Just a regular message.",
        "Stop the hate speech!"
    )

    for (message in testMessages) {
        if (detector.isAbusive(message)) {
            println("Abusive detected: \$message")
        } else {
            println("Not abusive: \$message")
        }
    }
}