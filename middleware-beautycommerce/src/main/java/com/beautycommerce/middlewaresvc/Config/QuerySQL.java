package com.beautycommerce.middlewaresvc.Config;

import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.RegisterUserResponse;

public class QuerySQL {

    public static final String INSERT_USER = "INSERT INTO public.user (user_id, first_name, last_name, full_name, " +
            "username, password, confirm_password, gender, phone_number, profile_images, is_active, created_at, modified_at) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING first_name, last_name, full_name, " +
            "username, gender, phone_number, profile_images, is_active, created_at, modified_at;";

}
