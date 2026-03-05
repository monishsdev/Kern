package com.kern.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WidgetPanel(widgets: List<@Composable () -> Unit>) {
    Column(modifier = Modifier.fillMaxSize()) {
        for (widget in widgets) {
            widget()
        }
    }
}

@Preview
@Composable
fun PreviewWidgetPanel() {
    WidgetPanel(widgets = listOf(
        { /* Replace with actual widget composables */ }
    ))
}