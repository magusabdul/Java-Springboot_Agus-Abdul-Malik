package com.magusabdul.spingjjwt.service;

import com.magusabdul.spingjjwt.model.User;
import com.magusabdul.spingjjwt.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getDistinctTopByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("Username Not Found");
        }
        return user;
    }
}
