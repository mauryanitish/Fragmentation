package com.nitish.fragmentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nitish.fragmentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var changeInterface : NumberInterface
    var num:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainIncrement.setOnClickListener {
            num++
            changeInterface.increment(num)
        }
        binding.btnMainDecrement.setOnClickListener {
            num--
            changeInterface.decrement(num)
        }
    }
    fun changeText(text:String){
        binding.tvMainTextView.setText(text)
    }
}