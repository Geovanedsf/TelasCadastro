package com.example.registerproject.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.registerproject.model.DataSource
import com.example.registerproject.model.User

class UsersViewModel(private val repositoryMock: DataSource) : ViewModel() {

    var userLiveData = MutableLiveData<User>()

    fun getUser(){
        repositoryMock.getUser { user ->
            userLiveData.postValue(user)
        }
    }

    class UsersViewModelFactory (private val repositoryMock: DataSource) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return UsersViewModel(repositoryMock) as T
        }
    }
}