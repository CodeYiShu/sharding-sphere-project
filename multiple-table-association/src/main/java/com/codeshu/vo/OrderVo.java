package com.codeshu.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author CodeShu
 * @date 2023/9/2 13:52
 */
@Data
public class OrderVo {
	private String orderNo;

	private BigDecimal orderAmount;
}
