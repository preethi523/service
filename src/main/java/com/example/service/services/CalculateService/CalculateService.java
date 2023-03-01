package com.example.service.services.CalculateService;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    /***
     * Do calculation
     * @param n1 : Number in Double format
     * @param n2 : Number in Double format
     * @return Number in Double format after calculation
     */
    public Double Calculate(Double n1, Double n2) {
        Double result;
        if (n1 < n2) {
            result = n2 * 30000 / 3.1415;
        } else if (n2 < n1) {
            result = n1 * 30000 / 3.1415;
        } else {
            result = 0.0;
        }

        return result;
    }

}