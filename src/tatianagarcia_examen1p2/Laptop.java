
package tatianagarcia_examen1p2;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Laptop extends Computadora{
    private int ram;
    private int almacenimiento;
    private String tipo;
    private boolean grafica;

    public Laptop() {
        super();
    }

    public Laptop(int ram, int almacenimiento, String tipo, boolean grafica, JFormattedTextField IP, JFormattedTextField Mask, JTextField host) {
        super(IP, Mask, host);
        this.ram = ram;
        this.almacenimiento = almacenimiento;
        this.tipo = tipo;
        this.grafica = grafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenimiento() {
        return almacenimiento;
    }

    public void setAlmacenimiento(int almacenimiento) {
        this.almacenimiento = almacenimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isGrafica() {
        return grafica;
    }

    public void setGrafica(boolean grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRAM: " + ram + "\nAlmacenimiento: " + almacenimiento + "\nTipo: " + tipo + "\nGrafica: " + grafica;
    }
    
    
}
