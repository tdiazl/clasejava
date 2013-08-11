/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.figuras;

/**
 *
 * @author PFR
 */
public class Numero {
    private final double  pi= 3.14;
    public static void main(String[] args) {
        Numero nu= new Numero();
        System.out.println(nu.getPi());
    }

    public double getPi() {
        return pi;
    }
    
}
