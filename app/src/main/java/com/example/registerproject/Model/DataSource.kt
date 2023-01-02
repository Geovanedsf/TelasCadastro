package com.example.registerproject.Model

import android.annotation.SuppressLint

class DataSource {
    fun createDataSet() : ArrayList<User> {
        val list = ArrayList<User>()
        list.add(
            User(
                "Geovane da Silva Sauro",
                "geovane@hotmail.com",
                "02781605000",
                "1099199820",
                "51985555555",
                "20081992",
                "90640100",
                "Brasil",
                "Rio Grande do Sul",
                "Porto Alegre",
                "Santo Antônio",
                "Voltaire Pires",
                "100",
                "AP 01",
                "123456"
            )
        )
        return list
    }

    fun createSchedule() : ArrayList<Schedule> {
        val listSchedule = ArrayList<Schedule>()
        listSchedule.add(
            Schedule(
                "1",
                "1430",
                "Voltaire Pires",
                "90640100",
                "Santo Antônio",
                "100",
                "AP 01",
            )
        )
        return listSchedule
    }
}


