package com.kern.ui.composables

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberGestureDetector
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun GestureNavigation(navController: NavController) {
    val context = LocalContext.current
    val gestureDetector = rememberGestureDetector { gestureData ->
        when {
            gestureData.isSwipeLeft -> {
                navController.popBackStack()
            }
            gestureData.isSwipeRight -> {
                // Handle the action for swipe right
            }
        }
    } 

    Modifier.pointerInput(Unit) {
        detectTapGestures(onPress = { offset ->
            // Handle tap gestures if necessary
            gestureDetector.detectGestures()
        })
    }
}

@Preview(showBackground = true)
@Composable
fun GestureNavigationPreview() {
    // This is just a preview of GestureNavigation
    // You can replace it with actual preview code
}
