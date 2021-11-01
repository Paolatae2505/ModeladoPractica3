/**
 * Adaptador de Pizza a una Baguette
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre del 2021)
 * @see Pizza
 * @since Modelado y Pogramacion 2022-1
 */
public class AdaptadorPizza implements ProductoBaguette{

    Pizza pizza;

    /**
     * Crea la instancia de un Adaptador
     * @param pizza --- Pizza a adaptar a Baguette
     */
    public AdaptadorPizza(Pizza pizza){
        this.pizza = pizza;
    }

    /**
     * Regresa la descripcion de la Baguette adapatada 
     * @return --- String descripcion de la Baguette
     *             adaptada
     */
    public String getDescripcion(){
       String descripcion = "";
       descripcion = pizza.getNombre() + 
       "," + pizza.getQueso() + "," + pizza.getCarne() +
       "," + pizza.getMasa();
       return descripcion;
    }
    /**
     * Regresa el costo de la Baguette adapatada
     */
    public double getCosto(){
        return pizza.getCosto();
    }
    
}
