public class Auto extends Vehiculo {

    private int NumPuertas;

    public Auto() {
    }

    public Auto(String marca, String modelo, int año, double precioBase, int numPuertas) {
        super(marca, modelo, año, precioBase);
        NumPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        NumPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                ", NumPuertas=" + NumPuertas +
                '}';
    }

}
