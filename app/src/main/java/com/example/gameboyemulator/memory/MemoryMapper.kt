package com.example.gameboyemulator.memory

interface MemoryMapper {

    fun readWord(address: Int) : Short

    fun writeWord(address: Int, value: Short)
}