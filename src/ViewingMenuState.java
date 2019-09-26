/**
 * Created by MuhamadSyahirAmir on 9/25/2019.
 */
public class ViewingMenuState implements State {

    AutomaticRestaurant automaticRestaurant;

    public ViewingMenuState(AutomaticRestaurant automaticRestaurant) {
        this.automaticRestaurant = automaticRestaurant;
    }

    @Override
    public void viewMenu() {
        System.out.println("You already viewed the menu.");
    }

    @Override
    public void orderFood() {
        System.out.println("Now preparing your food");
        automaticRestaurant.setState(automaticRestaurant.foodOrderedState);
    }

    @Override
    public void grabFood() {
        System.out.println("Your food is not ready yet.");
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
