package dev.fcolucas.new_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.fcolucas.new_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
