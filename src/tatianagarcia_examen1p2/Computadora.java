
package tatianagarcia_examen1p2;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Computadora {
    protected String IP;
    protected String Mask;
    protected String host;

    public Computadora() {
    }

    public Computadora(String IP, String Mask, String host) {
        this.IP = IP;
        this.Mask = Mask;
        this.host = host;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMask() {
        return Mask;
    }

    public void setMask(String Mask) {
        this.Mask = Mask;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "\nIP: " + IP + "\nMask: " + Mask + "\nHost: " + host;
    }
    
    
}
