package com.meieronline.example.calc3d.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.meieronline.example.calc3d.model.Sphere

@RestController
class SphereController {

    @GetMapping("/geobody/sphere/area")
    fun area(
            @RequestParam(required = true) radius: Double
    ): String {
        if( radius < 0) {
            throw IllegalArgumentException("length must be a positive number")
        }
        val result = Sphere(radius).area()
        return result.toString()
    }

    @GetMapping("/geobody/sphere/volume")
    fun volume(
            @RequestParam(required = true) radius: Double
    ): String {
        if( radius < 0) {
            throw IllegalArgumentException("length must be a positive number")
        }
        val result = Sphere(radius).volume()
        return result.toString()
    }

}