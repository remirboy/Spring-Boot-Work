package ru.kpfu.itis.semestrovka.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.semestrovka.models.Item;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ItemDto {

    private Long id;
    private String content;
    private String car_name;
    private Integer power;
    private Integer max_speed;
    private  Integer weight;
    private  Integer waste;
    private  Integer acceleration;
    private String country;
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static ItemDto from(Item item) {
        return ItemDto.builder()
                .id(item.getId())
                .content(item.getContent())
                .car_name(item.getCar_name())
                .max_speed(item.getMax_speed())
                .power(item.getPower())
                .waste(item.getWaste())
                .weight(item.getWeight())
                .acceleration(item.getAcceleration())
                .body(item.getBody())
                .country(item.getCountry())
                .build();
    }

    public static List<ItemDto> from(List<Item> items) {
        return items.stream()
                .map(ItemDto::from)
                .collect(Collectors.toList());
    }

}
