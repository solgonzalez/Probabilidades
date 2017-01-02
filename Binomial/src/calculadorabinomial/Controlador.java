
package calculadorabinomial;

public class Controlador {
    
    Calculadora calculadora = new Calculadora();
    
    public boolean numRepsValido(String pNumReps){
        int numReps;
        try{
            numReps = Integer.parseInt(pNumReps);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean probExitoValido(String pProbExito){
        double probExito;
        try{
            probExito = Double.parseDouble(pProbExito);
            return (probExito >= 0 && probExito <=1);
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean numExitosValido(String pNumExitos){
        try{
            int numReps = Integer.parseInt(pNumExitos);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean numExitosValidoIntervalos(String pMinNumExitos, String pMaxNumExitos){
        try{
            int minNumExitos = Integer.parseInt(pMinNumExitos);
            int maxNumExitos = Integer.parseInt(pMaxNumExitos);
            return minNumExitos < maxNumExitos;
        }catch(Exception e){
            return false;
        }
    }
    
    public double calcularBinomialSimple(int pNumExitos, int pNumReps, 
            double pProbExitos){
        double resultado;
        try{
            resultado = calculadora.binomial((double) pNumExitos, (double) pNumReps,
                    pProbExitos);
        }catch(ArithmeticException e){
            resultado = -1;
        }
        return resultado;
    }
    
    public double calcularBinomialCompleja(int pMinNumExitos, int pMaxNumExitos, 
            String pMinSimbolo, String pMaxSimbolo, int pNumReps, double pProbExito){
        double resultado;
        try{
            if ("<".equals(pMinSimbolo) && "<".equals(pMaxSimbolo)){
                resultado = calculadora.acumuladaBinomial((double) pMinNumExitos, 
                        (double) pMaxNumExitos, (double) pNumReps, pProbExito, false, false);
            }else if("<=".equals(pMinSimbolo) && "<".equals(pMaxSimbolo)){
                resultado = calculadora.acumuladaBinomial((double) pMinNumExitos, 
                        (double) pMaxNumExitos, (double) pNumReps, pProbExito, true, false);
            }else if("<".equals(pMinSimbolo) && "<=".equals(pMaxSimbolo)){
                resultado = calculadora.acumuladaBinomial((double) pMinNumExitos, 
                        (double) pMaxNumExitos, (double) pNumReps, pProbExito, false, true);
            }else{
                resultado = calculadora.acumuladaBinomial((double) pMinNumExitos, 
                        (double) pMaxNumExitos, (double) pNumReps, pProbExito, true, true);
            }
        }catch (Exception e){
            resultado = -1;
        }
        return resultado;
    }
}
