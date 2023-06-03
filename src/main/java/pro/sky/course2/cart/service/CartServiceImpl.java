package pro.sky.course2.cart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@SessionScope
public class CartServiceImpl implements CartService {

    private final ArrayList<Integer> cart = new ArrayList<>();

    @Override
    public void add(Integer item) {
        cart.add(item);
    }

    @Override
    public ArrayList<Integer> get() {
        return cart;
    }
}
