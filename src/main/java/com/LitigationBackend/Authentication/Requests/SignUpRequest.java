package com.LitigationBackend.Authentication.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@CrossOrigin
public class SignUpRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 40,message = "should be 6 characters and above")
    private String password;

    @NotBlank@Size(min = 6, max = 40,message = "should be 6 characters and above")
    private String confirmPassword;

    @NotBlank
    @Size(min = 3, max = 20)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 20)
    private String lastName;

    @NotBlank(message = "should be 10 and above")
    @Size(min = 10, max = 12)
    private String phoneNo;

}
