package clase2.aula.zoologico;
public class Gallina extends  Animal{
 String pico;

 //ya es implicito xque hay otro constructor
    public Gallina() {
        this.setNumeroPatas(2);
    }
 
   
 

 //tambien sirve para modificar atributos al crear el objeto
    public Gallina( String nombre) {
        this.setNumeroPatas(2);
        this.setNombre(nombre);
    }
 

 
 
 @Override
  public void hacerRuido(){
      System.out.println("cot cot");
   }
 
 
 void picar(){
     System.out.println("picar");
 }
 
}
