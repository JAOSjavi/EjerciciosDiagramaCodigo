package Editorial;

public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anoPublicacion;
    private float precioLibre;

    public Libro(String titulo, float precio, int numeroPaginas, int anoPublicacion, float precioLibre) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
        this.precioLibre = precioLibre;
    }

    public void Mostrar() {
        super.Mostrar();
        System.out.println("Numero de paginas: " + numeroPaginas);
        System.out.println("Año de publicacion: " + anoPublicacion);
        System.out.println("Precio libre: " + precioLibre);
    }
}