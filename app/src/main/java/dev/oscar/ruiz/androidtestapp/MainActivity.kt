package dev.oscar.ruiz.androidtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        button.setOnClickListener {
            val firstValue = aInput.text.toString()
            val secondValue = bInput.text.toString()
            if (firstValue.isNotEmpty() && secondValue.isNotEmpty())
                calculate(firstValue.toInt(), secondValue.toInt())
            else showEmptyMessage()
        }
    }

    private fun calculate(numberA: Int, numberB: Int) {
        updateResult((numberA + numberB).toString() )
    }

    private fun updateResult(result: String) {
        textViewResult.text = result
    }

    private fun showEmptyMessage() {
        Toast.makeText(this, getString(R.string.empty_message), Toast.LENGTH_SHORT).show()
        textViewResult.text = ""
    }
}
