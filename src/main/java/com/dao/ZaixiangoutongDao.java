package com.dao;

import com.entity.ZaixiangoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiangoutongVO;
import com.entity.view.ZaixiangoutongView;


/**
 * 在线沟通
 * 
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
public interface ZaixiangoutongDao extends BaseMapper<ZaixiangoutongEntity> {
	
	List<ZaixiangoutongVO> selectListVO(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
	
	ZaixiangoutongVO selectVO(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
	
	List<ZaixiangoutongView> selectListView(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);

	List<ZaixiangoutongView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
	
	ZaixiangoutongView selectView(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
	
}
