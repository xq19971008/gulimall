package com.jay.mall.product.dao;

import com.jay.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xieqiang
 * @email 976677278@qq.com
 * @date 2022-06-05 22:58:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
