public class BreadTester {
    public static void main(String[] args){
        // create object of Superclass
        Bread bread = new Bread();
        // display getIngredients method
        System.out.println(bread.getIngredients());

        // create object of SourdoughBread Subclass
        SourdoughBread sourdoughBread = new SourdoughBread();
        // set values for SourdoughBread Subclass
        sourdoughBread.setFlour(5.00);
        sourdoughBread.setWater(1.5);
        sourdoughBread.setSalt(2.5);
        sourdoughBread.setYeast(1);
        sourdoughBread.setStarter(1);
        System.out.println("\nIngredients of Sourdough Bread are: \n"+ sourdoughBread + "\n");
        // display recipe of SourdoughBread Subclass
        System.out.println("A recipe of Sourdough Bread: \n" + sourdoughBread.recipeSourdough());
        // change bake status of Sourdough Bread
        System.out.println("\nSourdough Bread " + sourdoughBread.getState());
        System.out.println("Sourdough Bread " + sourdoughBread.bake());
    }

}
