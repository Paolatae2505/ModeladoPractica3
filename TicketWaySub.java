public class TicketWaySub {
    private ProductoBaguette baguette;

    public TicketWaySub(ProductoBaguette baguette) {
        this.baguette = baguette;
    }

    public String toString() {
        return "\n---------------------------------" +
                "\n-------------Ticket--------------" +
                "\n---------------------------------" +
                "\n-- Resumen de compra: -----------\n" +
                baguette.getDescripcion() + "\n"
                + "----------Total a pagar----------"
                + "\n -- $" + baguette.getCosto() +
                "\n---------------------------------\n";

    }

}
