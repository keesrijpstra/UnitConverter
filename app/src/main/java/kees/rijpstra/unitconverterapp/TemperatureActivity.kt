package kees.rijpstra.unitconverterapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat

import kees.rijpstra.unitconverterapp.databinding.ActivityTemperatureBinding
import java.math.BigDecimal
import java.math.RoundingMode

class TemperatureActivity : AppCompatActivity() {


    private lateinit var binding: ActivityTemperatureBinding
    //list of units
    val units: Array<String> = arrayOf("Celsius", "Fahrenheit", "Kelvin")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.myToolbar)
        val switchChecked = binding.theme

        switchChecked.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // makes the colors darker for dark mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val toolBar = binding.myToolbar
                val icon = binding.toolBarIcon
                val bg = binding.bgRed
                val outcome = binding.tvOutcome
                outcome.setTextColor(ContextCompat.getColor(this,R.color.red_dark))
                outcome.setHintTextColor(ContextCompat.getColor(this,R.color.red_dark))
                bg.setImageResource(R.drawable.red_bg_dark)



                toolBar.setBackgroundColor(Color.parseColor("#ba000d"))
                icon.setImageResource(R.drawable.ic_baseline_light_mode_24)

            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        // initializes the stored positions
        var mSelectedOption = 0
        var mSelectedOption2 = 0

        // converter logic
        fun calculate() {
            var insertedAmount = binding.editInput.text.toString()


            // celcius logic

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() * 1
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 9/5 + 32
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() + 273.15
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }
            // fahrenheit logic
            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 0){
                var f = insertedAmount.toDouble()
                var c = (f - 32.0) * 5.0 / 9.0;
                var resultInNumbers = c

                binding.tvOutcome.text = c.toString()

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 1
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }



            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 2){
                var f = insertedAmount.toDouble()
                var c = (f - 32.0) * 5.0 / 9.0 + 273.15;
                var resultInNumbers = c
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }
            // kelvin logic
            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() - 273.15
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 1){
                var f = insertedAmount.toDouble()
                var c = (f - 273.15) * 9.0 / 5.0 + 32;
                var resultInNumbers = c
                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString
            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() * 1

                val bd = BigDecimal(resultInNumbers)
                val roundOff = bd.setScale(2, RoundingMode.FLOOR)
                val roundOffToString = roundOff.toString()
                binding.tvOutcome.text = roundOffToString

            }








        }

        // initialize button
        val button = binding.calculateButton
        button.setOnClickListener {
            calculate()
        }

        //initalize spinner
        val arrayAdapter = ArrayAdapter(this@TemperatureActivity, android.R.layout.simple_spinner_dropdown_item,units)
        // spinner1 dropdownlist
        binding.spinner.adapter = arrayAdapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                mSelectedOption = position

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



        // 2nd spinner dropdownlist
        //initalize spinner
        val arrayAdapter2 = ArrayAdapter(this@TemperatureActivity, android.R.layout.simple_spinner_dropdown_item,units)

        binding.spinner2.adapter = arrayAdapter2
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //stores at what position the spinner is
                mSelectedOption2 = position

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}