package com.example.modified_unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.modified_unit_converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.myNavHost)
        return navController.navigateUp()|| return super.onSupportNavigateUp()
    }



}