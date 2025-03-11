package com.example.service;

import com.example.dto.response.MessageResponse;
import com.example.dto.request.UserRequest;

public interface RegistrationService {

    MessageResponse registration(String captchaResponse, UserRequest user);

    MessageResponse activateEmailCode(String code);
}
