package defaultMethods;


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");
        System.out.println(carro.getModelo());

        carro.acelerar();
        carro.desacelerar();

        System.out.println(carro.ligaAlarme());
        System.out.println(carro.desligaAlarme());
    }
}
