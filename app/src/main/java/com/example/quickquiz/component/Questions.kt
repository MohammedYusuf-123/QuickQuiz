package com.example.quickquiz.component

import android.util.Log
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quickquiz.screens.QuestionsViewModel
import com.example.quickquiz.util.AppColors

@Composable
fun Questions(viewModel: QuestionsViewModel){
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true){
        CircularProgressIndicator()
        Log.d("Loading", "Loading....")
    } else {
        Log.d("Loading", "Loading Stopped!!!")
        viewModel.data.value.data?.forEach { questionItem ->
            Log.d("Questions", "Questions: ${questionItem.question}")
        }
        Log.d("Size", "Questions: ${questions?.size}")
    }
}

@Composable
@Preview
fun QuestionDisplay() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(4.dp),
        color = AppColors.mDarkPurple
    ) {

    }
}