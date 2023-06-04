package pro.sky.course2.cart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Component
@SessionScope
public class Cart {
    private final ArrayList<Integer> cart = new ArrayList<>();

    public ArrayList<Integer> get() {
        return cart;
    }
}
