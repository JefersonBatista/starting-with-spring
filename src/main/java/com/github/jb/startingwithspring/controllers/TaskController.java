package com.github.jb.startingwithspring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.jb.startingwithspring.services.TaskService;

@RestController
public class TaskController {
  @GetMapping("/tasks")
  public List<String> getTasks() {
    return TaskService.getTasks();
  }

  @PostMapping("/tasks")
  public void createTask(@RequestBody String newTask) {
    TaskService.addTask(newTask);
  }
}
