package Boletin26;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Si va a las concentraciones");
    }

    @Override
    public void viajar() {
        System.out.println("Si biaja por partidos");
    }

    @Override
    public void entrenar() {
        System.out.println("Tiene que entrenar");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega los partidos");
    }

    @Override
    public String toString() {
        return super.toString()+", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

}
