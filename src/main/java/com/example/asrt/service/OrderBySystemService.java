package com.example.asrt.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.asrt.model.Work_order;
import com.example.asrt.repository.OrderBySystemRepository;

@Service
public class OrderBySystemService {
	@Autowired
	private OrderBySystemRepository orderBySystemRepository;

	public List<Work_order> fetchAll(String systemName) {
		return orderBySystemRepository.findOrderBySystemName(systemName);
	}

	public Map<String, Long> countChoices(String systemName) {
		List<Work_order> workOrder = fetchAll(systemName);

		Map<String, Long> counts = new HashMap<>();
		for (Work_order d : workOrder) {
			String choice = d.getWork_status();
			Long count = counts.get(choice);
			if (count == null) {
				count = 0L;
			}
			count++;
			counts.put(choice, count);
		}
		return counts;
	}

	public Long countOpenChoices(String systemName) {
		Long count = countChoices(systemName).get("open");
		return count == null ? 0L : count;
	}

	public Long countClosedChoices(String systemName) {
		Long count = countChoices(systemName).get("closed");
		return count == null ? 0L : count;
	}

	public Long countPendingChoices(String systemName) {
		Long count = countChoices(systemName).get("pending");
		return count == null ? 0L : count;
	}

	public Long countNewChoices(String systemName) {
		Long count = countChoices(systemName).get("new");
		return count == null ? 0L : count;
	}
}
