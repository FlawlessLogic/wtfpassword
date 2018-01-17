package com.wtfismypassword.demo.controllers.models.data;

import com.wtfismypassword.demo.controllers.models.UsernameRequirement;
import org.springframework.data.repository.CrudRepository;

public interface UsernameRequirementsDao extends CrudRepository<UsernameRequirement, Integer>{
}
