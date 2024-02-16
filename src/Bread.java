public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String recipe;

    public Bread(){
        this.flour = 5.0;
        this.water = 3.0;
        this.salt = 3.0;
        this.sugar = 2.0;
        this.bakingPowder = 2.0;
        this.yeast = 2.0;
        this.breadName = "Making breads";
        this.state = "is not ready to bake";
        this.recipe = "5 steps";
    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String state, String recipe){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    public double getFlour(){
        return flour;
    }

    public double getWater() {
        return water;
    }

    public double getSalt() {
        return salt;
    }

    public double getSugar() {
        return sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public String getState() {
        return state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setFlour(double flour){
        this.flour = flour;
    }

    public void setWater(double water){
        this.water = water;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String toString(){
        return getFlour() + " cups of flour\n" + getWater() + " cups of water\n" + getSalt() + " tsps of salt\n" + getSugar() + " tsps of sugar\n" + getBakingPowder() + " tsps of baking powder\n" + getYeast() + " tsps of yeast\n";

    }
    // Bake methods
    public String bake(){
        return this.state = "is baked now";
    }
    // Get Ingredients methods
    public String getIngredients(){
        return getFlour() + " cups of flour\n" + getWater() + " cups of water\n" + getSalt() + " tsps of salt\n" + getSugar() + " tsps of sugar\n" + getBakingPowder() + " tsps of baking powder\n" + getYeast() + " tsps of yeast\n";
    }




}
