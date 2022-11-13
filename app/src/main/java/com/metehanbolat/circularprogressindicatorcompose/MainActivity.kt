package com.metehanbolat.circularprogressindicatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.circularprogressindicatorcompose.ui.theme.CircularProgressIndicatorComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularProgressIndicatorComposeTheme {

            }
        }
    }
}