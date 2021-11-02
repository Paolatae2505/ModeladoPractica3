public class Pepperoni extends IngredientesInternos {
    public Pepperoni(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "pepperoni \n";
    }

    public double getCosto() {
        return super.getCosto() + 10;
    }
}
