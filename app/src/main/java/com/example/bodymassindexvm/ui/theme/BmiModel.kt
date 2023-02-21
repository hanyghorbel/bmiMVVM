package com.example.bodymassindexvm.ui.theme

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class BmiModel: ViewModel() {
    var heightInput: String by mutableStateOf("")
    var weightInput: String by mutableStateOf("")

    var bmi: Float = 0.0f
        get() {
            return calculate()
        }
    private var height: Float =0.0f
        get(){
            return heightInput.toFloatOrNull() ?: 0.0f
        }
    private var weight: Float =0.0f
        get(){
            return weightInput.toFloatOrNull() ?: 0.0f
        }
    fun changeHeightInput(value : String){
        heightInput= value
    }
    fun changeWeightInput(value : String){
        weightInput= value
    }
    private fun calculate(): Float{
        return if(weight>0 && height>0) weight/(height*height) else 0.0f
    }
}