public class PizzaDeSalchicha extends Pizza{

    public PizzaDeSalchicha(){
        nombre = "Pizza de Salchicha";
        costo = 220.30;
    }
    public String getQueso(){
        return "Manchego";
    }
    
    public String getCarne(){
        return "Salchicha";
    }
    
    public String getMasa(){
        return "Masa Delgada";
    }   
}
