/**
 * Created by MuhamadSyahirAmir on 9/25/2019.
 */
public class FoodOrderedState implements State {

    AutomaticRestaurant automaticRestaurant;

    public FoodOrderedState(AutomaticRestaurant automaticRestaurant) {
        this.automaticRestaurant = automaticRestaurant;
    }

    @Override
    public void viewMenu() {
        System.out.println("Your food is already being ordered!");
    }

    @Override
    public void orderFood() {
        System.out.println("Please grab your current food first!");
    }

    @Override
    public void grabFood() {
        System.out.println("You grabbed your food. Enjoy!");
        automaticRestaurant.setState(automaticRestaurant.foodGrabbedState);
    }

    @Override
    public void payForFood() {
        System.out.println("You can't pay for your food yet");
    }

    @Override
    public void printReceipt() {
        System.out.println("No receipt to be printed.");
    }
}
