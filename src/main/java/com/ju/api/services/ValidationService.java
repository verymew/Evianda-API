package com.ju.api.services;

public interface ValidationService {
    public String checarEmail(String email);
    public Boolean UsernameIsValid(String username);
    public String checarPassword(String password);
}
