package com.example.service.demo.restclient;

import com.example.service.demo.model.UserBetaDto;

import java.util.Collections;
import java.util.List;

public class ServiceBetaClientFallback implements ServiceBetaClient {

    private final Throwable cause;

    public ServiceBetaClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public List<UserBetaDto> getAllStudentsFromServiceBeta() {
        UserBetaDto userBetaDto = new UserBetaDto();
        userBetaDto.setFirstName("Fallback");
        userBetaDto.setLastName("Fallback");
        userBetaDto.setUserName("Fallback");
        userBetaDto.setSalary(0);
        userBetaDto.setSalary(0);
        return Collections.singletonList(userBetaDto);
    }
}
