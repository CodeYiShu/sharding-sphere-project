package com.codeshu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codeshu.entity.Order;
import com.codeshu.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeShu
 * @date 2023/8/26 18:58
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
	/**
	 * 查询所有订单的总金额
	 */
	List<OrderVo> getAllOrderAmount();
}
