
import javax.swing.JOptionPane;

public class CovertirMonedas {

    public void ConvertirPesosColombianosADolar(double valorRecibido) {
        double monedaDolar = valorRecibido / 4801.53;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");

    }
    
    public void ConvertirPesosColombianosAEuro(double valorRecibido) {
        double monedaEuro = valorRecibido / 5068.89;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");

    }
    
    public void ConvertirPesosColombianosALibrasEsterlinas(double valorRecibido) {
       double monedaLibrasEsterlinas = valorRecibido / 5.824;
       monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d) / 100;
       JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibrasEsterlinas + " Libras Esterlinas");

    }
    
    public void ConvertirPesosColombianosAYenJapones(double valorRecibido) {
       double monedaYenJapones = valorRecibido / 50.08;
       monedaYenJapones = (double) Math.round(monedaYenJapones * 100d) / 100;
       JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenJapones + " Yen Japones");

    }
    public void ConvertirPesosColombianosAWonsulCoreano(double valorRecibido) {
       double monedaWonsulCoreano = valorRecibido / 3.70;
       monedaWonsulCoreano = (double) Math.round(monedaWonsulCoreano * 100d) / 100;
       JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonsulCoreano + " Won sul Coreano");

    }
    
   
}
