package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {

    private Product[] items = new Product[0];

    // обратить внимание на item, а не items
    public void add(Product item) {
        // создаём новый массив
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        // itar+tab
        // копируем поэлементно
        //        for (int i = 0; i < items.length; i++) {
        //            tmp[i] = items[i];
        //        }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // закладываем последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    // удаление по id
    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }


}

