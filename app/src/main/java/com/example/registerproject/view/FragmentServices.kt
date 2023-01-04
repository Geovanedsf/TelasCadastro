package com.example.registerproject.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.example.registerproject.R


class FragmentServices : Fragment(R.layout.fragment_services) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.imageButton3Easy).setOnClickListener {
            findNavController().navigate(R.id.actionThirdTypeServiceToFive)
        }
        view.findViewById<ImageButton>(R.id.imageButtonMedium).setOnClickListener {
            findNavController().navigate(R.id.actionThirdTypeServiceToFive)
        }
        view.findViewById<ImageButton>(R.id.imageButton2Hard).setOnClickListener {
            findNavController().navigate(R.id.actionThirdTypeServiceToFive)
        }
    }
}