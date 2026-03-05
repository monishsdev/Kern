package com.kern.engine

import java.util.*

class CustomizationEngine {
    private var theme: String = "Default"
    private var widgets: MutableMap<String, Any> = mutableMapOf()

    fun setTheme(newTheme: String) {
        theme = newTheme
        println("Theme has been set to: $theme")
    }

    fun getTheme(): String {
        return theme
    }

    fun setWidget(widgetName: String, widgetValue: Any) {
        widgets[widgetName] = widgetValue
        println("Widget '$widgetName' has been set to: $widgetValue")
    }

    fun getWidget(widgetName: String): Any? {
        return widgets[widgetName]
    }

    fun getAllWidgets(): Map<String, Any> {
        return widgets.toMap()
    }
}