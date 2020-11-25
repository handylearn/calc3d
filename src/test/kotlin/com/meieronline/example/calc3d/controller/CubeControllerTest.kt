package com.meieronline.example.calc3d.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.get

@WebMvcTest
class CubeControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `calculating cube volume returns value`() {

        mockMvc.get("/geobody/cube/volume?length=2"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { isOk }
            content { contentTypeCompatibleWith(MediaType.TEXT_PLAIN) }
            content { string("8.0") }
        }
    }

    @Test
    fun `giving negative cube length returns error`() {

        mockMvc.get("/geobody/cube/volume?length=-2"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { is4xxClientError }
        }
    }

    @Test
    fun `giving invalid cube length returns error`() {

        mockMvc.get("/geobody/cube/volume?length=invalid"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { is4xxClientError }
        }
    }

    @Test
    fun `calculating cube area returns value`() {

        mockMvc.get("/geobody/cube/area?length=2"){
            contentType = MediaType.TEXT_PLAIN
        }.andExpect {
            status { isOk }
            content { contentTypeCompatibleWith(MediaType.TEXT_PLAIN) }
            content { string("24.0") }
        }
    }

}