import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {
    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 8.95));
        carts.add(new Cart("max", 10, 10, 500));
        carts.add(new Cart("susi", 5, 10, 400));

        Collections.sort(carts);
        System.out.println(carts);

        ArrayList<Cart> carts2 = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 8.95));
        carts.add(new Cart("max", 10, 10, 500));
        carts.add(new Cart("susi", 5, 10, 400));

        Collections.sort(carts2, new CartUsernameComparator());
        System.out.println(carts2);

        ArrayList<Cart> carts3 = new ArrayList<>();
        carts.add(new Cart("john", 4, 10, 125.90));
        carts.add(new Cart("jane", 1, 1, 8.95));
        carts.add(new Cart("max", 10, 10, 500));
        carts.add(new Cart("susi", 5, 10, 400));

        Collections.sort(carts3, new CartTotalItemsComparator());
        System.out.println(carts3);

    }
}
