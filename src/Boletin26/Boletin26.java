package Boletin26;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<SeleccionFutbol> seleccion=new ArrayList<>();
        SeleccionFutbol f=new Futbolista(1,"portero",3,20,"Juan","Torres");
        SeleccionFutbol e=new Entrenador(7,1,20,"Antonio","Torres");
        SeleccionFutbol m=new Masajista("Carrera de masaje",5,2,20,"Luis","Torres");

        seleccion.add(f);
        seleccion.add(e);
        seleccion.add(m);

        for(SeleccionFutbol ele:seleccion){

            System.out.println(ele.toString());
            ele.concentrarse();
            ele.entrenar();
            ele.jugarPartido();
            ele.viajar();
            System.out.println("");
        }
    }

}
