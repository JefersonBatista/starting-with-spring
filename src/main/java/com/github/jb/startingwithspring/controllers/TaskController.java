package com.github.jb.startingwithspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TaskController {
  @GetMapping("/tasks")
  public String[] getTasks() {
    String[] tasks = {
        "Terminar primeiro projeto com Spring Boot",
        "Continuar aprendendo Spring Boot"
    };
    return tasks;
  }
}
