public class Mayonesa extends IngredientesInternos {
    public Mayonesa(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "mayoneza \n";
    }

    public double getCosto() {
        return super.getCosto() + 1;
    }
}
