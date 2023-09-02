package com.codeshu.request;

import com.codeshu.entity.OrderItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author CodeShu
 * @date 2023/9/2 12:44
 */
@Data
public class OrderItemInsertRequest {
	private String orderNo;
	private Long userId;
	private BigDecimal amount;

	private List<OrderItem> orderItemList;
}
