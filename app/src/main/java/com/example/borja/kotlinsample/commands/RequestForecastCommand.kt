package com.example.borja.kotlinsample.commands

import com.example.borja.kotlinsample.data.ForecastRequest
import com.example.borja.kotlinsample.domain.mappers.ForecastDataMapper
import com.example.borja.kotlinsample.domain.model.ForecastList

class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}