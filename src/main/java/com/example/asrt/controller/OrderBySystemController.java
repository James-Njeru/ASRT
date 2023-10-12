package com.example.asrt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.asrt.model.Work_order;
import com.example.asrt.service.OrderBySystemService;

@RestController
public class OrderBySystemController {
	@Autowired
	private OrderBySystemService orderBySystemService;
	
	@GetMapping("/")
	public String homePage() {
		return "Home Page";
	}

	@GetMapping("/resolution-by-system/all/{systemName}")
	public List<Work_order> countAllChoices(@PathVariable String systemName) {
		return orderBySystemService.fetchAll(systemName);
	}

	@GetMapping("/resolution-by-system/open/{systemName}")
	public Long countOpenChoices(@PathVariable String systemName) {
		return orderBySystemService.countOpenChoices(systemName);
	}

	@GetMapping("/resolution-by-system/closed/{systemName}")
	public Long countClosedChoices(@PathVariable String systemName) {
		return orderBySystemService.countClosedChoices(systemName);
	}

	@GetMapping("/resolution-by-system/pending/{systemName}")
	public Long countPendingChoices(@PathVariable String systemName) {
		return orderBySystemService.countPendingChoices(systemName);
	}

	@GetMapping("/resolution-by-system/new/{systemName}")
	public Long countNewChoices(@PathVariable String systemName) {
		return orderBySystemService.countNewChoices(systemName);
	}
}
