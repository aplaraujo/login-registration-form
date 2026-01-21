package io.github.aplaraujo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message="Required field")
    @NotEmpty(message="Required field")
    private String firstName;

    @NotEmpty(message="Required field")
    @NotEmpty(message="Required field")
    private String lastName;

    @Email(message="Email is not formatted")
    @NotEmpty(message="Required field")
    @NotEmpty(message="Required field")
    private String email;

    @NotEmpty(message="Required field")
    @NotEmpty(message="Required field")
    @Size(min=8, message="Password should be 8 characters long minimum")
    private String password;
}
