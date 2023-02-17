
package tatianagarcia_examen1p2;


public class PC {
    private String marca;
    private String definicion;
    private boolean rgb;

    public PC() {
        super();
    }

    public PC(String marca, String definicion, boolean rgb) {
        this.marca = marca;
        this.definicion = definicion;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca: " + marca + "\nDefinicion: " + definicion + "\nRGB: " + rgb + '}';
    }
    
    
    
}
