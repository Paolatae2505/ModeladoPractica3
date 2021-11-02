public class Jitomate extends IngredientesInternos {
    public Jitomate(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "jitomate \n";
    }

    public double getCosto() {
        return super.getCosto() + .25;
    }
}
