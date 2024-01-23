package Act5;

public class Main {
    public static void main(String[] args) {
        //Crear instancia de la clase hija pelicula

        Pelicula pelicula = new Pelicula("Interestellar", 180, 200, "Christopher Nolan", 9.9);

        //Acceder a los atributos y métodos de la clase padre Video
        System.out.println("Titulo: " + pelicula.getTitulo());
        System.out.println("Duración en minutos: " + pelicula.getMinutos() + " minutos") ;


        //Accedemos a los atributos y métodos de la clase hija Pelicula
        System.out.println("Director: " + pelicula.getDirector());
        System.out.println("Valoración: " + pelicula.getValoracion());
    }
}




