package Boletin25;

public class EmbarcacionDeportiva extends Barco{

    private double potencia;

    public EmbarcacionDeportiva(String matricula, float largo, double potencia) {
        super(matricula, largo);
        this.potencia = potencia;
    }

    @Override
    public double modulo() {
        return (super.modulo() + (potencia / 2));
    }

    @Override
    public double calularPrecio() {
        return this.modulo();
    }

    @Override
    public String toString() {
        return "Embarcacion Deportiva";
    }
}
