package Act13;

public class Circulo {
    private double radio;


    public Circulo(double radio) {
        if (radio<0){
            this.radio=0;
        } else {
            this.radio=radio;
        }

    }

    public double getArea(){

        return radio*radio* Math.PI;
    }
    public double getRadio() {

        return radio;
    }
    public void setRadio(double radio) {

        this.radio = radio;
    }
}

