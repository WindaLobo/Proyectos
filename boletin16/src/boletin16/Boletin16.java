
package boletin16;


public class Boletin16 {

   
    public static void main(String[] args) {
        
 Persona cliente1 = new Persona("Windar","Lobo","Y37762h");
 
    CuentaCorriente cuenC1= new CuentaCorriente(54511244,cliente1,10800);
    CuentaAhorro cueA= new CuentaAhorro(9876542,cliente1,10000,1.5);

        
        System.out.println(cuenC1.toString());
        cuenC1.actualizarSaldo();
        cuenC1.Ingresar();
        cuenC1.Retirar();
        cuenC1.actualizarSaldo();
        System.out.println(cueA.toString());




    }
}

   
    
   
    

