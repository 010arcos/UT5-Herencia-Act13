package Act5;

public class MainAct11 {
    public static void main(String[] args) {
        Video ob1 = new Video("VHS", 90, 200);
        Pelicula ob2 = new Pelicula("ET", 120, 200,  "Spielberg", 10);
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());

    }
}
/*
a. ¿Qué mostrará el siguiente código?
Muestra esto
Act5.Video@30f39991
Act5.Pelicula@452b3a41


b. ¿Por qué no aparecen los atributos de director y valoración en el objeto ob2?
Por el método tooString
c. ¿Cómo hay que modificar el código para que también muestre los atributos de director y valoración de ob2?
Añadiendo el método toString
d. Implementa una nueva clase llamada VideoMusical que herede de Video. Tendrá dos variables de instancia: artista y categoría, los dos String. Define el constructor y el método toString.
e. Te habrás dado cuenta que hay un fallo en el diseño, ¡ninguno de los videos tiene precio!
Es tu trabajo añadirlo, ¿dónde lo agregarías y qué cambios realizarías en el código?
Añadiendo el cosntructor padre el atributo precio y a los constructores hijos con super

 */