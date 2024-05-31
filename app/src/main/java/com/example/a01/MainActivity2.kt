package com.example.a01

import Login.LoginContract
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity(),LoginContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn: Button = findViewById(R.id.button_signin)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
    }}

    override fun showError(msgError: String) {
        Toast.makeText( this,msgError, Toast.LENGTH_SHORT).show()
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun signIn() {
        Toast.makeText(this,"Prueba boton", Toast.LENGTH_SHORT).show()
    }
}