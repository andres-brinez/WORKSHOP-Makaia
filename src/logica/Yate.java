package logica;

public class Yate extends Embarcacion{
    private int cantidadCamarotes;
    public Yate(Capitan capitan, double precioBase, int anioFabricacion, float eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public void esLujo(){
        if (cantidadCamarotes > 7){
            System.out.println("Es yate de lujo y puede ser comprado");
        }else {
            System.out.println("No es yate de lujo y puede ser comprado");
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
        return "Yate"+"\n"+super.toString()+"\n"+
                "Cantidad de camarotes: " + cantidadCamarotes;
    }
}
