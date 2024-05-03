package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeixiudingdanDao;
import com.entity.WeixiudingdanEntity;
import com.service.WeixiudingdanService;
import com.entity.vo.WeixiudingdanVO;
import com.entity.view.WeixiudingdanView;

@Service("weixiudingdanService")
public class WeixiudingdanServiceImpl extends ServiceImpl<WeixiudingdanDao, WeixiudingdanEntity> implements WeixiudingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiudingdanEntity> page = this.selectPage(
                new Query<WeixiudingdanEntity>(params).getPage(),
                new EntityWrapper<WeixiudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiudingdanEntity> wrapper) {
		  Page<WeixiudingdanView> page =new Query<WeixiudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiudingdanVO> selectListVO(Wrapper<WeixiudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiudingdanVO selectVO(Wrapper<WeixiudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiudingdanView> selectListView(Wrapper<WeixiudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiudingdanView selectView(Wrapper<WeixiudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
