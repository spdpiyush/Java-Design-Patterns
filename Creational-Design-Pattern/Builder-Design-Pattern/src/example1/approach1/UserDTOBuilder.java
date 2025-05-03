package example1.approach1;

import java.time.LocalDate;

// Abstract Builder
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthDate(LocalDate birthDate);

    UserDTOBuilder withAddress(Address address);

    UserDTO build(); // to assemble to final Product

    UserDTO getUserUserDTO(); // to fetch already built object
}
