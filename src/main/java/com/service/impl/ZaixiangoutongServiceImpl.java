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


import com.dao.ZaixiangoutongDao;
import com.entity.ZaixiangoutongEntity;
import com.service.ZaixiangoutongService;
import com.entity.vo.ZaixiangoutongVO;
import com.entity.view.ZaixiangoutongView;

@Service("zaixiangoutongService")
public class ZaixiangoutongServiceImpl extends ServiceImpl<ZaixiangoutongDao, ZaixiangoutongEntity> implements ZaixiangoutongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiangoutongEntity> page = this.selectPage(
                new Query<ZaixiangoutongEntity>(params).getPage(),
                new EntityWrapper<ZaixiangoutongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiangoutongEntity> wrapper) {
		  Page<ZaixiangoutongView> page =new Query<ZaixiangoutongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiangoutongVO> selectListVO(Wrapper<ZaixiangoutongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiangoutongVO selectVO(Wrapper<ZaixiangoutongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiangoutongView> selectListView(Wrapper<ZaixiangoutongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiangoutongView selectView(Wrapper<ZaixiangoutongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
