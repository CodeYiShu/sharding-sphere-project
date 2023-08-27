package com.codeshu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codeshu.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author CodeShu
 * @date 2023/8/26 18:58
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
