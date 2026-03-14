package com.example.task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.task.dto.TaskRequest;
import com.example.task.dto.TaskResponse;
import com.example.task.response.ApiResponse;
import com.example.task.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // BULK INSERT USING LIST
    @PostMapping
    public ApiResponse<List<TaskResponse>> createTasks(
            @Valid @RequestBody List<TaskRequest> requests) {

        List<TaskResponse> response = service.createTasks(requests);

        return new ApiResponse<>("success", response);
    }

    // GET ALL TASKS
    @GetMapping
    public ApiResponse<List<TaskResponse>> getAllTasks(){

        List<TaskResponse> response = service.getAllTasks();

        return new ApiResponse<>("success", response);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteTask(@PathVariable Long id){

        service.deleteTask(id);

        return new ApiResponse<>("success", "Task Deleted");
    }
}