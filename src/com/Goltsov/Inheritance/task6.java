package com.Goltsov.Inheritance;

import java.util.Objects;

/*
Suppose that in Section 4.2.2, “The equals Method” (page 148), the
Item.equals method uses an instanceof test. Implement DiscountedItem.equals so
that it compares only the superclass if otherObject is an Item, but also includes the discount if it is a DiscountedItem.
Show that this method preserves
symmetry but fails to be transitive—that is, find a combination of items
and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).

 */
public class task6 {
    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("item", 10, 0.5);
        Item y = new Item("item", 10);
        DiscountedItem z = new DiscountedItem("item", 10, 0.15);

        System.out.println(x.equals(y)); // true
        System.out.println(y.equals(z)); // true
        System.out.println(x.equals(z)); // false
    }
}

class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}

class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == Item.class) return true;
        if (!super.equals(o)) return false;
        DiscountedItem that = (DiscountedItem) o;
        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}