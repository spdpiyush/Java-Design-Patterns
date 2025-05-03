package example1.approach2;

import example1.Address;
import example1.UserEntity;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {

        UserEntity userEntity = getUserEntity();
        UserDTO userDTO = build(UserDTO.getUserDTOBuilder(), userEntity);
        System.out.println(userDTO);
    }

    private static UserDTO build(UserDTO.UserDTOBuilder userDTOBuilder, UserEntity userEntity) {
        return userDTOBuilder.withFirstName(userEntity.getFirstName())
                .withLastName(userEntity.getLastName())
                .withAddress(userEntity.getAddress())
                .withAge(userEntity.getBirthDate())
                .build();

    }

    private static UserEntity getUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName("John");
        userEntity.setLastName("Doe");
        userEntity.setBirthDate(LocalDate.of(1996, 05, 22));
        Address address = new Address();
        address.setHouseNumber("1002");
        address.setStreet("Redmond Avenue");
        address.setCity("Salt Lake");
        address.setZipCode("123456");
        address.setState("Utah");
        userEntity.setAddress(address);
        return userEntity;
    }
}
