
public class RestaurantClosedState implements State {

    AutomaticRestaurant automaticRestaurant;
	
	public RestaurantClosedState(AutomaticRestaurant automaticRestaurant) {
	    this.automaticRestaurant = automaticRestaurant;
    }

	@Override
	public void viewMenu() {
        System.out.println("Unable to view menu, restaurant is closed!");
	}

	@Override
	public void orderFood() {
        System.out.println("Unable to order, restaurant is closed!");
	}

	@Override
	public void grabFood() {
        System.out.println("No prepared food ready.");
	}

	@Override
	public void payForFood() {
        System.out.println("Your total price is $0.00");
	}

    @Override
    public void printReceipt() {
        System.out.println("No receipt to be printed.");
    }

}
