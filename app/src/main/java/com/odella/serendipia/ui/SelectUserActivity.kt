package com.odella.serendipia.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.odella.serendipia.R
import com.odella.serendipia.viewmodel.SelectUserViewModel

class SelectUserActivity: AppCompatActivity() {
    private val viewModel: SelectUserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {viewModel.isLoading.value}
        }
        setContentView(R.layout.activity_select_user)
    }
}