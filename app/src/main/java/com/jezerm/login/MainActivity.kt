package com.jezerm.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jezerm.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val realUser = "usuario"
    private val realPassw = "contra"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
        this.init()
    }

    private fun init() {
        this.binding.btnLogin.setOnClickListener {
            this.login()
        }
        this.binding.btnClear.setOnClickListener {
            this.clear()
        }
    }

    private fun login() {
        val user = this.binding.etUser.text.toString()
        val passw = this.binding.etPassw.text.toString()

        if (user.equals(this.realUser) && passw.equals(this.realPassw)) {
            Toast.makeText(this, "¡Bienvenido $user!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No se pudo iniciar sesión", Toast.LENGTH_SHORT).show()
        }
    }

    private fun clear() {
        this.binding.etUser.setText("")
        this.binding.etPassw.setText("")
    }
}