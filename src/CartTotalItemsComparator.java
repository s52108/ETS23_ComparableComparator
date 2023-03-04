import java.util.Comparator;

public class CartTotalItemsComparator implements Comparator<Cart> {

    @Override
    public int compare(Cart cart, Cart other) {
        return Integer.compare(other.getTotalItems(), cart.getTotalItems());
    }
}
