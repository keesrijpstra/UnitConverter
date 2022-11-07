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


        val switchChecked = binding.theme

// checks if the lightmode toggle is checked
        switchChecked.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // makes the colors darker for dark mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)



            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
        // directs to other app page
        binding.cardView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // directs to other app page
        binding.cardView2.setOnClickListener {
            val intent = Intent(this, TemperatureActivity::class.java)
            startActivity(intent)
        }
    }
}