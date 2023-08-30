package com.codeshu.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.codeshu.entity.Order;
import com.codeshu.mapper.OrderMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CodeShu
 * @date 2023/8/27 18:51
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

	@GetMapping("getByUserId")
	public List<Order> getAll(Long userId) {
		LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(Order::getUserId, userId);
		return orderMapper.selectList(queryWrapper);
	}

	@GetMapping("getByUserIdAndOrderNo")
	public List<Order> getAll(@Param("userId") Long userId, @Param("orderNo") String orderNo) {
		LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
		queryWrapper.eq(Order::getUserId, userId).eq(Order::getOrderNo, orderNo);
		return orderMapper.selectList(queryWrapper);
	}

	@PostMapping("insert")
	public String insert(@RequestBody Order order) {
		orderMapper.insert(order);
		return "插入成功";
	}
}
