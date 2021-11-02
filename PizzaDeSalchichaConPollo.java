/**
 * Instancia de Pizza De Salchicha Con Pollo 
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */
public class PizzaDeSalchichaConPollo extends Pizza {

     /**
     * Crea un Instancia de Pizza De Salchicha Con Pollo
     */
    public PizzaDeSalchichaConPollo(){
        nombre = "Pizza De Salchicha Con Pollo";
        costo = 300.00;
    }
    /**
     * Obtiene el tipo de Queso de la Pizza De Salchicha Con Pollo
     * @return ---- String el tipo de Queso de 
     *              la Pizza De Salchciha Con Pollo
     */
    @Override
    public String getQueso(){
        return "Chedar";
    }
    /**
     * Obtiene el tipo de Carne de la Pizza De Salchicha Con Pollo
     * @return  --- String del tipo de Carne
     *              de la Pizza De Salchicha Con Pollo
     */
    @Override
    public String getCarne(){
        return "Salchicha y pollo";
    }

    /**
     * Obtiene el tipo de masa de la Pizza  De Salchicha Con Pollo
     * @return  --- String del tipo de Masa de la Pizza
     *              De Salchicha Con Pollo
     */
    @Override
    public String getMasa(){
        return "Masa gruesa";
    }
}
