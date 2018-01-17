package com.wtfismypassword.demo.controllers.models.data;

import com.wtfismypassword.demo.controllers.models.WebInfo;
import org.springframework.data.repository.CrudRepository;

public interface WebInfoDao extends CrudRepository<WebInfo, Integer>{
}
