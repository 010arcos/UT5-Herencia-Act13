package Act12;

public class Main {
    public static void main(String[] args) {
        CocheCombustion cocheCombustion = new CocheCombustion("GasolinaCar", 0, 4);
        cocheCombustion.cambiarMarcha(2);
        cocheCombustion.acelerar(20);
        cocheCombustion.mover();

        CocheElectrico cocheElectrico = new CocheElectrico("Tesla", 0, 4);
        cocheElectrico.cambiarMarcha(1); // Esto imprimirá el mensaje específico para coches eléctricos
        cocheElectrico.acelerar(30);
        cocheElectrico.mover();
    }
}
