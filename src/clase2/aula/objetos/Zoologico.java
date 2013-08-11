package clase2.aula.objetos;

public class Zoologico {

    public static void main(String[] args) {
        Zoologico.doHerencia();

    }
    
    public static void doHerencia() {
        Tigre tigre = new Tigre();
        tigre.setNumeroPatas(4);
        tigre.hacerRuido();
        System.out.println(tigre.getNumeroPatas());
        tigre.hacerRuido(true);
        
        Gallina pepa=new Gallina();
        pepa.setNumeroPatas(2);
        System.out.println(pepa.getNumeroPatas());
        pepa.hacerRuido();  
    }

    public static void dopInstance() {
        Animal tigre = new Animal();
        //modificando el atributio
        tigre.setNombre("Tigre");
        //acediendo al atributo
        System.out.println(tigre.getNombre());
         

    }
   
}
