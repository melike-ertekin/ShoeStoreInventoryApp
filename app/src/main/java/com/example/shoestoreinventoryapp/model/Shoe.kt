package com.example.shoestoreinventoryapp.model
import androidx.databinding.BaseObservable

//extends BaseObservable for two way binding
data class Shoe (
    var name: String ,
    var company: String,
    var size: Double,
    var description: String
): BaseObservable()