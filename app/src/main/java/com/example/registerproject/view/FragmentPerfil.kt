package com.example.registerproject.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.registerproject.R

class FragmentPerfil : Fragment(R.layout.fragment_perfil) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonPerfiltoService).setOnClickListener {
            findNavController().navigate(R.id.actionPerfilToService)
        }
    }
}