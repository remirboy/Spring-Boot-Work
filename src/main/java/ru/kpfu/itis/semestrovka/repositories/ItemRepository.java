package ru.kpfu.itis.semestrovka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.semestrovka.models.Item;
import ru.kpfu.itis.semestrovka.models.User;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findItemById(Long id);
}
