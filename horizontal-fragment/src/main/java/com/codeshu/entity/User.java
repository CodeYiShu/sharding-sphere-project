package com.codeshu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author CodeShu
 * @date 2023/8/26 18:56
 */
@Data
@TableName("t_user")
public class User {
	@TableId(type = IdType.AUTO)
	private Long id;

	private String uname;
}
