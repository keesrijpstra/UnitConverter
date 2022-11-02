package kees.rijpstra.unitconverterapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptIntrinsicBLAS.UNIT
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

import kees.rijpstra.unitconverterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //viewBinding
    private lateinit var binding: ActivityMainBinding

    //list of units
    val units: Array<String> = arrayOf("Kilo", "Gram", "Ounce", "Tonne", "Pound")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.myToolbar)
        val switchChecked = binding.theme

        switchChecked.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val toolBar = binding.myToolbar
                toolBar.setBackgroundColor(Color.parseColor("#f44336"))
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


            // kilos

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() * 1
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 1000
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() * 35.274
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 3){
                var resultInNumbers = insertedAmount.toDouble() * 0.001
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 0 && mSelectedOption2 == 4){
                var resultInNumbers = insertedAmount.toDouble() * 2.20462
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }
            // einde kilos

            // grammen
            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() / 1000
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() / 1
                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() / 28.35

                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 3){
                var resultInNumbers = insertedAmount.toDouble() / 1000000

                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 1 && mSelectedOption2 == 4){
                var resultInNumbers = insertedAmount.toDouble() / 453.6

                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            //einde grammen

            // ounce

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() / 35.274


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 28.35


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() * 1


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 3){
                var resultInNumbers = insertedAmount.toDouble() / 35270


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 2 && mSelectedOption2 == 4){
                var resultInNumbers = insertedAmount.toDouble() / 16


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            // einde ounces

            // tonnen

            if (insertedAmount.isNotEmpty() && mSelectedOption == 3 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() * 1000


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 3 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 1000000


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 3 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() * 35270


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 3 && mSelectedOption2 == 3){
                var resultInNumbers = insertedAmount.toDouble() * 1


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }
            if (insertedAmount.isNotEmpty() && mSelectedOption == 3 && mSelectedOption2 == 4){
                var resultInNumbers = insertedAmount.toDouble() * 2205


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            // einde tonnes
            //pounds
            if (insertedAmount.isNotEmpty() && mSelectedOption == 4 && mSelectedOption2 == 0){
                var resultInNumbers = insertedAmount.toDouble() / 2.205


                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }
            if (insertedAmount.isNotEmpty() && mSelectedOption == 4 && mSelectedOption2 == 1){
                var resultInNumbers = insertedAmount.toDouble() * 453.6



                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }

            if (insertedAmount.isNotEmpty() && mSelectedOption == 4 && mSelectedOption2 == 2){
                var resultInNumbers = insertedAmount.toDouble() * 16



                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }
            if (insertedAmount.isNotEmpty() && mSelectedOption == 4 && mSelectedOption2 == 3){
                var resultInNumbers = insertedAmount.toDouble() / 2205



                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }
            if (insertedAmount.isNotEmpty() &&  mSelectedOption == 4 && mSelectedOption2 == 4){
                var resultInNumbers = insertedAmount.toDouble() * 1



                var resultInCharacters = resultInNumbers.toString()
                binding.tvOutcome.text = resultInCharacters

            }






        }

        // initialize button
        val button = binding.calculateButton
        button.setOnClickListener {
            calculate()
        }

        //initalize spinner
        val arrayAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item,units)
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
        val arrayAdapter2 = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item,units)

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


