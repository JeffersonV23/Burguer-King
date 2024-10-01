package com.example.burguerking

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

val auth: FirebaseAuth = Firebase.auth

fun signUpUser(email: String, password: String) {
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Usuario registrado con éxito
            } else {
                // Error
            }
        }
}


