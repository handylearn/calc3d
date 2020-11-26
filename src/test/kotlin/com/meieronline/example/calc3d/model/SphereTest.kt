package com.meieronline.example.calc3d.model

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.withPrecision
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SphereTest {

    @Test
    fun volume() {
        val radius = 5.0

        val result = Sphere(radius).volume()

        assertThat(result).isEqualTo(523.59877, withPrecision(0.01))
    }

    @Test
    fun area() {
        val radius = 5.0

        val result = Sphere(radius).area()

        assertThat(result).isEqualTo(314.15926, withPrecision(0.01))
    }

    @Test
    fun equals() {
        val a = Sphere(12.0)
        val b = Sphere(12.0)
        assertThat(a == b).isTrue()
    }
}