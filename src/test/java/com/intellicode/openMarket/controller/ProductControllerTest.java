package com.intellicode.openMarket.controller;

import org.junit.Test;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class ProductControllerTest extends DefaultWebAppTest {
    private static final int count = 100;

    @Test
    @Repeat(count)
    public void testCreate() throws Exception {
        String path = System.getProperty("user.dir");
        File file = new File(path + "/src/main/webapp/resources/img/za-wp5_freest80.jpg");
        Random r = new Random();
        int i = 1;
        mockMvc.perform(
                MockMvcRequestBuilders.fileUpload("/product/create")
                    .file("image", Files.readAllBytes(Paths.get(file.getAbsolutePath())))
                    .param("name", "Test Product" + i++)
                    .param("price", String.valueOf(r.nextInt(count) * 100))
                    .param("image", String.valueOf(r.nextInt(count * 10)))
                    .param("amount", String.valueOf(r.nextInt(count * 10)))
                )
                .andExpect(status().isOk());

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testRegist() throws Exception {

    }

    @Test
    public void testPause() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }
}