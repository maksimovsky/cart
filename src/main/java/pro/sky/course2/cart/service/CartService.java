package pro.sky.course2.cart.service;

import java.util.ArrayList;

public interface CartService {
    void add(Integer item);

    ArrayList<Integer> get();
}
