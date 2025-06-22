package com.ganeevrm.android.weatherapp.extensions

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class Extensions(){
    fun Fragment.isPermissionGranted(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            activity as AppCompatActivity,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }
}