package example1.approach1;

import java.time.LocalDate;
import java.time.Period;

// Concrete Builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate birthDate) {
        Period period = Period.between(birthDate, LocalDate.now());
        this.age = String.valueOf(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = new StringBuilder()
                .append(address.getHouseNumber())
                .append(" , ")
                .append(address.getStreet())
                .append(" , ")
                .append(address.getCity())
                .append(" , ")
                .append(address.getState())
                .append(" , ")
                .append(address.getZipCode())
                .toString();
        return this;
    }

    @Override
    public UserDTO build() {
        String name = firstName +  " " + lastName;
        userWebDTO = new UserWebDTO(name, address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserUserDTO() {
        return userWebDTO;
    }
}
