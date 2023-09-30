package ru.app.data

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.snapshots
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await

suspend fun <T> Task<T>.asFlow(): Flow<T> = callbackFlow {
    addOnCompleteListener { task ->
        if (task.isSuccessful) {
            trySend(task.result!!).isSuccess
        } else {
            close(task.exception ?: Exception("Unknown error"))
        }
    }

    awaitClose { /* Очистка, если нужно */ }
}