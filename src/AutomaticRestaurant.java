
public class AutomaticRestaurant {

    State restaurantClosedState;
    State viewingMenuState;
    State foodOrderedState;
    State foodGrabbedState;
    State state = restaurantClosedState;
    int count = 0;

    public AutomaticRestaurant(int numberOfFood) {
        restaurantClosedState = new RestaurantClosedState(this);
        viewingMenuState = new ViewingMenuState(this);
        foodOrderedState = new FoodOrderedState(this);
        foodGrabbedState = new FoodGrabbedState(this);
        this.count = numberOfFood;
        if (numberOfFood > 0) {
            state = viewingMenuState;
        }
    }

    public State getRestaurantClosedState() {
        return restaurantClosedState;
    }

    public void setRestaurantClosedState(State restaurantClosedState) {
        this.restaurantClosedState = restaurantClosedState;
    }

    public State getViewingMenuState() {
        return viewingMenuState;
    }

    public void setViewingMenuState(State viewingMenuState) {
        this.viewingMenuState = viewingMenuState;
    }

    public State getFoodOrderedState() {
        return foodOrderedState;
    }

    public void setFoodOrderedState(State foodOrderedState) {
        this.foodOrderedState = foodOrderedState;
    }

    public State getFoodGrabbedState() {
        return foodGrabbedState;
    }

    public void setFoodGrabbedState(State foodGrabbedState) {
        this.foodGrabbedState = foodGrabbedState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void viewMenu() {
        state.viewMenu();
    }

    public void orderFood() {
        state.orderFood();
    }

    public void grabFood() {
        state.grabFood();
    }

    public void payForFood() {
        state.payForFood();
        state.printReceipt();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseFood() {
        System.out.println("Thank you!");
        if (count != 0) {
            count = count - 1;
        }
    }

    public String toString() {
        return "\nWelcome to the Automatic Restaurant\n" +
                "Here is our menu\n" +
                "Food available: " + count + "\n";
    }
}
