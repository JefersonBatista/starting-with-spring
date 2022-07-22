package com.github.jb.startingwithspring.services;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
  private static final List<String> tasks = new ArrayList<>();

  public static List<String> getTasks() {
    return tasks;
  }

  public static void addTask(String newTask) {
    tasks.add(newTask);
  }
}
