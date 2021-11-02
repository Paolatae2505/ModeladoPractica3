/**
 * Instancia de Pizza De Jamon Con Salchicha 
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */
public class PizzaDeJamonConSalchicha extends Pizza{
    
    /**
     * Crea un Instancia de Pizza De Jamon Con Salchicha
     */
    public PizzaDeJamonConSalchicha(){
        nombre = "Pizza De Jamon Con Salchicha";
        costo = 280.20;
    }
     /**
     * Obtiene el tipo de Queso de la Pizza De Jamon Con Salchicha
     * @return ---- String el tipo de Queso de 
     *              la Pizza De Jamon Con Salchicha
     */
    @Override
    public String getQueso(){
        return "Manchego";
    }
    /**
     * Obtiene el tipo de Carne de la Pizza De Jamon Con Salchicha 
     * @return  --- String del tipo de Carne
     *              de la Pizza De Jamon Con Salchicha
     */
    @Override
    public String getCarne(){
        return "Jamon y Salchicha";
    }
    /**
     * Obtiene el tipo de masa de la Pizza  De Jamon Con Salchicha 
     * @return  --- String del tipo de Masa de la Pizza
     *              De Jamon Con Salchicha 
     */
    @Override
    public String getMasa(){
        return "Masa delgada";
    }
}
