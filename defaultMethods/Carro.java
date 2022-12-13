package defaultMethods;

public class Carro implements Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void desacelerar() {
        System.out.println("Desacelerando");
    }

    @Override
    public String ligaAlarme() {
        return Veiculo.super.ligaAlarme();
    }

    @Override
    public String desligaAlarme() {
        return Veiculo.super.desligaAlarme();
    }
}
