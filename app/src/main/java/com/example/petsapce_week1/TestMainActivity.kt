package com.example.petsapce_week1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petsapce_week1.accommodation.AccMainActivity
import com.example.petsapce_week1.accommodation.GlideApp
import com.example.petsapce_week1.databinding.ActivityHomeOnlyfortestBinding
import com.example.petsapce_week1.loginrelated.LoginActivity

class TestMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeOnlyfortestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeOnlyfortestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccomo.setOnClickListener {
            val intent = Intent(this@TestMainActivity, AccMainActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this@TestMainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnPlacetogo.setOnClickListener {
            val intent = Intent(this@TestMainActivity, PlacetogoActivity::class.java)
            startActivity(intent)
        }

        binding.btnReservation.setOnClickListener {
            val intent = Intent(this@TestMainActivity, ReservationActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfile.setOnClickListener {
            val intent = Intent(this@TestMainActivity, ProfileMenuActivity::class.java)
            startActivity(intent)
        }

        GlideApp.with(this)
            .load("https://drive.google.com/uc?export=view&id=1L4aUKeQE5eBrqed764MCHOTiP97TAmMV")
            .fitCenter()
            .override(200)
            .into(binding.imgfortest)



    }

}