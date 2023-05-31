package com.example.rankingSearch.Repository;

import com.example.rankingSearch.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
