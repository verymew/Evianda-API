package com.ju.api.services;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService{
    @Override
    public String checarEmail(String email) {
        return null;
    }

    @Override
    public Boolean UsernameIsValid(String username) {
        if(username.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public String checarPassword(String password) {
        return null;
    }
}
