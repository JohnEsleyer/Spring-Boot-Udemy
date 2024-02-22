package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public String getAllTodos(Model model) {
        List<Todo> todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);
        return "todos";
    }

    @PostMapping("/todos")
    public String saveOrUpdate(Todo todo) {
        todoService.saveOrUpdate(todo);
        return "redirect:/todos";
    }

    @GetMapping("/todos/{id}/delete")
    public String deleteTodo(Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todos";
    }
}
