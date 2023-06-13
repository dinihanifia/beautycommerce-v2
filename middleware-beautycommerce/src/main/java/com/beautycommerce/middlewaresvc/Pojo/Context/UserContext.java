package com.beautycommerce.middlewaresvc.Pojo.Context;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.ErrorCodeResponse;
import com.beautycommerce.middlewaresvc.Pojo.Response.RegisterUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.validation.BindingResult;

import java.util.Optional;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class UserContext {
    RegisterUserRequest registerUserRequest;
    BindingResult bindingResult;
    UUID userId;
    int pageNo;
    int pageSize;

    public UserContext(RegisterUserRequest registerUserRequest, BindingResult bind, UUID userId, int pageNo, int pageSize) {
        this.registerUserRequest = registerUserRequest;
        this.bindingResult = bind;
        this.userId = userId;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    RegisterUserResponse registerUserResponse;
    ErrorCodeResponse errorCodeResponse;

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }

}
