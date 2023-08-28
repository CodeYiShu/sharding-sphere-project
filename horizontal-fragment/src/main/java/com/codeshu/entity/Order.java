package com.codeshu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author CodeShu
 * @date 2023/8/27 14:48
 */
@TableName("t_order")
@Data
public class Order {
	//@TableId(type = IdType.AUTO)
	//@TableId(type = IdType.ASSIGN_ID)
	
	private Long id;
	private String orderNo;
	private Long userId;
	private BigDecimal amount;
}
