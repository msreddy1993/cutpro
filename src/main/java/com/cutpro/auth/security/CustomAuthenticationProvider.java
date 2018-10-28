package com.cutpro.auth.security;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider	{
	
	  public Authentication authenticate(Authentication authentication) throws AuthenticationException
	  {
	    // Get username and creds from authentication
	    String username = authentication.getName();
	    String password = null;
	    if (authentication.getCredentials() != null)
	      password = (String) authentication.getCredentials();
	    System.out.println(" Authenticating Username " + username);
	    
	    

	    // send http request to fetch planLimits and add to authorities (pending)

	    return new UsernamePasswordAuthenticationToken(SerializationUtils.serialize(null), password, null);
	  }

	  public boolean supports(Class<?> arg0)
	  {
	    return true;
	  }
}
