public class TicketWaySub {
    private ProductoBaguette baguette;

    public TicketWaySub(ProductoBaguette baguette) {
        this.baguette = baguette;
    }

    public String toString() {
        return baguette.getDescripcion() + "\n" + baguette.getCosto();
    }

}
