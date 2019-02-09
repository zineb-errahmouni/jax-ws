package fr.poc.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathOperation{

    @WebMethod
    double mul(final double a, final double b);
    @WebMethod
    double add(final double a, final double b);
    @WebMethod
    double substract(final double a, final double b);
    @WebMethod
    double devide(final double a, final double b);
}
