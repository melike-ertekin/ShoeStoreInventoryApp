package com.example.shoestoreinventoryapp.viewmodel
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.shoestoreinventoryapp.model.Shoe
import com.example.shoestoreinventoryapp.repository.ShoeRepository

class SharedViewModel: ViewModel() {

    private val _shoes = MutableLiveData<ArrayList<Shoe>>()

    val shoes: LiveData<ArrayList<Shoe>>
        get() = _shoes

    fun addShoe(v:View, shoe: Shoe){
        _shoes.value?.add(shoe)
        navigateUp(v)
    }
    init {
        getShoes()
    }
    fun getShoes(){
        _shoes.value = ShoeRepository().getShoesData()
    }

    fun navigateUp(v: View){
        v.findNavController().navigateUp()
    }
}