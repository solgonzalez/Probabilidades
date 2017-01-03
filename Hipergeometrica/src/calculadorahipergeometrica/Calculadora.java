
package calculadorahipergeometrica;

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

    public double hipergeometrica(double poblacionTotal, double poblacionTipo1,
            double muestraTotal, double muestraTipo1){
        if (poblacionTotal < poblacionTipo1 ){
            throw new ArithmeticException("Población total debe ser mayor a población"
                    + " de tipo 1.");
        }

        if (muestraTotal < muestraTipo1){
            throw new ArithmeticException("Muestra total debe ser mayor a muestra"
                    + " de tipo 1.");
        }

        double poblacionTipo2 = poblacionTotal - poblacionTipo1;
        double muestraTipo2 = muestraTotal - muestraTipo1;

        double resultado = (combinacion(poblacionTipo1, muestraTipo1) * 
                combinacion(poblacionTipo2, muestraTipo2)) / 
                combinacion(poblacionTotal, muestraTotal);
        return resultado;
    }
}
