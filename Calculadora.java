/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddddd;
import java.lang.Math;
/**
 *
 * @author Izcar
 */
public class Calculadora {


    public double factorial(double n){
        if (n <= 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public double combinacion(double n, double r)
    {
        if (n < r){
            throw new ArithmeticException("Combinacion invalida: n < r");
        }

        if (n < 0 || r < 0){
            throw new ArithmeticException("Numero Negativo");
        }
        double resultado = factorial(n)/(factorial(r) * factorial(n - r));

        return resultado;
    }

    public double binomial(double numeroRepeticiones, double numeroExito, double probabilidadExito )
    {
        if (numeroRepeticiones < numeroExito ){
            throw new ArithmeticException("numeroRepeticiones: numeroRepeticiones < numeroExito");
        }

        if (probabilidadExito < 0 || probabilidadExito > 1 ){
            throw new ArithmeticException("ProbabilidadExito: p < 0 -- p > 1");
        }
        double numeroFracaso = numeroRepeticiones - numeroExito;
        double probabilidadFracaso = 1 - probabilidadExito;

        double resultado = combinacion(numeroRepeticiones, numeroExito) * Math.pow(probabilidadExito, numeroExito) * Math.pow(probabilidadFracaso, numeroFracaso);
        return resultado ;
    }

    public double hipergeometrica(double poblacionTotal, double poblacionTipo1, double muestraTotal, double muestraTipo1)
    {
        if (poblacionTotal < poblacionTipo1  ){
            throw new ArithmeticException("PoblacionTotal: poblacionTotal < poblacionTipo1");
        }

        if (muestraTotal < muestraTipo1){
            throw new ArithmeticException("MuestraTotal: muestraTotal < muestraTipo1");
        }

        double poblacionTipo2 = poblacionTotal - poblacionTipo1;
        double muestraTipo2 = muestraTotal - muestraTipo1;

        double resultado = (combinacion(poblacionTipo1, muestraTipo1) * combinacion(poblacionTipo2, muestraTipo2)) / combinacion(poblacionTotal, muestraTotal);
        return resultado;
    }

    public double geometrica(double probabilidadExito, double numeroRepeticiones)
    {
        if (probabilidadExito < 0 || probabilidadExito > 1 ){
            throw new ArithmeticException("ProbabilidadExito: p < 0 -- p > 1");
        }
        double probabilidadFracaso = 1 - probabilidadExito;
        double resultado = Math.pow(probabilidadExito, numeroRepeticiones) * probabilidadFracaso;
        return resultado;
    }

    public double poisson(double promedio, double numeroExito)
    {
        if (promedio < 0 || numeroExito < 0 ){
            throw new ArithmeticException("Numero Negativo");
        }

        double resultado = (Math.exp(-1 * promedio) * Math.pow(promedio, numeroExito)) / factorial(numeroExito);
        return resultado;
    }















}
