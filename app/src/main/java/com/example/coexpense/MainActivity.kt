package com.example.coexpense

import androidx.appcompat.app.AppCompatActivity
import com.example.coexpense.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculate.setOnClickListener {
            val numOfPeople: Int = binding.numOfPpl.text.toString().toInt()
            val rent: Double = binding.rentInput.text.toString().toDouble()
            val electric: Double = binding.electricInput.text.toString().toDouble()
            val utilities: Double = binding.utilitiesInput.text.toString().toDouble()
            val cable: Double = binding.cableInput.text.toString().toDouble()
            val other: Double = binding.otherInput.text.toString().toDouble()
            val subscriptions: Double = binding.subscriptionsInput.text.toString().toDouble()
            val groceries: Double = binding.groceriesInput.text.toString().toDouble()
            val misc: Double = binding.miscInput.text.toString().toDouble()

            val total: Double = rent + electric + utilities + cable + other + subscriptions + groceries + misc
            val perPerson: Double = total / numOfPeople

            // Update the TextView for the total value
            binding.totalOutput.text = String.format("%.2f", total)

            // Update the TextView for the per-person value
            binding.ppOutput.text = String.format("%.2f", perPerson)

        }

    }
}