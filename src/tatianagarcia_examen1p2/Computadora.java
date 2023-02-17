
package tatianagarcia_examen1p2;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Computadora {
    protected JFormattedTextField IP;
    protected JFormattedTextField Mask;
    protected JTextField host;

    public Computadora() {
    }

    public Computadora(JFormattedTextField IP, JFormattedTextField Mask, JTextField host) {
        this.IP = IP;
        this.Mask = Mask;
        this.host = host;
    }

    public JFormattedTextField getIP() {
        return IP;
    }

    public void setIP(JFormattedTextField IP) {
        this.IP = IP;
    }

    public JFormattedTextField getMask() {
        return Mask;
    }

    public void setMask(JFormattedTextField Mask) {
        this.Mask = Mask;
    }

    public JTextField getHost() {
        return host;
    }

    public void setHost(JTextField host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "\nIP: " + IP + "\nMask: " + Mask + "\nHost: " + host;
    }
    
    
}
