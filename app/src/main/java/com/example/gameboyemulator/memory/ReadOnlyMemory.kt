package com.example.gameboyemulator.memory

class ReadOnlyMemory : Memory() {

    companion object {
        private var instance: ReadOnlyMemory? = null

        fun getInstance(): ReadOnlyMemory {
            if (instance == null) {
                instance =ReadOnlyMemory()
            }
            return instance!!
        }
    }



}