import java.util.Scanner;
public class RestauranteWaySub {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        AdaptadorPizza adaptadorPizza ;
        LasPizzasDeDonCangrejo restauranteAbsorbido = new LasPizzasDeDonCangrejo();
        System.out.println("--------------------------------------------------");
        System.out.println("-------Bienvenido a el Restaurante WaySub---------");
        System.out.println("--------------------------------------------------");
        System.out.println("Tenemos dos opciones en nuestra sucursal : -------");
        System.out.println("1) Baguette   ------------------------------------");
        System.out.println("2) Pizza   ---------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("¿Cual te gustaria Ordenar ?-----------------------");
        System.out.println("--------------------------------------------------");
        eleccion = entrada.nextInt();
        switch(eleccion){

            case 1 :

            break;


            case 2 :
            Pizza pizza = null;
            int eleccionPizza = 0;
            System.out.println("Has elegido la opcion de pizza....");
            restauranteAbsorbido.menuPizzas();
            System.out.println("DIgite el numero de la pizza a ordenar...");
            eleccionPizza = entrada.nextInt();
            pizza = restauranteAbsorbido.elegirPizza(eleccionPizza);
            adaptadorPizza = new AdaptadorPizza(pizza);
            //// Pasarselo a el ticket
            System.out.println("¡Gracias por su compra!");
            break;

            default :
            System.out.println("Lo sentimos esa no es una opcion");
            break;
        }
        
    }
    
}
