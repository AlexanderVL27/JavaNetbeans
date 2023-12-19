package composicioncirculo;
public class Circulo {
    protected double ra;
    private String r;
    static final double pi=3.1416;
    private Cilindro cil = null;
    
    public Circulo(double r){
        this.ra=r;
        cil = new Cilindro(r);
    }
    public void setRadio(double radio) {
        this.ra = radio;
    }
    public double getRadio() {
        return ra;
    }
    public static double getPi() {
        return pi;
    }
    public double area(){
        return pi*Math.pow(ra,2);
    }
    public void imprimir(){
        System.out.println("El area del circulo es: "+area());
    }
    public void mostrarvolumen(){
        if (cil!=null) {
            cil.llenarc();
            cil.imprimirc();
        }
        else
            System.out.println("No hay cilindro");
    }
}
