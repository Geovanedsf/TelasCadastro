package com.example.registerproject.model

class DataSource {
    fun getUser(callback: (users: User) -> Unit) {
        Thread {
            Thread.sleep(1000)
            callback.invoke(
                User(
                    "Geovane Silva Sauro",
                    "geovane@bol.com.br",
                    "02781104068",
                    "1010101010",
                    "51985555555",
                    "20/01/1992",
                    "90640100",
                    "Brasil",
                    "RS",
                    "Porto Alegre",
                    "STA",
                    "Rua Voltaire Pires",
                    "100",
                    "ap 01",
                    "123456"
                )
            )
        }.start()
    }
}


//class DataSourceService {
//    fun creatSchedule(callback: (schedules: List<Schedule>) -> Unit) {
//        Thread(Runnable {
//            Thread.sleep(1000)
//            callback.invoke(
//                listOf(
//                    Schedule(
//                        "",
//                        "",
//                        "",
//                        "",
//                        "",
//                        ""
//                    ),
//                )
//            )
//        }).start()
//    }
//}


