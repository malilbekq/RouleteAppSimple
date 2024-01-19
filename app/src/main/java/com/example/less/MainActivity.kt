package com.example.less

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.SideEffect
import com.example.less.rule_screen.RuleScreen
import com.example.less.ui.theme.Background
import com.example.less.ui.theme.LessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LessTheme {
                SideEffect {

                }

                Surface(
                    color = Background
                ) {
                    RuleScreen()
                }
            }
        }
    }
}

