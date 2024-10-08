package Editorial;

public class Disco extends Publicacion {
    private float minutos;
    private int precioDisco;

    public Disco(String titulo, float precio, float minutos, int precioDisco) {
        super(titulo, precio);
        this.minutos = minutos;
        this.precioDisco = precioDisco;
    }

    public void Mostrar() {
        super.Mostrar();
        System.out.println("Minutos: " + minutos);
        System.out.println("Precio del disco: " + precioDisco);
    }
}