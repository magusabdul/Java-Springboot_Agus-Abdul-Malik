package com.magusabdul.integrationtest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.magusabdul.integrationtest.repository.CategoryRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CategoriesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoryRepository categoryRepository;

    @MockBean
    private CategoriesController categoriesController;

    @Test
    public void testCreateNewCategoryWithPayload() throws Exception{
        JSONObject payload = new JSONObject();

        payload.put("name", "Magazine");
        payload.put("description", "");

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/categories").contentType(MediaType.APPLICATION_JSON).content(payload.toJSONString()).accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc.perform(requestBuilder).andReturn();

        assertEquals(200, response.getResponse().getStatus());
    }

    @Test
    public void testCreateCategoryWithoutPayload() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/categories").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc.perform(requestBuilder).andReturn();

        assertEquals(400, response.getResponse().getStatus());
    }

    @Test
    public void testGetAllCategoris() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/categoreis").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc.perform(requestBuilder).andReturn();

        assertEquals(200, response.getResponse().getStatus());

    }

    @Test
    void testGetDetailCategory() {

    }

    @Test
    void testUpdateCategory() {

    }
}
