package com.example.registerproject.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.registerproject.R

class FragmentLogin : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            findNavController().navigate(R.id.actionFragmentHomeToPerfil)
        }


        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener{
            findNavController().navigate(R.id.actionFragmentHomeToRegister)
        }


        view.findViewById<Button>(R.id.buttonForgot).setOnClickListener {
//            findNavController().navigate(R.id.actionFirstForgotToFour)
        }
    }
}