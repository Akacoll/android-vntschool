package com.akacoll.myapp.ex1

data class User(var firstName: String?, var lastName: String?)

// função de extensão
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}