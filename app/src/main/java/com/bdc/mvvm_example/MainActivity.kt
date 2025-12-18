package com.bdc.mvvm_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.bdc.mvvm_example.ui.theme.MVVMexampleTheme
import com.bdc.mvvm_example.view.ProductosScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MVVMexampleTheme {
                ProductosScreen()
            }
        }
    }
}


