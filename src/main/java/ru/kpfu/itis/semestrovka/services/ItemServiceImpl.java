package ru.kpfu.itis.semestrovka.services;

import com.oracle.jrockit.jfr.ValueDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.semestrovka.dto.ItemDto;
import ru.kpfu.itis.semestrovka.dto.UserDto;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;
import ru.kpfu.itis.semestrovka.repositories.ItemRepository;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Component
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<ItemDto> getAllItems() {
        return ItemDto.from(itemRepository.findAll());
    }

    @Override
    public Item getItem(Long itemId) {
        return itemRepository.findItemById(itemId);
    }

    @Override
    public void addItem(ItemDto form,User user) {

        Item item = Item.builder()
                .content(form.getContent())
                .user_id(user.getId())
                .car_name(form.getCar_name())
                .max_speed(form.getMax_speed())
                .power(form.getPower())
                .waste(form.getWaste())
                .weight(form.getWeight())
                .acceleration(form.getAcceleration())
                .body(form.getBody())
                .country(form.getCountry())
                .build();
        itemRepository.save(item);

    }

    @Override
    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public void updateItem(ItemDto form,User user) {
        Item item = Item.builder()
                .id(form.getId())
                .content(form.getContent())
                .user_id(user.getId())
                .car_name(form.getCar_name())
                .max_speed(form.getMax_speed())
                .power(form.getPower())
                .waste(form.getWaste())
                .weight(form.getWeight())
                .acceleration(form.getAcceleration())
                .body(form.getBody())
                .country(form.getCountry())
                .build();
        System.out.println(item);
        itemRepository.save(item);
    }
}
