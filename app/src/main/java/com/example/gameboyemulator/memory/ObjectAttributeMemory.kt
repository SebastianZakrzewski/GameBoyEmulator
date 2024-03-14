package com.example.gameboyemulator.memory

class ObjectAttributeMemory {

    companion object {
        private var instance: ObjectAttributeMemory? = null;

        fun getInstance(): ObjectAttributeMemory {
            if (instance == null) {
                instance = ObjectAttributeMemory()
            }
            return instance!!
        }
    }

}