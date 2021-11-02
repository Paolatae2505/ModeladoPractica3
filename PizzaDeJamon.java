/**
 * Instancia de Pizza De Jamon
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */
public class PizzaDeJamon extends Pizza{
     /**
     * Crea un Instancia de Pizza De Jamon
     */
    public PizzaDeJamon(){
        nombre = "Pizza de Jamon";
        costo = 200.50;
    }
     /**
     * Obtiene el tipo de Queso de la Pizza De Jamon
     * @return ---- String el tipo de Queso de 
     *              la Pizza De Jamon
     */
    @Override
    public String getQueso(){
        return "Manchego";
    }
     /**
     * Obtiene el tipo de Carne de la Pizza De Jamon 
     * @return  --- String del tipo de Carne
     *              de la Pizza De Jamon
     */
    @Override
    public String getCarne(){
        return "Jamon";
    }
     /**
     * Obtiene el tipo de masa de la Pizza  De Jamon
     * @return  --- String del tipo de Masa de la Pizza
     *              De Jamon
     */
    @Override
    public String getMasa(){
        return "Masa gruesa";
    }


}
