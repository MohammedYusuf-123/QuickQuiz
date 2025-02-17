package com.example.quickquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quickquiz.screens.QuestionsViewModel
import com.example.quickquiz.ui.theme.QuickQuizTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val questionsViewModel : QuestionsViewModel
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuickQuizTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentWindowInsets = WindowInsets.safeContent
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuickQuizTheme {
        Greeting("Android", modifier = Modifier)
    }
}