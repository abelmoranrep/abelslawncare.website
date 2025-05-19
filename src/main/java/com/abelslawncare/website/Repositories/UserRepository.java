package com.abelslawncare.website.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abelslawncare.website.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
