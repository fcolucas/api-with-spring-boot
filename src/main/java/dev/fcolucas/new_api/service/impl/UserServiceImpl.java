package dev.fcolucas.new_api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.fcolucas.new_api.model.User;
import dev.fcolucas.new_api.repository.UserRepository;
import dev.fcolucas.new_api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public User create(User userToCreate) {
    if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
      throw new IllegalArgumentException("This account already exists");
    }

    return userRepository.save(userToCreate);
  }

}
