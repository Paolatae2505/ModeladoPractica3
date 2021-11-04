/**
 * Instancia de TicketWaySub que crea los tickets para la cadena de comida WaySub.
 * @author Barón Herrera Victoria Elena
 * @version 1.0 (1 de Noviembre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Pogramacion 2022-1
 */
public class TicketWaySub {
    private ProductoBaguette baguette;
    /**
     * Crea una instancia de la clase TicketWaySub
     * @param baguette Baguette para la que creará el ticket
     */
    public TicketWaySub(ProductoBaguette baguette) {
        this.baguette = baguette;
    }

    /**
     * Crea un cadena de caracteres con los datos a imprimir
     * del ticket
     * @return String con los datos a imprimir del ticket
     */
    public String toString() {
        return "\n---------------------------------" +
                "\n-------------Ticket--------------" +
                "\n---------------------------------" +
                "\n-- Resumen de compra: -----------\n" +
                baguette.getDescripcion() + "\n"
                + "----------Total a pagar----------"
                + "\n -- $" + String.format("%.2f",baguette.getCosto()) +
                "\n---------------------------------\n";

    }

}
