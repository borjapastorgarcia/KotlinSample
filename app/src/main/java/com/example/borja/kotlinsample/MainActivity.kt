package com.example.borja.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter=ForecastListAdapter(items)

    }

    private val items = listOf(
            "Lunes 6/23",
            "Mart 6/23",
            "MIe 6/23",
            "Jue 6/23",
            "Vie 6/23",
            "Sab 6/23",
            "Dom 6/23"
    )
}
