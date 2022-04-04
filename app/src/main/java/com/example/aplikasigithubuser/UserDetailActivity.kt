package com.example.aplikasigithubuser

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.aplikasigithubuser.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        binding.apply {
            textName.text = user.name
            textUsername.text = "@${user.username}"
            textLocation.text = "Location ${user.location}"
            textRepository.text = StringBuilder(user.repository).append(" Repository")
            textCompany.text = StringBuilder("Company ").append(user.company)
            textFollower.text = StringBuilder(user.followers).append(" Followers")
            textFollowing.text = StringBuilder(user.following).append(" Followers")
            Glide.with(binding.imageDetail.context)
                .load(user.avatar)
                .circleCrop()
                .into(binding.imageDetail)
        }
    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }
}