package com.beautycommerce.middlewaresvc.Pojo.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {
    private String responseCode;
    private String responseMessage;
    private Object registerUser;
}
