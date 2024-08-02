package com.vitorthemyth.componentscreator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.vitorthemyth.componentscreator.ui.presenter.JumpBottomBarSample
import com.vitorthemyth.componentscreator.ui.theme.ComponentscreatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComponentscreatorTheme {

                // Make system bars sticky and immersive
                val systemUiController = rememberSystemUiController()

                // Set the color of the system bars to transparent (optional)
                systemUiController.setSystemBarsColor(Color.Transparent)

                // Hide system bars and configure immersive behavior
                systemUiController.isSystemBarsVisible = false
                systemUiController.isNavigationBarVisible = false

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    JumpBottomBarSample()
                }
            }
        }
    }
}

