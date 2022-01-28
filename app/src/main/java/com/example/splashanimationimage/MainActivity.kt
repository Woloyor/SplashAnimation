package com.example.splashanimationimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.navigation.compose.rememberNavController
import com.example.splashanimationimage.navigation.SetupNavGraph
import com.example.splashanimationimage.ui.theme.SplashAnimationImageTheme
import com.example.splashanimationimage.ui.theme.SplashAnimationImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashAnimationImageTheme {
                //splash
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)


                }
            //Animated elements
            Column {
                repeat(6) {
                    AnimatedShimmer()
                }
            }
        }
    }
}


