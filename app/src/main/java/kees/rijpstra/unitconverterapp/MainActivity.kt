package kees.rijpstra.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptIntrinsicBLAS.UNIT
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kees.rijpstra.unitconverterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val units: Array<String> = arrayOf("Kilo", "Gram", "Ounce", "Tonne", "Pound")
    val units2: Array<String> = arrayOf("Kilo", "Gram", "Ounce", "Tonne")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mSelectedOption = 0
        var mSelectedOption2 = 0

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


        val button = binding.calculateButton
        button.setOnClickListener {
            calculate()
        }

        //initalize spinner
        val arrayAdapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item,units)
        // spinner1
        binding.spinner.adapter = arrayAdapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                mSelectedOption = position
                    Toast.makeText(this@MainActivity, "im a kilo $mSelectedOption", Toast.LENGTH_SHORT).show()



            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



        // 2nd spinner

        val arrayAdapter2 = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item,units)

        binding.spinner2.adapter = arrayAdapter2
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                    mSelectedOption2 = position

                Toast.makeText(this@MainActivity, "option is $mSelectedOption2", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }




}


