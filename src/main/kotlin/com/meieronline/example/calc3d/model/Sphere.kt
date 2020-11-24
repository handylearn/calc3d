package com.meieronline.example.calc3d.model

import kotlin.math.pow

data class Sphere(val radius: Double) : GeoBody {

    override fun volume(): Double {
        return (4.0 / 3.0) * Math.PI * radius.pow(3)
    }

    override fun area(): Double {
        return 4 * Math.PI * radius * radius
    }
}