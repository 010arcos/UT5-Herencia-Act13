package Act5;

class VideoMusicalAct11 extends Video {
    private String artista;
    private String categoria;



    private double precio;


//Getter y setters
public double getPrecio() {
    return precio;
}

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    //constructor
    public VideoMusicalAct11(String titulo, int minutos , double precio, String artista, String categoria ) {
        super(titulo, minutos, precio);
        this.artista = artista;
        this.categoria = categoria;

    }

    @Override
    public String toString() {
        return "VideoMusicalAct11 [Artista=" + artista + ", Categoria=" + categoria + ", " + super.toString() + "]";
    }


}
