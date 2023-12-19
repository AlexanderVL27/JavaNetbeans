package figura;
public abstract class Figura {
    private int dato;

    public Figura() {
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }
    
    public abstract double area();
    public abstract double perimetro();
    public void im(){
    }
}
