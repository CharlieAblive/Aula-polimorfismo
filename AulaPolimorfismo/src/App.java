import carro.Carro;
import carro.CarroMonstro;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar();
        carro.desligar();
        carro.marca = "Bughatti";
        System.out.println(carro.marca);

        CarroMonstro carroMonstro = new CarroMonstro();
        carroMonstro.ligar();
        carroMonstro.acelerar();
        carroMonstro.desligar();

    }
}
