package dev.fcolucas.new_api.service;

import dev.fcolucas.new_api.model.User;

public interface UserService {
  User findById(Long id);

  User create(User userToCreate);
}
