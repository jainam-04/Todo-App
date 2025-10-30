package com.app.controller;

import com.app.model.Task;
import com.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public String getAllTasks(Model model){
        List<Task> tasks = service.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        service.createTask(title);
        return "redirect:/";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteTask(@PathVariable long id){
        service.deleteTask(id);
        return "redirect:/";
    }

    @PutMapping("/{id}/toggle")
    public String toggleTask(@PathVariable long id){
        service.toggleTask(id);
        return "redirect:/";
    }
}
