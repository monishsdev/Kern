package com.kern.engine

import android.graphics.Canvas
import android.graphics.Paint

class WatchFaceRenderer {
    private val paint: Paint = Paint().apply {
        color = 0xFFFFFF
        textSize = 50f
    }

    fun render(canvas: Canvas) {
        canvas.drawColor(0x000000) // Set background to black
        canvas.drawText("Watch Face", 100f, 100f, paint) // Draw the text on the canvas
    }
}