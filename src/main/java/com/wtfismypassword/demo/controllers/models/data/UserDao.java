package com.wtfismypassword.demo.controllers.models.data;

import com.wtfismypassword.demo.controllers.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}
