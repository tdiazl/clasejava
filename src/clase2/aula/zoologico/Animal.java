
package clase2.aula.zoologico;
public class Animal {
    private int numeroPatas;
    private String especie;
    private double tmaño;
    private String nombre;

    public double getTmaño() {
        return tmaño;
    }

    public void setTmaño(double tmaño) {
        this.tmaño = tmaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
        public void hacerRuido(){
            System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzz");
        }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    void printNombrePatas(){

        System.out.println(this.getNombre()+"---"+this.getNumeroPatas());
}
               
}
  

