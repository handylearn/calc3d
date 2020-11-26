package com.meieronline.example.calc3d.model

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.withPrecision
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.provider.CsvFileSource

internal class CubeTest {

    @Test
    fun volume() {
        val length = 5.0

        val result = Cube(length).volume()

        assertThat(result).isEqualTo(125.0, withPrecision(0.01))
    }

    @Test
    fun area() {
        val testData = arrayOf(
                Pair(0.0, 0.0),
                Pair(0.5, 1.5),
                Pair(1.0, 1.0),
                Pair(1000.0, 6000000.0))

        testData.forEach{(input, expected) ->

            val result = Cube(input).area()

            assertThat(result).isEqualTo(expected, withPrecision(0.01))
        }
    }

    @Test
    fun equals() {
        val a = Cube(12.0)
        val b = Cube(12.0)
        assertThat(a == b).isTrue()
    }
}