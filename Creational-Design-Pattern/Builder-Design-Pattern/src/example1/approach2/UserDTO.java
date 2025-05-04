package example1.approach2;

import example1.Address;

import java.time.LocalDate;
import java.time.Period;

// Product Class
public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static UserDTOBuilder getUserDTOBuilder() {
        return new UserDTOBuilder();
    }
    // Builder
    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withAge(LocalDate localDate) {
            Period period = Period.between(localDate, LocalDate.now());
            this.age = String.valueOf(period.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = new StringBuilder()
                    .append(address.getHouseNumber())
                    .append(" ,")
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

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }
}
