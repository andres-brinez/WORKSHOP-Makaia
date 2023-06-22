package logica;

public class Velero extends Embarcacion{
    private int cantidadMastiles;
    public Velero(Capitan capitan, double precioBase, int anioFabricacion, float eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void esGrande(){
        if (cantidadMastiles > 4){
            System.out.println("El velero es grande");
        }else {
            System.out.println("El velero es pequeño");
        }
    }

    @Override
    public double montoAlquiler() {
        double calcularMonto = 0;
        if (this.getAnioFabricacion() > 2020){
            calcularMonto = this.getPrecioBase()+valorAdicional;
        }else {
            calcularMonto = this.getPrecioBase();
        }
        return calcularMonto;
    }

    @Override
    public String toString() {
        return "Velero"+"\n"+super.toString()+"\n"+
                "Cantidad de mastiles: " + cantidadMastiles;
    }
}
