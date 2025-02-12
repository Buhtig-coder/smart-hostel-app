package com.example.smarthostelapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.smarthostelapp.ui.NavGraph
import com.example.smarthostelapp.ui.SmartHostelApp
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = FirebaseAuth.getInstance() // Initialize Firebase Auth

        setContent {
            NavGraph()
        }
    }
}

