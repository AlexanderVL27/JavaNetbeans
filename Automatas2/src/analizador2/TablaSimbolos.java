
package analizador2;

import java.util.ArrayList;


public class TablaSimbolos {
    ArrayList<Variable> ts;
    
    public TablaSimbolos(){
        ts = new ArrayList<>();
    }
    
    public void add(String id, String tipo){
        if(isContained(id)){
            System.out.println("No añadido");
        }else{
            ts.add(new Variable(id, tipo));
        } 
    }
    
    public void add(String id, String tipo, Object valor){
        if(isContained(id)){
            System.out.println("No añadido");
        }else{
            ts.add(new Variable(id, tipo, valor));
            System.out.println("agregado");
        } 
    }
    
    
    
    public Variable get(int pos){
        return ts.get(pos);
    }
    
    public Variable get(String id){
        for(Variable v: ts){
            if (v.id.equals(id)){
                return v;
            }
        }
        return null;
    }
    
    public Variable getLast(){
        return ts.get(ts.size()-1);
    }
    
    public boolean isContained(String id){
        
        for(Variable v: ts){
            if (v.id.equals(id)){
                return true;
            }
        }
        return false;
    }
    
    class Variable{
        String id, tipo;
        Object valor;
        
        public Variable(String id, String tipo){
            this.id = id;
            this.tipo = tipo;
        }
        
        public Variable(String id, String tipo, Object valor){
            this.id = id;
            this.tipo = tipo;
            this.valor = valor;
        }
        
        public void setValue(Object o){
            switch(this.tipo){
                case "int":
                    this.valor = Integer.valueOf(String.valueOf(o));
                    break;
                case "dec":
                    this.valor = Float.valueOf(String.valueOf(o));
                    break;
                case "bool":
                    this.valor = Boolean.valueOf(String.valueOf(o));
                    break;
                case "String":
                    this.valor = String.valueOf(o);
                    break;
                case "char":
                    this.valor = String.valueOf(o);
                    break;
            }
        }
        
        @Override
        public String toString(){
            return (tipo + ", "+ id+", "+ valor+"\n");
        }
    }
}
