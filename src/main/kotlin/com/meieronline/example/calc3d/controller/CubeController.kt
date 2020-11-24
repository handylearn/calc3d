package com.meieronline.example.calc3d.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.meieronline.example.calc3d.model.Cube

@RestController
class CubeController {

    @GetMapping("/geobody/cube/area")
    fun area(
            @RequestParam(required = true) length: Double
    ): String {
        if( length < 0) {
            throw IllegalArgumentException("length must be a positive number")
        }
        val result = Cube(length).area()
        return result.toString()
    }

    @GetMapping("/geobody/cube/volume")
    fun volume(
            @RequestParam(required = true) length: Double
    ): String {
        if( length < 0) {
            throw IllegalArgumentException("length must be a positive number")
        }
        val result = Cube(length).volume()
        return result.toString()
    }

}