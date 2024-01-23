package Act13;

public class Cilindro extends Circulo {
    private double altura;




    public Cilindro(double radio, double altura){
        super(radio);
        if (altura<0){
            this.setRadio(0);
        }else {

            this.altura= altura;
        }

    }

    public double getVolumen(){
        return altura*getArea();

    }
    public double getAltura() {
        return altura;
    }





}
