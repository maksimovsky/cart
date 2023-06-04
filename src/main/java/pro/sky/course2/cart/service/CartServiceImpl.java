package pro.sky.course2.cart.service;

import org.springframework.stereotype.Service;
import pro.sky.course2.cart.model.Cart;

import java.util.ArrayList;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(Integer item) {
        cart.get().add(item);
    }

    @Override
    public ArrayList<Integer> get() {
        return cart.get();
    }
}
