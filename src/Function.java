
import javax.swing.JOptionPane;

public class Function {

    CovertirMonedas monedas = new CovertirMonedas();

    public void ConvertirMonedas(double ValorRecibido) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elija el tipo de moneda ", "Divisas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                {"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro",
                    "De Pesos Colombianos a Libras Esterlinas", "De Pesos Colombianos a Yen Japones",
                    "De Pesos Colombianos a Won sul Coreano", "De Dólar  a Peso Colombiano",
                    "De Euro a Peso Colombiano", "De Libras Esterlinas a peso Colombiano",
                    "De Yen Japonés a peso Colombino", "De Won sul-Coreano a peso Colombiano"},
                "Selección")).toString();
        switch (opcion) {
            case "De Pesos Colombianos a Dólar": {
                monedas.ConvertirPesosColombianosADolar(ValorRecibido);
                break;
            }
            case "De Pesos Colombianos a Euro": {
                monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
                break;
            }
            case "De Pesos Colombianos a Libras Esterlinas": {
                monedas.ConvertirPesosColombianosALibrasEsterlinas(ValorRecibido);
                break;
            }
            case "De Pesos Colombianos a Yen Japones": {
                monedas.ConvertirPesosColombianosAYenJapones(ValorRecibido);
                break;
            }
            case "De Pesos Colombianos a Won sul Coreano": {
                monedas.ConvertirPesosColombianosAWonsulCoreano(ValorRecibido);
                break;
            }

        }
    }
}
