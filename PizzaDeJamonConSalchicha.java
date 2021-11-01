public class PizzaDeJamonConSalchicha extends Pizza{
    
    public PizzaDeJamonConSalchicha(){
        nombre = "Pizza de Jamon con Salchicha";
        costo = 280.20;
    }

    public String getQueso(){
        return "Manchego";
    }
    
    public String getCarne(){
        return "Jamon y Salchicha";
    }
    
    public String getMasa(){
        return "Masa delgada";
    }
}
