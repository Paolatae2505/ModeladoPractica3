public class PizzaDePollo extends Pizza {

    public PizzaDePollo(){
        nombre = "Pizza de Pollo";
        costo = 230.50;
    }

    public String getQueso(){
        return "Chedar";
    }
    
    public String getCarne(){
        return "Pollo";
    }
    
    public String getMasa(){
        return "Masa gruesa";
    }

}
