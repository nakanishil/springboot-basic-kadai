package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Controller
public class ToDoController {
	private final ToDoRepository toDoRepository;
	
	public ToDoController(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}
	
	@GetMapping("/")
	public String toDoList(Model model) {
//		ToDoリストの取得
		List<ToDo> toDoList = toDoRepository.findAll();
		
//		ビューにユーザリストを渡す
		model.addAttribute("toDoList", toDoList);
		
		return "todoView";
	}
}
