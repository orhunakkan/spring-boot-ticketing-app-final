package com.example.service;

import com.example.dto.UserDTO;
import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();
    UserDTO findByUserName(String userName);
    void save(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
    void delete(String userName);

}
