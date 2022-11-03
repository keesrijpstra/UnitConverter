package kees.rijpstra.unitconverterapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import kees.rijpstra.unitconverterapp.databinding.ActivityLauncherBinding
import kees.rijpstra.unitconverterapp.databinding.ActivityMainBinding

class LauncherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLauncherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.myToolbar)
        val switchChecked = binding.theme

        switchChecked.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // makes the colors darker for dark mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val toolBar = binding.myToolbar
                val icon = binding.toolBarIcon


                toolBar.setBackgroundColor(Color.parseColor("#ba000d"))
                icon.setImageResource(R.drawable.ic_baseline_light_mode_24)

            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        binding.cardView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}