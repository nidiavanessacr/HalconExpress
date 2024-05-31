package com.example.a01

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.core.app.ComponentActivity

abstract class BaseActivity: ComponentActivity()  {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayout())
    }
    @LayoutRes
    abstract fun getLayout(): Int
}