package com.codeshu.controller;

import com.codeshu.entity.Order;
import com.codeshu.entity.OrderVo;
import com.codeshu.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CodeShu
 * @date 2023/8/27 16:04
 */
@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	private OrderMapper orderMapper;

	@GetMapping("getAll")
	public List<Order> getAll() {
		return orderMapper.selectList(null);
	}

	@PostMapping("insert")
	public String insert(@RequestBody Order order) {
		orderMapper.insert(order);
		return "插入订单成功";
	}

	@GetMapping("getByIdWithUserName/{id}")
	public OrderVo getByIdWithUserName(@PathVariable Long id) {
		return orderMapper.getByIdWithUserName(id);
	}
}
