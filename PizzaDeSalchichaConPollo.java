public class PizzaDeSalchichaConPollo extends Pizza {

    public PizzaDeSalchichaConPollo(){
        nombre = "Pizza de Salchicha con Pollo";
        costo = 300.00;
    }

    public String getQueso(){
        return "Chedar";
    }
    
    public String getCarne(){
        return "Salchicha y pollo";
    }
    
    public String getMasa(){
        return "Masa gruesa";
    }
}
