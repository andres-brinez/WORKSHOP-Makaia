package logica;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    public final static double valorAdicional = 20000;
    private int anioFabricacion;
    private float eslora;

    public Embarcacion() {
    }

    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, float eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public abstract double montoAlquiler();

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return
                "Capitan: " + capitan +
                "Precio base: " + precioBase +"\n"+
                "Año de fabricacion: " + anioFabricacion +"\n"+
                "Eslora: " + eslora+"m";
    }
}
