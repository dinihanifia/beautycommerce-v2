package com.beautycommerce.middlewaresvc.Service.Impl;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.ServiceResponse;
import com.beautycommerce.middlewaresvc.Service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public ServiceResponse registerUser(RegisterUserRequest registerUserRequest, BindingResult bindingResult) {
        return null;
    }
}
