package com.example.service.CalculateService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.example.service.services.CalculateService.CalculateService;

@SpringBootTest
class CalculateServiceTest {


    private CalculateService calculateService = new CalculateService();

    /**
     * Test -case for calcaulte functions
     */
    @Test
    void CalculateN1GreaterThanN2() {
        Double expectedResult = 9.431163456947318E7;
        Double n1 = 9876.0;
        Double n2 = 123.0;
        Double result = calculateService.Calculate(n1, n2);
        assertThat(expectedResult).isEqualTo(result);
    }


    @Test
    void CalculateN2GreaterThanN1() {
        Double expectedResult = 114594.9387235397;
        Double n1 = 9.0;
        Double n2 = 12.0;
        Double result = calculateService.Calculate(n1, n2);
        assertThat(expectedResult).isEqualTo(result);
    }


    @Test
    void CalculateN1EqualToN2() {
        Double expectedResult = 0.0;
        Double n1 = 1.0;
        Double n2 = 1.0;
        Double result = calculateService.Calculate(n1, n2);
        assertThat(expectedResult).isEqualTo(result);
    }



}
