package com.example.SkateXut;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.SkateXut.model.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@Sql(scripts = { "classpath:test-data.sql" },
        executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ActiveProfiles(profiles = "test")
public class ProductControllerTest {

    @Autowired
    private ProductRepository repo;

    @Autowired
    private ObjectMapper jsony;

    @Autowired
    private MockMvc mock;


    @Test
    void testAddProduct() throws  Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.POST, "/addProduct");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.content(this.jsony.writeValueAsString(ProductTestValues.toyMachineMonster));
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isCreated();
        ResultMatcher content = MockMvcResultMatchers.content().string("New Product Added");

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
    }


    @Test
    void testReadAll() throws Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/readAll");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.accept(MediaType.APPLICATION_JSON);

        System.out.println(mockRequest);
        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
        ResultMatcher content = MockMvcResultMatchers.content()
                .json(this.jsony.writeValueAsString(ProductTestValues.allProducts));

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);

    }

    @Test
    void testReadByBarcode() throws Exception{

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/readByBarcode/23456781");
        mockRequest.contentType(MediaType.APPLICATION_JSON);

        mockRequest.accept(MediaType.APPLICATION_JSON);
        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();


        ResultMatcher content = MockMvcResultMatchers.content()
                .json(this.jsony.writeValueAsString((ProductTestValues.welcomeSlothDTO)));
        this.mock.perform(mockRequest).andExpect(status).andExpect(content);

    }

    @Test
    void testReadByName() throws Exception{

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/readByName/Almost Places R7 Skateboard Deck - Youness");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
        ResultMatcher content = MockMvcResultMatchers.content()
                .json(this.jsony.writeValueAsString(ProductTestValues.almostPlacesR7DTO));

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
    }

    @Test
    void testDelete() throws Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.DELETE, "/deleteProduct/23456781");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
        ResultMatcher content = MockMvcResultMatchers.content().string("23456781 Deleted");

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
    }

    @Test
    void testUpdate() throws Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.POST, "/updateProduct/23456781");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.content(this.jsony.writeValueAsString(ProductTestValues.toyMachineMonster));
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
        ResultMatcher content = MockMvcResultMatchers.content().string("23456781 Updated");

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
    }

    /*
    *  //Update
    @PostMapping("/updateProduct/{barcode}")
    public ResponseEntity<String> update(@PathVariable Integer barcode, @RequestBody Product product) {
            service.updateProduct(barcode, product);
            return new ResponseEntity<>(barcode +" Updated", HttpStatus.ACCEPTED);
    }

    * */

}
