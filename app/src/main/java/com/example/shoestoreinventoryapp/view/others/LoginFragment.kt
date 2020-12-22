package com.example.shoestoreinventoryapp.view.others

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.shoestoreinventoryapp.R


import com.example.shoestoreinventoryapp.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //Data binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)


        binding.login.setOnClickListener{
            login()
            this.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        binding.signUp.setOnClickListener{
            login()
            this.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

        return binding.root
    }

    fun login(){

        with(binding) {
            val email = editTextLoginEmail.text
            val password = editTextLoginPassword.text

            Log.d("LOGIN", "$email $password")
        }


    }
}