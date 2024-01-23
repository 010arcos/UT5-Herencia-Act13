package Act12;

public class Vehiculo {
    private String nombre;
    private  int velocidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }





    //Constructor vacio
    public Vehiculo(){}

    //Constructor vehiculo
    public Vehiculo(String nombre, int velocidad){
        this.nombre= nombre;
        this.velocidad= velocidad;
    }

    //Metodo Mover
    public void mover(){
        System.out.println(nombre + " se mueve a una velocidad de " + velocidad + "km/h");
    }

}



/*



}




// Clase CocheElectrico que hereda de Coche
class CocheElectrico extends Coche {
    // Constructor de CocheElectrico
    public CocheElectrico(String nombre, int velocidad, int ruedas) {
        super(nombre, velocidad, ruedas);
    }

    // Sobrescribe el método cambiarMarcha para indicar que el coche eléctrico no tiene marchas
    @Override
    public void cambiarMarcha(int nuevaMarcha) {
        System.out.println("Los coches eléctricos no tienen marchas");
    }
}

// Ejemplo de uso
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
*/