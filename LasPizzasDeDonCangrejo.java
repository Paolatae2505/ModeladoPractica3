/**
 * Instancia del restaturante las Pizzas de Don Cangrejo
 * @author Vargas Bravo Paola
 * @version 1.0 (31 de Octubre del 2021)
 * @since Modelado Y Programacion 2022-1
 */
public class LasPizzasDeDonCangrejo {

    private Pizza [] pizzas = new Pizza[5];

    /**
     * Crea una instacia de el Restaurante 
     * Las Pizzas de Don Cangrejo
     */
    public LasPizzasDeDonCangrejo(){
       PizzaDeJamon pizzaDeJamon = new PizzaDeJamon();
       PizzaDeJamonConSalchicha pizzaDeJamonConSalchicha = new PizzaDeJamonConSalchicha();
       PizzaDePollo pizzaDePollo = new PizzaDePollo();
       PizzaDeSalchicha pizzaDeSalchicha = new PizzaDeSalchicha();
       PizzaDeSalchichaConPollo pizzaDeSalchichaConPollo = new PizzaDeSalchichaConPollo();
        pizzas[0] = pizzaDeJamon;
        pizzas[1] = pizzaDeJamonConSalchicha;
        pizzas[2] = pizzaDePollo;
        pizzas[3] = pizzaDeSalchicha;
        pizzas[4] = pizzaDeSalchichaConPollo;
    }
    /**
     * Imprime el menu de pizzas.
     */
    public void menuPizzas(){
        Pizza pizza = null;
        System.out.println("-------------------------------------------");
        System.out.println("----------------Menu Pizzas----------------");
        System.out.println("-------------------------------------------");
        for(int i = 0; i < pizzas.length ; i++){
            pizza = pizzas[i];
            int numPizza = 0;
            numPizza = i ;// ojo 
            numPizza ++;
            System.out.println("Numero de Pizza :" + numPizza);
            System.out.println(pizza.getNombre());
            System.out.println("Contiene .... :");
            System.out.println("Tipo de Queso... : ");
            System.out.println(pizza.getQueso());
            System.out.println("Tipo de Carne... : ");
            System.out.println(pizza.getCarne());
            System.out.println("Tipo de Masa... : ");
            System.out.println(pizza.getMasa());
            System.out.println("-------------------------------------------");
        }
    }
    /**
     * Elige una Pizza de acuerdo a la eleccion del cliente 
     * en un rango de [1,5].
     * @param numPizza --- int numero de Pizza a elegir
     * @return -- Pizza elegida por el cliente
     */
    public Pizza elegirPizza(int numPizza){
        Pizza pizza = null;

        switch(numPizza){

            case 1 :
            pizza = pizzas[0];

            break;

            case 2 :
            pizza = pizzas[1];

            break;

            case 3 :
            pizza = pizzas[2];

            break;

            case 4 :
            pizza = pizzas[3];

            break;

            case 5 :
            pizza = pizzas[4];

            break;
        }

        return pizza;
    }

}
