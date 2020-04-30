//package ru.kpfu.itis.semestrovka.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import ru.kpfu.itis.semestrovka.models.Car;
//import ru.kpfu.itis.semestrovka.models.Item;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Data
//public class СarDto {
//    private String car_name;
//    private Integer max_speed;
//    private Integer power;
//    private Integer waste;
//    private Integer weight;
//    private String body;
//    private String country;
//
//    public static СarDto from(Car car) {
//        return СarDto.builder()
//
//                .build();
//    }
//
//    public static List<СarDto> from(List<Car> cars) {
//        return cars.stream()
//                .map(СarDto::from)
//                .collect(Collectors.toList());
//    }
//
//
//}
