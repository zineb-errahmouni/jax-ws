package fr.poc.services.impl;

import fr.poc.services.MathOperation;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.poc.services.impl.MathOperationImpl")
public class MathOperationImpl implements MathOperation {

    public double mul(double a, double b) {
        return a * b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double devide(double a, double b) {
        return a / b;
    }
}
