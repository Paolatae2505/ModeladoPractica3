/**
 * Instancia de Pizza De Pollo
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */
public class PizzaDePollo extends Pizza {

    /**
     * Crea un Instancia de Pizza De Pollo
     */
    public PizzaDePollo(){
        nombre = "Pizza de Pollo";
        costo = 230.50;
    }
     /**
     * Obtiene el tipo de Queso de la Pizza De Pollo
     * @return ---- String el tipo de Queso de 
     *              la Pizza De Pollo
     */
    @Override
    public String getQueso(){
        return "Chedar";
    }

    /**
     * Obtiene el tipo de Carne de la Pizza  
     * @return  --- String del tipo de Carne
     *              de la Pizza
     */
    @Override
    public String getCarne(){
        return "Pollo";
    }
    /**
     * Obtiene el tipo de masa de la Pizza  De Pollo
     * @return  --- String del tipo de Masa de la Pizza
     *              De Pollo
     */
    @Override
    public String getMasa(){
        return "Masa gruesa";
    }

}
