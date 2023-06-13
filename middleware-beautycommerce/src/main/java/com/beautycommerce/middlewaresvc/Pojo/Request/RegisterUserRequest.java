package com.beautycommerce.middlewaresvc.Pojo.Request;
import com.beautycommerce.middlewaresvc.Config.MessageConstant;
import com.beautycommerce.middlewaresvc.Pojo.Constraint.Password;
import com.beautycommerce.middlewaresvc.Pojo.Constraint.StringOnly;
import com.beautycommerce.middlewaresvc.Pojo.Constraint.Username;
import com.beautycommerce.middlewaresvc.Pojo.Interface.RegisterRequestInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("first_name")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
    groups = RegisterRequestInterface.class)
    @Size(max = 30, message = MessageConstant.MESSAGE_INVALID_LENGTH_FIRST_NAME)
    @StringOnly
    private String firstName;

    @JsonProperty("last_name")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(max = 30, message = MessageConstant.MESSAGE_INVALID_LENGTH_LAST_NAME)
    @StringOnly
    private String lastName;

    @JsonProperty("full_name")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(max = 60, message = MessageConstant.MESSAGE_INVALID_LENGTH_FULL_NAME)
    @StringOnly
    private String fullName;

    @JsonProperty("username")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(min = 4,max = 15, message = MessageConstant.MESSAGE_INVALID_LENGTH_USERNAME)
    @Username
    private String username;

    @JsonProperty("password")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(min = 8,max = 20, message = MessageConstant.MESSAGE_INVALID_LENGTH_PASSWORD)
    @Password
    private String password;

    @JsonProperty("confirm_password")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(min = 8,max = 20, message = MessageConstant.MESSAGE_INVALID_LENGTH_PASSWORD)
    private String confirmPassword;

    @JsonProperty("phone_number")
    @NotBlank(message = MessageConstant.MESSAGE_EMPTY_FIELD,
            groups = RegisterRequestInterface.class)
    @Size(min = 10,max = 15, message = MessageConstant.MESSAGE_INVALID_LENGTH_PHONE_NUMBER)
    private String phoneNumber;

    @JsonProperty("profile_images")
    private String profileImages;

    @JsonProperty("is_active")
    private boolean isActive;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("modified_at")
    private String modifiedAt;
}
