package com.example.registerproject.model

import java.io.Serializable

data class User(
    var name: String,
    var email: String,
    var cpf: String,
    var rg: String,
    var phone: String,
    var birth: String,
    var cep: String,
    var country: String,
    var state: String,
    var city: String,
    var district: String,
    var street: String,
    var streetnumber: String,
    var complement: String,
    var password: String
) : Serializable