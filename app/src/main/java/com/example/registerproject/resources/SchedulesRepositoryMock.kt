package com.example.registerproject.resources

import com.example.registerproject.model.Schedule

class SchedulesRepositoryMock {

    fun getSchedule(callback: (schedules: List<Schedule>) -> Unit) {
        Thread(Runnable {
            Thread.sleep(1000)
            callback.invoke(
                listOf(
                    Schedule(
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                    ),
                )
            )
        }).start()
    }
}
