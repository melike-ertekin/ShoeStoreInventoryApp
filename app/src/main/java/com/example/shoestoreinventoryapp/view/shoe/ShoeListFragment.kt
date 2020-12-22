package com.example.shoestoreinventoryapp.view.shoe

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestoreinventoryapp.R
import com.example.shoestoreinventoryapp.adapter.ShoeAdapter
import com.example.shoestoreinventoryapp.databinding.FragmentShoeListBinding
import com.example.shoestoreinventoryapp.viewmodel.SharedViewModel


/**
 * A fragment representing a list of Items.
 */
class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    private lateinit var shoeAdapter: ShoeAdapter
    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        setHasOptionsMenu(true)

        //use requiredActivity() to create activity level viewModel
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        //binding.sharedViewModel = sharedViewModel
        //binding.setLifecycleOwner(this)

        sharedViewModel.shoes.observe(viewLifecycleOwner, Observer {
            shoeAdapter = ShoeAdapter(it)
            binding.shoeList.adapter = shoeAdapter
        })




        binding.fab.setOnClickListener(
          Navigation.createNavigateOnClickListener(R.id.action_shoeListFragment_to_detailShoeFragment)
        )


        return binding.root
    }





    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.owerflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onOptionsItemSelected(item)

    }


}