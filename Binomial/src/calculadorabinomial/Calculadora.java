
package calculadorabinomial;

public class Calculadora {
    public double factorial(double n){
        if (n <= 1){
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public double combinacion(double n, double r){
        if (n < r){
            throw new ArithmeticException("Combinación inválida: n < r.");
        }
        if (n < 0 || r < 0){
            throw new ArithmeticException("Número negativo.");
        }
        double resultado = factorial(n) / (factorial(r) * factorial(n - r));
        return resultado;
    }

    public double binomial(double numeroExito, double numeroRepeticiones, 
            double probabilidadExito){
        if (numeroRepeticiones < numeroExito){
            throw new ArithmeticException("Número de repeticiones menores que "
                    + "número de éxitos.");
        }
        if (probabilidadExito < 0 || probabilidadExito > 1){
            throw new ArithmeticException("Probabilidad de éxito debe de estar "
                    + "entre 0 y 1.");
        }
        double numeroFracaso = numeroRepeticiones - numeroExito;
        double probabilidadFracaso = 1 - probabilidadExito;
        double resultado = combinacion(numeroRepeticiones, numeroExito) * 
                Math.pow(probabilidadExito, numeroExito) * 
                Math.pow(probabilidadFracaso, numeroFracaso);
        return resultado ;
    }
    public double acumuladaBinomial(double numeroExitoInferior, 
            double numeroExitoSuperior, double numeroRepeticiones, 
            double probabilidadExito, boolean desigualdadInferior, 
            boolean desigualdadSuperior){
        /*
            desigualdadInferior: valor el cual sera --> "true" si la desigualdadInferior es igual a "<="
                                                        "false" si la desigualdadInferior es igual a "<"
            desigualdadSuperior: valor el cual sera --> "true" si la desigualdadSuperior es igual a "<="
                                                        "false" si la desigualdadSuperior es igual a "<"

        */
        if (probabilidadExito < 0 || probabilidadExito > 1 ){
            throw new ArithmeticException("Probabilidad de éxito debe estar entre 0 y 1.");
        }
        if (!desigualdadInferior){
            numeroExitoInferior = numeroExitoInferior + 1;
        }
        if (desigualdadSuperior){
            numeroExitoSuperior = numeroExitoSuperior + 1;
        }
        double probabilidadAcumulada = 0;
        for(double i = numeroExitoInferior; i < numeroExitoSuperior; i++ ){
            probabilidadAcumulada += binomial(i, numeroRepeticiones, probabilidadExito);
        }
         return probabilidadAcumulada;
    }
}
