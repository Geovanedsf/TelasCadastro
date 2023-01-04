package com.example.registerproject.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.registerproject.R
import com.example.registerproject.model.DataSourceService
import com.example.registerproject.viewModel.UsersViewModel
import java.nio.file.attribute.UserDefinedFileAttributeView

class FragmentLogin : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        private lateinit var viewModel: UsersViewModel

//        setLogin(view)

//        private fun setLogin(view: View) {
//            viewModel = ViewModelProvider(this, UsersViewModel.UsersViewModelFactory(DataSourceService())).get(UsersViewModel::class.java)
//        }


        view.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            findNavController().navigate(R.id.actionFirstRegisterToSecond)
        }



        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            findNavController().navigate(R.id.actionFirstLoginToSecond)
        }




        view.findViewById<Button>(R.id.buttonForgot).setOnClickListener {
            findNavController().navigate(R.id.actionFirstForgotToFour)
        }
    }
}