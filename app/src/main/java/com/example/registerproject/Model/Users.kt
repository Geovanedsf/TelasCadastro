package com.example.registerproject.Model

import java.util.Date

data class User(
    var id: Int,
    var nome: String,
    var email: String,
    var cpf: String,
    var rg: Int,
    var tel: Int,
    var nascdate: Int,
    var cep: Int,
    var nationality: String,
    var state: String,
    var city: String,
    var district: String,
    var street: String,
    var streetnumber: Int,
    var complement: String,
    val senha: String,
)