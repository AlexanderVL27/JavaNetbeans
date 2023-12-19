/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**
 *
 * @author villa
 */
public class Listad {
    private Nododoble p;
    private Nododoble f;

    public Listad() {
        p=null;
        f=null;
        
    }
    public void insertaprincipio(int n){
        Nododoble q = new Nododoble();
        q.info=n;
        q.ligader=p;
        q.ligaizq=null;
        if (p==null && f == null) {
            p=q;
            f=q;
        }else{
            q.ligader=p;
            p.ligaizq=q;
            p=q;
        }
    }
    public void insertarFinal(int n){
        Nododoble q = new Nododoble();
        q.info=n;
        if (p==null && f == null) {
            f=q;
            p=q;
        }else{
            f.ligader=q;
            q.ligaizq=f;
            f=q;
        }
    }
    
    public void insertarantes(int n, int ref){
        Nododoble q=p;
        Nododoble r;
        while(q.ligader!=null&&q.info!=ref){
            q=q.ligader;
        }
        if (q.info==ref) {
            Nododoble aux=new Nododoble();
            aux.info=n;
            aux.ligader=q;
            r=q.ligaizq;
            q.ligaizq=aux;
            if (p==q) {
                aux.ligaizq=null;
                p=aux;
            }else{
                r.ligader=aux;
                aux.ligaizq=r;
            }
        }else System.out.println("Referencia no encontrada");
    }
    public void Eliminarprimero(){
        Nododoble q=p;
        if (q.ligader==null) {
            p=null;
            f=null;
        }else {
            p=q.ligader;
            p.ligaizq=null;
        }
        q=null;
    }
    public void Eliminaultimo(){
        Nododoble q=f;
        if (p==f) {
            p=null;
            f=null;
        }else{
            f=f.ligaizq;
            f.ligader=null;
        }
        q=null;
    }
    public boolean buscar(int n){
        Nododoble aux=p; 
        boolean band=true;
        while((aux.info!=n)&&(band==true)){
        if (aux.ligader!=null) {
            aux=aux.ligader;
        }else band=false;
        }
        return band;
    } 
    public void Eliminarnodo(int n){
        Nododoble q = p;
        Nododoble aux=null;
        Nododoble aux1=null;
        boolean band=true;
        while(q.info!=n&&band==true){
            if (q.ligader!=null) {
                q=q.ligader;
            }else band=false;
        }
        if (band!=true) {
            System.out.println("No existe valor en la lista");
        }else{
            if (p==q&&p==f) {
                p=null;
                f=null;
            }else{
                if (p==q&&p!=f) {
                    p=q.ligader;
                    p.ligaizq=null;
                }else{
                    if (f==q) {
                        f=f.ligaizq;
                        f.ligader=null;
                    }else{
                        aux=q.ligaizq;
                        aux1=q.ligader;
                        aux.ligader=aux1;
                        aux1.ligaizq=aux;
                    }
                }
            } 
        }
        q=null; 
    }
    public void imprimelista(){
        Nododoble q=p;
        while (q!= null){
            if (q==null) {
                System.out.println("Vacio");
            }else{
            System.out.print(q.info + " ");
            q=q.ligader;
            }
         }
    }
}
