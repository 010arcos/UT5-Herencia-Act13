package Act5;

public class Video {

    private String titulo;
    private int  minutos;
    private double precio;


    //Getter y setters  // Métodos de la clase padre (pueden ser más según las necesidades)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    // Constructor vacío
    public Video() {

    }

    //constructor de la clase padre

    public Video (String titulo, int minutos, double precio ){
        this.titulo= titulo;
        this.minutos=minutos;
        this.precio= precio;
    }


    // Sobrescribe el método toString() en la clase base (Video)


    @Override
    public String toString() {
        return "Video{" + "titulo='" + titulo + '\'' + ", minutos=" + minutos +  ", precio=" + precio + '}';
    }
}


