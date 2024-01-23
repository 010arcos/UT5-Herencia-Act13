package Act12;

class CocheCombustion extends Coche{
    public CocheCombustion(String nombre, int velocidad, int ruedas) {
        super(nombre, velocidad, ruedas);
    }

    // Sobrescribe el método cambiarMarcha para indicar que el coche eléctrico no tiene marchas
    @Override
    public void cambiarMarcha(int nuevaMarcha) {
        System.out.println("Los coches eléctricos no tienen marchas");
    }
}

