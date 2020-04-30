package ru.kpfu.itis.semestrovka.services;

import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.dto.UserDto;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;

import java.util.List;

public interface ItemService {
    List<ItemDto> getAllItems();
    Item getItem(Long itemId);
    void addItem(ItemDto form, User user);
    void deleteItem(Item item);
    void updateItem(ItemDto form,User user);
}
