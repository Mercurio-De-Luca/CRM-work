package com.CRMwork.back.security.service;

import com.CRMwork.back.security.payload.LoginDto;
import com.CRMwork.back.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
