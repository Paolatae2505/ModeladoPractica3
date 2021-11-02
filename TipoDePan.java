/**
 * Instancia Abstracta del tipo de Pan
 * @author Vargas Bravo Paola 
 * @version 1,0 (31 de Octubre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Programacion (2022-1)
 */

public abstract class TipoDePan implements ProductoBaguette{

    protected ProductoBaguette baguette;

    /**
     * Constructor Abstracto que crea una envoltura de 
     * Tipo De Pan
     * @param baguette --- ProductoBaguette a envolver
     */
    public TipoDePan(ProductoBaguette baguette){
        this.baguette = baguette;
    }
    /**
     * Obtiene la descripcion de la Baguette con 
     * el tipo de Pan que fue envuelto
     * @return ---String del Baguette mas el 
     *            tipo de Pan
     */
    public String getDescripcion(){
        return baguette.getDescripcion();
    }
    /**
     * Obtiene el costo de la Baguette mas la 
     * envoltura del tipo  de Pan
     * @return --- double del costo de labaguette 
     *             mas el precio de la envoltura 
     *             de tipo de pan
     */
    public double getCosto(){
        return baguette.getCosto();
    }

    
}
