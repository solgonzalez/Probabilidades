
package calculadorahipergeometrica;

public class Controlador {
    
    Calculadora calculadora = new Calculadora();
    
    public boolean validarNumero(String pNumero){
        int numero;
        try{
            numero = Integer.parseInt(pNumero);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean validarPoblacion(int pTotal, int pTipo1, int pTipo2){
        return pTotal == pTipo1 + pTipo2;
    }
    
    public double calcularHipergeometrica(int pPoblacionTotal, int pPoblacionTipo1, 
            int pMuestraTotal, int pMuestraTipo1){
        double resultado;
        try{
            resultado = calculadora.hipergeometrica((double) pPoblacionTotal, 
                    (double) pPoblacionTipo1, (double) pMuestraTotal, (double) pMuestraTipo1);
        }catch(Exception e){
            resultado = -1;
        }
        return resultado;
    }
}
