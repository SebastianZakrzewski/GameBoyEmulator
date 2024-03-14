package com.example.gameboyemulator.memory

open class RandomAccessMemory : Memory() {

    companion object {
        private var instance: RandomAccessMemory? = null;

        fun getInstance(): RandomAccessMemory {
            if (instance == null) {
                instance = RandomAccessMemory()
            }
            return instance!!
        }
    }

}