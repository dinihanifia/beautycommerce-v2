package com.beautycommerce.middlewaresvc.Config;

public class MessageConstant {

    // general message
    public static final String SUCCESS = "Success";
    public static final String BAD_REQUEST = "Bad Request";
    public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";

    // message if data not found when inserting data
    public static final String USER_FOUND = "User Already Exists";


    // message validation
    public static final String MESSAGE_EMPTY_FIELD = "This field is required and cannot be empty";
    public static final String MESSAGE_INVALID_LENGTH_FIRST_NAME = "First Name should not be less than 30 characters";
    public static final String MESSAGE_INVALID_LENGTH_LAST_NAME = "Last Name should not be less than 30 characters";
    public static final String MESSAGE_INVALID_LENGTH_FULL_NAME = "Full Name should not be less than 60 characters";
    public static final String MESSAGE_INVALID_LENGTH_USERNAME = "Username must be between 4 to 15 characters";
    public static final String MESSAGE_INVALID_LENGTH_PASSWORD = "Password must be between 8 to 20 characters";
    public static final String MESSAGE_INVALID_LENGTH_PHONE_NUMBER = "Phone Number must be between 10 to 15 characters";
}
