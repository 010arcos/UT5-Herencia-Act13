package Act5;

class  Pelicula extends Video{
    private String director;
    private double valoracion;


    //Getter y setter de la clase hija pelicula
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }


    //constructor vacio
    public Pelicula(){

    }


    //Constructor de la clase hija pelicula que llama al constructor padre que es Video

    public Pelicula (String titulo, int minutos, double precio,  String director, double valoracion){
        super(titulo, minutos, precio);//llamamos al constructor padre con super // el orden es importante
        this.director=director;
        this.valoracion= valoracion;

    }




    public String toString() {
        // Llama al toString() de la clase base (Video) usando super
        return "Pelicula [Director=" + director + ", Valoracion=" + valoracion + ", " + super.toString() + "]";
    }
}

