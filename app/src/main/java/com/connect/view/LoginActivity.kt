package com.connect.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.connect.MainActivity
import com.connect.R
import com.connect.databinding.ActivityLoginBinding
import com.connect.Validator

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnContinue.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        binding.btnCreate.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    /**
     * A method to validate the user email is valid or not
     */
    private fun isUserEmailValid(emailText: String): Boolean {

        if (Validator.isInValidUserEmail(emailText) == true) {
            with(binding) {
                val emailErrorMessage: String
                if (emailText.trim().isNotEmpty()) {
                    emailErrorMessage = getString(R.string.email_validation)
                } else {
                    emailErrorMessage = getString(R.string.email_blank)
                }
                return false
            }
        }
        return true
    }

    /**
     * A method to validate the user password is valid or not
     */
    private fun isUserPasswordValid(passwordText: String): Boolean {
        if (!Validator.PasswordValidator(passwordText)) {
            with(binding) {
                val passwordErrorText: String = if (passwordText.trim().isNotEmpty()) {
                    getString(R.string.invalid_password)
                } else {
                    getString(R.string.password_blank)
                }
                return false
            }
        }
        return true
    }


}