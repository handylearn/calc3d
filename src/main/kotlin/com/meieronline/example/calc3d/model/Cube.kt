package com.meieronline.example.calc3d.model

data class Cube(val length: Double) : GeoBody {

    override fun volume(): Double {
        return length * length * length
    }

    override fun area(): Double {
        return 6 * length * length
    }
}