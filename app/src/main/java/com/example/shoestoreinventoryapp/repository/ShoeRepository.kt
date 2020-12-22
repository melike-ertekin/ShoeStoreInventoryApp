package com.example.shoestoreinventoryapp.repository

import com.example.shoestoreinventoryapp.model.Shoe

class ShoeRepository{

    //Dummy data to show on shoe list on recyclerview
   fun getShoesData(): ArrayList<Shoe>{

        val shoe1 = Shoe("Hiking shoe", "Nike", 6.0, "This is a hiking shoe.")
        val shoe2 = Shoe("Running shoe", "Adidas", 7.0, "This is a hiking shoe.")

        val shoesList = arrayListOf<Shoe>(shoe1, shoe2, shoe1, shoe2, shoe1)

        return shoesList

    }

}