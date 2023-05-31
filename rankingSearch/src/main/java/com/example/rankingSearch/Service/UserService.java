package com.example.rankingSearch.Service;

import com.example.rankingSearch.Entity.UserEntity;
import com.example.rankingSearch.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public UserEntity getUserById(String userId){
        return userRepository.findById(userId).orElse(null);
    }

}
