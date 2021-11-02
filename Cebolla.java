public class Cebolla extends IngredientesInternos {
    public Cebolla(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "cebolla \n";
    }

    public double getCosto() {
        return super.getCosto() + .25;
    }
}
