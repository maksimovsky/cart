package pro.sky.course2.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.cart.service.CartServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartServiceImpl cartService;

    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam Integer... items) {
        Arrays.stream(items).forEach(cartService::add);
        return "Товар(ы) успешно добавлен(ы)!";
    }

    @GetMapping("/get")
    public ArrayList<Integer> get() {
        return cartService.get();
    }
}
