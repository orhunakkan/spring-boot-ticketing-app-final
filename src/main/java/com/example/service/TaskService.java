package com.example.service;

import com.example.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    TaskDTO findById(Long id);
    List<TaskDTO> listAllTasks();
    void save(TaskDTO taskDTO);
    void delete(Long id);
    void update(Long id);

}
