package figura;
public class HerenciaFigura {
    
    public static void main(String[] args) {
        Figura fig[] = new Figura[5];
        Circulo cir = new Circulo();
        Rectangulo rec = new Rectangulo();
        Cuadrado cuad = new Cuadrado();
        Triangulo tri = new Triangulo();
        Cubo cubo = new Cubo();
        System.out.println("Circulo");
        cir.llenar();
        cir.area();
        cir.perimetro();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Rectangulo");
        rec.llenar();
        rec.area();
        rec.perimetro();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Triangulo");
        tri.llenar();
        tri.area();
        tri.perimetro();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Cuadrado");
        cuad.llenar();
        cuad.area();
        cuad.perimetro();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Cubo");
        cubo.llenar();
        cubo.area();
        cubo.perimetro();
        cubo.volumen();
        
        fig[0]=cir;
        fig[1]=rec;
        fig[2]=cuad;
        fig[3]=tri;
        fig[4]=cubo;
        
        for (int i = 0; i < fig.length; i++) {
            fig[i].im();
        }
    }
}
