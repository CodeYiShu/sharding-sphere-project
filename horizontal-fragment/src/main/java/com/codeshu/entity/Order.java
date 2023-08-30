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
	/**
	 * 当配置了 shardingsphere-jdbc 的分布式序列时，自动使用 shardingsphere-jdbc 的分布式序列
	 * 当没有配置 shardingsphere-jdbc 的分布式序列时，自动依赖数据库的主键自增策略
	 */
	//@TableId(type = IdType.ASSIGN_ID)
	@TableId(type = IdType.AUTO)
	private Long id;
	private String orderNo;
	private Long userId;
	private BigDecimal amount;
}
