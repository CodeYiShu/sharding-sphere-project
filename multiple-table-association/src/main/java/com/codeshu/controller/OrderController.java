package com.codeshu.controller;

import com.codeshu.entity.Order;
import com.codeshu.entity.OrderItem;
import com.codeshu.mapper.OrderItemMapper;
import com.codeshu.mapper.OrderMapper;
import com.codeshu.request.OrderItemInsertRequest;
import com.codeshu.utils.ConvertUtils;
import com.codeshu.vo.OrderVo;
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

	@Autowired
	private OrderItemMapper orderItemMapper;

	@PostMapping("orderItemInsert")
	public String orderItemInsert(@RequestBody OrderItemInsertRequest request) {
		Order order = ConvertUtils.sourceToTarget(request, Order.class);
		List<OrderItem> orderItemList = request.getOrderItemList();

		orderMapper.insert(order);
		for (OrderItem orderItem : orderItemList) {
			orderItemMapper.insert(orderItem);
		}
		return "插入成功";
	}

	@GetMapping("getAllOrderAmount")
	public List<OrderVo> getAllOrderAmount() {
		return orderMapper.getAllOrderAmount();
	}
}
