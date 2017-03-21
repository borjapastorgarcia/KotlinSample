package com.example.borja.kotlinsample.commands

public interface  Command<T>{
    fun execute():T
}