package module4.oop.pr1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setId(1);
        item1.setName("Булка");

        Item item2 = new Item(2, "Рыба");

        Shop shop = new Shop();
        shop.setId(4);
        shop.setAddress("Минск");
        shop.setItems(List.of(item1, item2));
    }
}
