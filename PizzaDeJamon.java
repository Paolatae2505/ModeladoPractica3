public class PizzaDeJamon extends Pizza{

    public PizzaDeJamon(){
        nombre = "Pizza de Jamon";
        costo = 200.50;
    }
    
    public String getQueso(){
        return "Manchego";
    }
    
    public String getCarne(){
        return "Jamon";
    }
    
    public String getMasa(){
        return "Masa gruesa";
    }


}
