package com.beautycommerce.middlewaresvc.DAO.Impl;
import com.beautycommerce.middlewaresvc.Config.MessageConstant;
import com.beautycommerce.middlewaresvc.Config.QuerySQL;
import com.beautycommerce.middlewaresvc.Config.ResponseCodeConstant;
import com.beautycommerce.middlewaresvc.DAO.UserDAO;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.RegisterUserResponse;
import com.beautycommerce.middlewaresvc.Pojo.Response.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    @Override
    public RegisterUserResponse insertUser(RegisterUserRequest registerUserRequest) {
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        try{
            UserResponse response = jdbcTemplate.queryForObject(QuerySQL.INSERT_USER,
                    new Object[]{
                            registerUserRequest.getFirstName(),
                            registerUserRequest.getLastName(),
                            registerUserRequest.getFullName(),
                            registerUserRequest.getUsername(),
                            registerUserRequest.getPassword(),
                            registerUserRequest.getConfirmPassword(),
                            registerUserRequest.getPhoneNumber(),
                            registerUserRequest.getProfileImages(),
                            registerUserRequest.isActive(),
                            registerUserRequest.getCreatedAt(),
                            registerUserRequest.getModifiedAt()},
                    new BeanPropertyRowMapper<>(UserResponse.class)
                    );
            registerUserResponse.setResponseCode(String.valueOf(HttpStatus.OK.value()));
            registerUserResponse.setResponseMessage(MessageConstant.SUCCESS);
            registerUserResponse.setRegisterUser(response);
            return registerUserResponse;
        } catch (Exception e){
            registerUserResponse.setResponseCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
            registerUserResponse.setResponseMessage(MessageConstant.INTERNAL_SERVER_ERROR);
            return registerUserResponse;
        }
    }
}
