package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiudingdanView;


/**
 * 维修订单
 *
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
public interface WeixiudingdanService extends IService<WeixiudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiudingdanVO> selectListVO(Wrapper<WeixiudingdanEntity> wrapper);
   	
   	WeixiudingdanVO selectVO(@Param("ew") Wrapper<WeixiudingdanEntity> wrapper);
   	
   	List<WeixiudingdanView> selectListView(Wrapper<WeixiudingdanEntity> wrapper);
   	
   	WeixiudingdanView selectView(@Param("ew") Wrapper<WeixiudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiudingdanEntity> wrapper);
   	
}

