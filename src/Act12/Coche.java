package Act12;

class Coche extends Vehiculo {
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    int ruedas;


    //constructor vacio

    public Coche(){}

    //Constructor coche

    public Coche (String nombre, int velocidad, int ruedas){
        super(nombre, velocidad);
        this.ruedas= ruedas;
    }

    //Métodos

    public void cambiarMarcha(int nuevaMarcha){
        System.out.println(getNombre() + "ha cambiado a la marcha " + nuevaMarcha);
    }
    public void acelerar(int Velocidad) {
        System.out.println(getNombre() + " ha acelerado y ahora va a " + Velocidad + " km/h");
    }
}






