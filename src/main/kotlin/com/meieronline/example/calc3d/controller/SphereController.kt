package com.meieronline.example.calc3d.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.meieronline.example.calc3d.model.Sphere
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@RestController
class SphereController {

    @GetMapping("/geobody/sphere/area")
    fun area(
            @RequestParam(required = true) radius: Double
    ): String {
        if( radius < 0) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "radius must be a positive number")
        }
        val result = Sphere(radius).area()
        return result.toString()
    }

    @GetMapping("/geobody/sphere/volume")
    fun volume(
            @RequestParam(required = true) radius: Double
    ): String {
        if( radius < 0) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "radius must be a positive number")
        }
        val result = Sphere(radius).volume()
        return result.toString()
    }

}