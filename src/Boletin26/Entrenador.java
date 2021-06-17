package Boletin26;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador(int idFederacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.idFederacion = idFederacion;
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
        System.out.println("Dirije los entrenamientos");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirije a los jugadores en el partido");
    }

    @Override
    public String toString() {
        return super.toString()+", idFederacion=" + idFederacion;
    }


}
