package com.beautycommerce.middlewaresvc.DAO;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.RegisterUserResponse;

public interface UserDAO {
    public RegisterUserResponse insertUser(RegisterUserRequest registerUserRequest);
}
