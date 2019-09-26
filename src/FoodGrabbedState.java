/**
 * Created by MuhamadSyahirAmir on 9/25/2019.
 */
public class FoodGrabbedState implements State {

    AutomaticRestaurant automaticRestaurant;

    public FoodGrabbedState(AutomaticRestaurant automaticRestaurant) {
        this.automaticRestaurant = automaticRestaurant;
    }

    @Override
    public void viewMenu() {
        System.out.println("You already viewed the menu.");
    }

    @Override
    public void orderFood() {
        System.out.println("Please pay for your current food first.");
        automaticRestaurant.setState(automaticRestaurant.foodOrderedState);
    }

    @Override
    public void grabFood() {
        System.out.println("You already grabbed your food");
    }

    @Override
    public void payForFood() {
        System.out.println("Payment received.");
    }

    @Override
    public void printReceipt() {
        automaticRestaurant.releaseFood();
        System.out.println("Here is your receipt.");
        if (automaticRestaurant.getCount() > 0) {
            automaticRestaurant.setState(automaticRestaurant.getViewingMenuState());
        } else {
            System.out.println("Oops, no more food!");
            automaticRestaurant.setState(automaticRestaurant.getRestaurantClosedState());
        }
    }
}
