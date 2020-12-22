package com.example.shoestoreinventoryapp.view.shoe

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.shoestoreinventoryapp.R
import com.example.shoestoreinventoryapp.databinding.FragmentDetailShoeBinding
import com.example.shoestoreinventoryapp.model.Shoe
import com.example.shoestoreinventoryapp.viewmodel.SharedViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [DetailShoeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailShoeFragment : Fragment() {


    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentDetailShoeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_shoe, container, false)

        //use requiredActivity() to create activity level viewModel
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

         binding.sharedViewModel = sharedViewModel
         binding.shoe= Shoe("","",0.0,"")
         //binding.setLifecycleOwner(this)


        return binding.root
    }



}