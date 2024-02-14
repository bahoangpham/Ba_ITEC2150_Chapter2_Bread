public class SourdoughBread extends Bread {
    private double starter; // # cups of ripe sourdough starter
    private double milk; // # cups of milk

    public SourdoughBread(){

        this.starter = 2;
        this.milk = 1.5;
    }

    public SourdoughBread(double starter, double milk){
        this.starter = starter;
        this.milk = milk;
    }

    public double getStarter(){
        return starter;
    }

    public double getMilk() {
        return milk;
    }

    public void setStarter(double starter){
        this.starter = starter;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public String recipeSourdough(){
        return ("1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" + "2. Make the dough\n" + "3. Bulk Rise\n" + "4. Stretch and fold the dough\n" + "5. Cut and shape the dough\n" + "6. Second rise\n" +"6. Preheat the oven to 450°F towards the tail end of the second rise.\n" + "7. Spray the laof with luke warm water.\n" +"8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +"9. Remove the bread from the oven.\n" + "10.Let the bread cool until good to eat.");
    }
    public String toString(){
        return (getFlour() + " cups of flour\n" + getWater() + " cups of water\n" + getSalt() + " tsps of salt\n" + getSugar() + " tsps of sugar\n" + getBakingPowder() + " tsps of baking powder\n" + getYeast() + " tsps of yeast\n" + getStarter() + " cup of ripe sourdough starter\n" + getMilk() + " cup of milk");
    }

}
