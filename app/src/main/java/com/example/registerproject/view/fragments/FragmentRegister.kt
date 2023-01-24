package com.example.registerproject.view.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.registerproject.model.User
import com.example.registerproject.R
import com.example.registerproject.viewModel.UsersViewModel

class FragmentRegister : Fragment(R.layout.fragment_register) {

    private lateinit var viewModel: UsersViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        register(view)
    }

    private fun register(view: View) {

        val name = view.findViewById<EditText>(R.id.editTextName)
        val email = view.findViewById<EditText>(R.id.editTextTextEmailCadastro)
        val cpf = view.findViewById<EditText>(R.id.TextCPF)
        val rg = view.findViewById<EditText>(R.id.TextRG)
        val phone = view.findViewById<EditText>(R.id.editTextPhone)
        val password = view.findViewById<EditText>(R.id.editTextNewPassword)
        val birth = view.findViewById<EditText>(R.id.TextDate)
        val cep = view.findViewById<EditText>(R.id.TextCEP)
        val country = view.findViewById<EditText>(R.id.TextCountry)
        val district = view.findViewById<EditText>(R.id.TextDistrict)
        val city = view.findViewById<EditText>(R.id.TextCity)
        val state = view.findViewById<EditText>(R.id.TextState)
        val street = view.findViewById<EditText>(R.id.TextLogradouro)
        val numberstreet = view.findViewById<EditText>(R.id.TextNumeroRes)
        val complement = view.findViewById<EditText>(R.id.TextComplement)

        val user = User(
            name = name.text.toString(),
            email = email.text.toString(),
            cpf = cpf.text.toString(),
            rg = rg.text.toString(),
            phone = phone.text.toString(),
            password = password.text.toString(),
            birth = birth.text.toString(),
            cep = cep.text.toString(),
            country = country.text.toString(),
            district = district.text.toString(),
            city = city.text.toString(),
            state = state.text.toString(),
            street = street.text.toString(),
            streetnumber = numberstreet.text.toString(),
            complement = complement.text.toString()
        )

        view.findViewById<Button>(R.id.buttonCreatAccount).setOnClickListener {


            val action =
                com.example.registerproject.view.fragments.FragmentRegisterDirections.actionCreatAccToPerfil(
                    user
                )
            findNavController().navigate(action)
        }
    }
}