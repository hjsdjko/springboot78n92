package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiangoutongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiangoutongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiangoutongView;


/**
 * 在线沟通
 *
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
public interface ZaixiangoutongService extends IService<ZaixiangoutongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiangoutongVO> selectListVO(Wrapper<ZaixiangoutongEntity> wrapper);
   	
   	ZaixiangoutongVO selectVO(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
   	
   	List<ZaixiangoutongView> selectListView(Wrapper<ZaixiangoutongEntity> wrapper);
   	
   	ZaixiangoutongView selectView(@Param("ew") Wrapper<ZaixiangoutongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiangoutongEntity> wrapper);
   	
}

