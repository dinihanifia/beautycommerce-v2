package com.beautycommerce.middlewaresvc.Service;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.ServiceResponse;
import org.springframework.validation.BindingResult;

public interface LoginService {
    ServiceResponse registerUser(RegisterUserRequest registerUserRequest, BindingResult bindingResult);
}
