package com.beautycommerce.middlewaresvc.Pojo.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse {
    private HttpStatus httpStatus;
    private Object object;
}
