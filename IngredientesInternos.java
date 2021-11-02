public abstract class IngredientesInternos implements ProductoBaguette {
    protected ProductoBaguette baguette;

    public IngredientesInternos(ProductoBaguette baguette) {
        this.baguette = baguette;
    }

    public String getDescripcion() {
        return baguette.getDescripcion();
    }

    public double getCosto() {
        return baguette.getCosto();
    }


}
