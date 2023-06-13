package com.beautycommerce.middlewaresvc.Pojo.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorCodeResponse {
    private String responseCode;
    private String responseMessage;
}
