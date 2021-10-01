package ni.edu.uca.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener{calculateTip()}
    }

    private fun calculateTip(){
        val costOfService = (binding.costOfServiceEditText.text.toString()).toDouble()
        val tipOp = binding.tipsOptions.checkedRadioButtonId
        val tipPercentage = when(tipOp){
            R.id.twenty_percent_op -> 0.20
            R.id.eighteen_percent_op -> 0.18
            else -> 0.15
        }
        var tip = costOfService * tipPercentage
        val roundUp = binding.roundUpSwitch.isChecked

        if(roundUp){
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.result.text = getString(R.string.tip_amount, formattedTip)
    }

}

