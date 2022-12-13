package defaultMethods;

public interface Veiculo {
    String getModelo();

    void acelerar();

    void desacelerar();

    default String ligaAlarme() { // default allows the interface to provide a default implementation for the abstract methods
        return "Ligando alarme";
    }

    default String desligaAlarme() { // default allows the interface to provide a default implementation for the abstract methods
        return "Desligando alarme";
    }
}
