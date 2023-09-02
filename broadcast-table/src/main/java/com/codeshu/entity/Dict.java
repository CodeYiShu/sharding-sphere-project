package com.codeshu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author CodeShu
 * @date 2023/9/2 15:22
 */
@TableName("t_dict")
@Data
public class Dict {
	//可以使用MyBatisPlus的雪花算法
	@TableId(type = IdType.ASSIGN_ID)
	private Long id;
	private String dictType;
}

