package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderProcessorTest {

    @ParameterizedTest

    @CsvSource ({
            "5, 50, 'Apple', true",
            "2, -1, 'Pear', false",
            "1, 100, 'Banana', true",
            "5, 20, 'Apple', true"

    })

    void testGetProductPrice(int id, int price, String productName, boolean available){
        //Given
        ProductRepository productRepository = mock(ProductRepository.class);
        Product expectedProduct = new Product(id, price, productName, available);
        when(productRepository.getPriceByProductId(id)).thenReturn(expectedProduct);
        OrderProcessor orderProcessor = new OrderProcessor(productRepository);

        //When
        int productPrice = orderProcessor.getPriceById(id);


        //Then
        assertAll(
                () -> assertEquals(price, productPrice)
        );
        verify(productRepository).getPriceByProductId(id);
    }


    @Test
    void testCalculateTotalPrice(){
        //Given
        ProductRepository productRepository = new ProductRepository();
        OrderProcessor orderProcessor = new OrderProcessor(productRepository);
        ArrayList<Product> productList = new ArrayList<>(Arrays.asList(
                new Product(1, 50, "Apple", true),
                new Product(2, 50, "Pear", true)
        ));

        //When
        orderProcessor.setOrderList(productList);
        int totalPrice = orderProcessor.calculateTotalPrice();

        //Then
        assertEquals(100, totalPrice);

    }

}