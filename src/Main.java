/**
 * Created by MuhamadSyahirAmir on 9/25/2019.
 */
public class Main {
    public static void main(String[] args) {
        AutomaticRestaurant automaticRestaurant = new AutomaticRestaurant(2);
        System.out.println(automaticRestaurant);

        automaticRestaurant.viewMenu();
        automaticRestaurant.orderFood();
        automaticRestaurant.grabFood();
        automaticRestaurant.payForFood();
        System.out.println(automaticRestaurant);

        automaticRestaurant.viewMenu();
        automaticRestaurant.orderFood();
        automaticRestaurant.grabFood();
        automaticRestaurant.payForFood();
        System.out.println(automaticRestaurant);

        automaticRestaurant.viewMenu();
        automaticRestaurant.orderFood();
        automaticRestaurant.grabFood();
        automaticRestaurant.payForFood();
        System.out.println(automaticRestaurant);

    }
}
