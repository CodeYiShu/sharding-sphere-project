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
@Data
public class OrderVo {
	private Long id;
	private String orderNo;
	private Long userId;
	private BigDecimal amount;
	private String uname;
}
