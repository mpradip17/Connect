package com.connect

import java.util.Locale
import java.util.regex.Pattern

object Validator {
    private const val PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-zA-Z]).{8,16})"

    private const val EMAIL_PATTERN =
        "^[-a-zA-Z0-9~!$%^&*_=+}{\'?]+(\\.[-a-zA-Z0-9~!$%^&*_=+}{\'?]+)*@([a-zA-Z0-9_][-a-zA-Z0-9_]*(\\.[-a-zA-Z0-9_]+)*\\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$"

    private fun emailValidation(email: String): Boolean {
        return Pattern.compile(EMAIL_PATTERN).matcher(
            email.lowercase(
                Locale.getDefault()
            )
        ).matches()
    }

    fun isInValidUserEmail(email: String): Boolean? {
        return if (emailValidation(email.trim { it <= ' ' })) {
            val userName: String = findUserNameFromEmail(email)
            userName.equals("notprovided", ignoreCase = true) || userName.equals(
                "noemail",
                ignoreCase = true
            ) || userName.equals("xyz", ignoreCase = true)
        } else true
    }

    fun findUserNameFromEmail(email: String): String {
        var email = email
        val index = email.indexOf('@')
        email = email.substring(0, index)
        return email
    }

    fun passwordValidator(password: String?): Boolean {
        return Pattern.compile(PASSWORD_PATTERN).matcher(password).matches()
    }

}