package com.magusabdul.spingjjwt.security;

import com.magusabdul.spingjjwt.model.User;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JwtTokenProvider {
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @Value("600000")
    private Long expirantion = 1000L * 60 * 60; // ms * s * m = 1 jam

    public String generateToken(Authentication authentication){
        final User user = (User) authentication.getPrincipal();

        Date now = new Date(System.currentTimeMillis());
        Date expiryDate = new Date(now.getTime() + expirantion);

        Map<String, Object> claims = new HashMap<>();
        claims.put("username", user.getUsername());

        return Jwts.builder().setId(user.getId().toString()).setSubject(user.getUsername()).setClaims(claims).setIssuedAt(now).setExpiration(expiryDate).signWith(key).compact();
    }
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            log.error("Invalid Jwt Signature: {}", ex.getMessage());
        } catch (MalformedJwtException ex) {
            log.error("Invalid Jwt Token: {}", ex.getMessage());
        } catch (ExpiredJwtException ex) {
            log.error("Expired Jwt Token: {}", ex.getMessage());
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported Jwt Token: {}", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            log.error("Jwt claim string is empty: {}", ex.getMessage());
        }
        return false;
    }
    public String getUsername(String token){
        Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        return claims.get("username").toString();
    }
}
