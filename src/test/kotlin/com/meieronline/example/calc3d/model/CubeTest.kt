package com.meieronline.example.calc3d.model

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.withPrecision
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CubeTest {

    @Test
    fun volume() {
        val length = 5.0

        val result = Cube(length).volume()

        assertThat(result).isEqualTo(125.0, withPrecision(0.01))
    }

    @Test
    fun area() {
        val length = 5.0

        val result = Cube(length).area()

        assertThat(result).isEqualTo(150.0, withPrecision(0.01))
    }

    @Test
    fun equals() {
        val a = Cube(12.0)
        val b = Cube(12.0)
        assertThat(a).isEqualTo(b)
    }
}