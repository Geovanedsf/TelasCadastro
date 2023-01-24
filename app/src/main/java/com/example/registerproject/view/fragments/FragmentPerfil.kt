package com.example.registerproject.view.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.registerproject.R
import kotlinx.android.synthetic.main.fragment_perfil.*

class FragmentPerfil : Fragment(R.layout.fragment_perfil) {

    private val args: com.example.registerproject.view.fragments.FragmentPerfilArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setProfileData()
        perfil(view)

        view.findViewById<Button>(R.id.buttonPerfiltoService).setOnClickListener {
            findNavController().navigate(R.id.actionPerfilToService)
        }
    }

    private fun perfil(view: View) {

        view.findViewById<TextView>(R.id.textNamePerfil).text = args.user.name
        view.findViewById<TextView>(R.id.textEmailPerfil).text = args.user.email
        view.findViewById<TextView>(R.id.textCpfPerfil).text = args.user.cpf
        view.findViewById<TextView>(R.id.textRgPerfil).text = args.user.rg
        view.findViewById<TextView>(R.id.textCpfPerfil).text = args.user.cep
        view.findViewById<TextView>(R.id.textBirthPerfil).text = args.user.birth
        view.findViewById<TextView>(R.id.textCountryPerfil).text = args.user.country
        view.findViewById<TextView>(R.id.textStatePerfil).text = args.user.state
        view.findViewById<TextView>(R.id.textCityPerfil).text = args.user.city
        view.findViewById<TextView>(R.id.textDistrictPerfil).text = args.user.district
        view.findViewById<TextView>(R.id.textStreetPerfil).text = args.user.street
        view.findViewById<TextView>(R.id.textStreetNumPerfil).text = args.user.streetnumber
        view.findViewById<TextView>(R.id.textComplementPerfil).text = args.user.complement
    }


    fun setProfileData() {
        textNamePerfil.text = args.user.name
        textEmailPerfil.text = args.user.email
        textCpfPerfil.text = args.user. cpf
        textRgPerfil.text = args.user.rg
        textPhonePerfil.text = args.user.phone
        textCepPerfil.text = args.user.cep
        textBirthPerfil.text = args.user.birth
        textCountryPerfil.text = args.user.country
        textStatePerfil.text = args.user.state
        textCityPerfil.text = args.user.city
        textDistrictPerfil.text = args.user.district
        textStreetPerfil.text = args.user.street
        textStreetNumPerfil.text = args.user.streetnumber
        textComplementPerfil.text = args.user.complement
    }
}