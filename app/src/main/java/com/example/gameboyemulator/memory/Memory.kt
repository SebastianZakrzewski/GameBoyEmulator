package com.example.gameboyemulator.memory

open class Memory() {

    init {
        setupMemory();
    }

    private val instances = mutableMapOf<Any, Any>();

    companion object {

        private val instance: Memory by lazy {
            Memory()
        }


    }

    private fun setupMemory () {
        instances[ReadOnlyMemory::class] = ReadOnlyMemory.getInstance();
        instances[RandomAccessMemory::class] = RandomAccessMemory.getInstance();
        instances[ObjectAttributeMemory::class] = ObjectAttributeMemory.getInstance();

    }

    private val memoryArray = Array<Byte>(64 * 1024) { 0 }

    fun getMemoryArray(): Array<Byte> {
        return memoryArray
    }




}