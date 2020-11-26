package com.meieronline.example.calc3d.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest
class SphereControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `calculating cube volume returns value`() {

        mockMvc.get("/geobody/sphere/volume?radius=0"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { isOk }
            content { contentTypeCompatibleWith(MediaType.TEXT_PLAIN) }
            content { string("0.0") }
        }
    }

    @Test
    fun `calculating cube area returns value`() {

        mockMvc.get("/geobody/sphere/area?radius=0"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { isOk }
            content { contentTypeCompatibleWith(MediaType.TEXT_PLAIN) }
            content { string("0.0") }
        }
    }
}