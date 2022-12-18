
import javax.swing.JOptionPane;

public class MiCoversor {

    public static void main(String[] args) {

        Function monedas = new Function();
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción ", "Convert Money",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Coversor de Temperatura"}, "selección")).toString();
        switch (opciones) {
            case "Conversor de Moneda": {
                String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
                double ValorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(ValorRecibido);
                
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                if(JOptionPane.YES_OPTION == seleccion){
                    System.out.println("Selecciona opción afirmativa");
                }else{
                    JOptionPane.showMessageDialog(null, "Salir del Programa");
                }
            }
        }
    }

}
