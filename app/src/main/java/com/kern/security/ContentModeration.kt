package com.kern.security

import java.util.regex.Pattern

class ContentModeration {

    private val prohibitedPatterns: List<Pattern> = listOf(
        Pattern.compile("(?i)spam"),
        Pattern.compile("(?i)offensive")
    )

    fun validateContent(content: String): Boolean {
        return !prohibitedPatterns.any { it.matcher(content).find() }
    }

    fun filterContent(content: String): String {
        return prohibitedPatterns.fold(content) { acc, pattern -> 
            pattern.matcher(acc).replaceAll("[Filtered]")
        }
    }
}