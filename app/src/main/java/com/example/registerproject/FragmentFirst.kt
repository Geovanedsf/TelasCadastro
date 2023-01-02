package com.example.registerproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            findNavController().navigate(R.id.actionFirstRegisterToSecond)
        }
        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            findNavController().navigate(R.id.actionFirstLoginToSecond)
        }

        view.findViewById<Button>(R.id.buttonForgot).setOnClickListener {
            findNavController().navigate(R.id.actionFristForgotToFour)
        }
    }
}