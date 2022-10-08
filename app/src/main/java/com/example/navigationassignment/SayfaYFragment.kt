package com.example.navigationassignment

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationassignment.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

    private lateinit var tasarim : FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         tasarim= FragmentSayfaYBinding.inflate(inflater, container, false)
        //Navigation.findNavController(it).navigate(androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner)
        return tasarim.root


    }





}