/**
 * Instancia de Pizza De Salchicha
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */
public class PizzaDeSalchicha extends Pizza{
     /**
     * Crea un Instancia de Pizza De Salchicha
     */
    public PizzaDeSalchicha(){
        nombre = "Pizza de Salchicha";
        costo = 220.30;
    }
    /**
     * Obtiene el tipo de Queso de la Pizza De Salchicha
     * @return ---- String el tipo de Queso de 
     *              la Pizza De Salchciha
     */
    @Override
    public String getQueso(){
        return "Manchego";
    }
    /**
     * Obtiene el tipo de Carne de la Pizza De Salchicha 
     * @return  --- String del tipo de Carne
     *              de la Pizza De Salchicha
     */
    @Override
    public String getCarne(){
        return "Salchicha";
    }
    /**
     * Obtiene el tipo de masa de la Pizza  De Salchicha
     * @return  --- String del tipo de Masa de la Pizza
     *              De Salchicha
     */
    @Override
    public String getMasa(){
        return "Masa Delgada";
    }   
}
