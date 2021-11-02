import java.util.Scanner;

public class RestauranteWaySub {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        AdaptadorPizza adaptadorPizza;
        LasPizzasDeDonCangrejo restauranteAbsorbido = new LasPizzasDeDonCangrejo();
        System.out.println("--------------------------------------------------");
        System.out.println("-------Bienvenido al Restaurante WaySub---------");
        System.out.println("--------------------------------------------------");
        System.out.println("Tenemos dos opciones en nuestra sucursal : -------");
        System.out.println("1) Baguette   ------------------------------------");
        System.out.println("2) Pizza   ---------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("¿Cuál te gustaria ordenar? -----------------------");
        System.out.println("--------------------------------------------------");
        eleccion = entrada.nextInt();
        switch (eleccion) {
            case 1:
                ProductoBaguette baguette = new Baguette();
                System.out.println("Has elegido la opción de baguette....");
                System.out.println("Digite el número de tipo de pan a ordenar...");
                System.out.println("1. Pan Blanco ----------------- $30.00");
                System.out.println("2. Pan De Avena Con Miel ------ $50.00");
                System.out.println("3. Pan De Oregano ------------- $35.00");
                int numTipoDePan = entrada.nextInt();
                switch (numTipoDePan) {
                    case 1:
                        baguette = new PanBlanco(baguette);
                        break;

                    case 2:
                        baguette = new PanDeAvenaConMiel(baguette);
                        break;

                    case 3:
                        baguette = new PanDeOregano(baguette);
                        break;

                    default:
                        System.out.println("Lo sentimos, esa no es una opción.");
                        break;
                }
                //baguette = elegirTipoDePan(numTipoDePan);
                System.out.println(baguette.getDescripcion());
                System.out.println("¿Qué ingredientes desea agregar?");
                int numIngredientes = 0;
                while (numIngredientes != 10) {
                    System.out.println("1) Cebolla ------------------ +$0.25");
                    System.out.println("2) Catsup ------------------- +$1.00");
                    System.out.println("3) Mayonesa ----------------- +$1.00");
                    System.out.println("4) Jitomate ----------------- +$0.25");
                    System.out.println("5) Lechuga ------------------ +$0.25");
                    System.out.println("6) Jamón -------------------- +$10.00");
                    System.out.println("7) Pepperoni ---------------- +$10.00");
                    System.out.println("8) Mostaza ------------------ +$1.00");
                    System.out.println("9) Pollo -------------------- +$10.00");
                    System.out.println("10) Es todo.");
                    numIngredientes = entrada.nextInt();
                    switch (numIngredientes) {
                        case 1:
                            baguette = new Cebolla(baguette);
                            break;

                        case 2:
                            baguette = new Catsup(baguette);
                            break;

                        case 3:
                            baguette = new Mayonesa(baguette);
                            break;

                        case 4:
                            baguette = new Jitomate(baguette);
                            break;

                        case 5:
                            baguette = new Lechuga(baguette);
                            break;

                        case 6:
                            baguette = new Jamon(baguette);
                            break;

                        case 7:
                            baguette = new Pepperoni(baguette);
                            break;

                        case 8:
                            baguette = new Mostaza(baguette);
                            break;

                        case 9:
                            baguette = new Pollo(baguette);
                            break;

                        case 10:
                            //System.out.println(new TicketWaySub(baguette).toString());
                            break;

                        default:
                            System.out.println("Lo sentimos esa no es una opcion");
                            break;
                    }
                }
                //el baguette es null
                System.out.println(new TicketWaySub(baguette).toString());
                break;

            case 2:
                Pizza pizza = null;
                System.out.println("Has elegido la opción de pizza....");
                restauranteAbsorbido.menuPizzas();
                System.out.println("Digite el número de la pizza a ordenar...");
                int eleccionPizza = entrada.nextInt();
                pizza = restauranteAbsorbido.elegirPizza(eleccionPizza);
                adaptadorPizza = new AdaptadorPizza(pizza);
                new TicketWaySub(adaptadorPizza).toString();
                System.out.println("¡Gracias por su compra!");
                break;

            default:
                System.out.println("Lo sentimos esa no es una opcion");
                break;
        }
    }

}
