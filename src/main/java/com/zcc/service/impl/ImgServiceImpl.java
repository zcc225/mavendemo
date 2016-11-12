package com.zcc.service.impl;

import com.zcc.dao.ImgMapper;
import com.zcc.domain.Img;
import com.zcc.service.IImgService;

public class ImgServiceImpl implements IImgService {

	private ImgMapper imgMapper;
	
	@Override
	public Img selectImg(String id) {
		return imgMapper.selectImgByPrimaryKey(1);
	}

	public ImgMapper getImgMapper() {
		return imgMapper;
	}

	public void setImgMapper(ImgMapper imgMapper) {
		this.imgMapper = imgMapper;
	}

	
}
