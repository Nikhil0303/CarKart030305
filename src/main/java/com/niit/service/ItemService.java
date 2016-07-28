package com.niit.service;

import com.niit.model.Item;

import java.util.List;


public interface ItemService {

    List<Item> getItemList();

    Item getItemById(int id);

    void addItem(Item item);

    void editItem(Item item);

    void deleteItem(Item item);
}
