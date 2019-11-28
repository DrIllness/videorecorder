package com.drillness.videorecordertest.ext

import androidx.annotation.WorkerThread
import kotlinx.coroutines.*

@WorkerThread
fun runInBackground(function: () -> Unit) {
    GlobalScope.launch {
        launch(Dispatchers.IO) {
            function.invoke()
        }
    }
}

