package com.beautycommerce.middlewaresvc.Pojo.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String userId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String username;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String profileImages;
    private boolean isActive;
    private String createdAt;
    private String modifiedAt;

}
