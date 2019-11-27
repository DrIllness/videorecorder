package com.drillness.videorecordertest.ext

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import kotlinx.coroutines.*

@WorkerThread
fun runBlockingInBackground(function: () -> Unit) {
    runBlocking {
        launch(Dispatchers.IO) {
            function.invoke()
        }
    }
}

@WorkerThread
fun runBlockingInBackground(function: () -> Unit, delayInMillis: Long) {
    runBlocking {
        launch(Dispatchers.IO) {
            delay(delayInMillis)
            function.invoke()
        }
    }
}

@WorkerThread
fun runInBackground(function: () -> Unit) {
    GlobalScope.launch {
        launch(Dispatchers.IO) {
            function.invoke()
        }
    }
}

@WorkerThread
fun runInBackground(function: () -> Unit, delayInMillis: Long) {
    GlobalScope.launch {
        launch(Dispatchers.IO) {
            delay(delayInMillis)
            function.invoke()
        }
    }
}

@MainThread
fun runBlockingInMainThread(function: () -> Unit) {
    runBlocking {
        launch(Dispatchers.Main) {
            function.invoke()
        }
    }
}

@MainThread
fun runBlockingInMainThread(function: () -> Unit, delayInMillis: Long) {
    runBlocking {
        launch(Dispatchers.Main) {
            delay(delayInMillis)
            function.invoke()
        }
    }
}

@MainThread
fun runInMainThread(function: () -> Unit) {
    GlobalScope.launch {
        launch(Dispatchers.Main) {
            function.invoke()
        }
    }
}

@MainThread
fun runInMainThread(function: () -> Unit, delayInMillis: Long) {
    GlobalScope.launch {
        launch(Dispatchers.Main) {
            delay(delayInMillis)
            function.invoke()
        }
    }
}
