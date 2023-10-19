package com.springCrudApp.springCrudApp.exception;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import javax.naming.AuthenticationException;

public interface AuthenticationProvider {

    Authentication authenticate(Authentication authentication)
            throws AuthenticationException;

    boolean supports(Class<?> authentication);
}
