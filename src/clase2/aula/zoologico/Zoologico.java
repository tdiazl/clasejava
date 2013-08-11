package clase2.aula.zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Zoologico.executeCating();
        
    }

    public static void doCating2() {
        Animal[] animales = {new Tigre("Tggg"), new Gallina("ggg"), new Gallina("ggg2")};
       
        for (Animal animal : animales) {
            animal.printNombrePatas();

            if (animal instanceof Tigre) {//verifica  de que clase es instanciada

                //Tigre  tigre=(Tigre)animal;
                //  tigre.hacerRuido(true);
                ((Tigre) animal).hacerRuido(true);//otro de casteo,pero solo se ejecuta un solo metodo


            } else if (animal instanceof Gallina) {
                Gallina gallina = (Gallina) animal;
                gallina.hacerRuido();
                gallina.picar();
            }
        }
    }

    public static void executeCating() {
        //  Zoologico.doHerencia();
        // Zoologico.doConstructor();
        Zoologico.doCasting1(new Gallina());
        Zoologico.doCasting1(new Tigre());
        Zoologico.doCating2();

    }
    //identificar  el tipo de un objeto cuando se recibe un objeto a traves de un metodo

    public static void doCasting1(Animal animal) {

        if (animal instanceof Tigre) {//verifica  de que clase es instanciada

            //Tigre  tigre=(Tigre)animal;
            //  tigre.hacerRuido(true);
            ((Tigre) animal).hacerRuido(true);//otro de casteo,pero solo se ejecuta un solo metodo


        } else if (animal instanceof Gallina) {
            Gallina gallina = (Gallina) animal;
            gallina.hacerRuido();
            gallina.picar();
        }

    }

    public static void doConstructor() {
        Gallina pepa = new Gallina();
        pepa.setNombre("PEPA");
        // pepa.setNumeroPatas(2);
        pepa.printNombrePatas();


        Gallina manba = new Gallina("MANBA");
        manba.printNombrePatas();

        Tigre tigre = new Tigre("Rafael");
        tigre.printNombrePatas();



    }

    public static void doHerencia() {
        Tigre tigre = new Tigre();
        tigre.setNumeroPatas(4);
        tigre.hacerRuido();
        System.out.println(tigre.getNumeroPatas());
        tigre.hacerRuido(true);

        Gallina pepa = new Gallina();
        pepa.setNumeroPatas(2);
        System.out.println(pepa.getNumeroPatas());
        pepa.hacerRuido();
    }

    public static void doInstance() {
        Animal tigre = new Animal();
        //modificando el atributio
        tigre.setNombre("Tigre");
        //acediendo al atributo
        System.out.println(tigre.getNombre());

    }
}
