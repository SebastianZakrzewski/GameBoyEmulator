package com.example.gameboyemulator
import com.example.gameboyemulator.memory.MemorySegmentManager
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MemoryTest {

    private lateinit var memory : MemorySegmentManager;


    @BeforeEach
    fun initalization() {
        memory = MemorySegmentManager();

    }


    @Test
    fun read_allow_to_access_to_array_of_memory() {




    }



}