package com.example.aplikasigithubuser

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String,
    var name: String,
    var followers: String,
    var following: String,
    var repository: String,
    var location: String,
    var company: String,
    var avatar: Int
) : Parcelable