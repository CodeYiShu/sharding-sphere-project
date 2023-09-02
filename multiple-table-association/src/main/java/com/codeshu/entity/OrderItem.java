package com.codeshu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author CodeShu
 * @date 2023/9/1 21:42
 */
@TableName("t_order_item")
@Data
public class OrderItem {
	//当配置了shardingsphere-jdbc的分布式序列时，自动使用shardingsphere-jdbc的分布式序列
	@TableId(type = IdType.AUTO)
	private Long id;
	private String orderNo;
	private Long userId;
	private BigDecimal price;
	private Integer count;
}

