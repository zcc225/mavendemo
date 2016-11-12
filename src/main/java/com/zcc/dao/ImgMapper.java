package com.zcc.dao;

import com.zcc.domain.Img;

public interface ImgMapper {
    int deleteImgByPrimaryKey(Integer id);

    int insertImg(Img record);

    int insertImgSelective(Img record);

    Img selectImgByPrimaryKey(Integer id);

    int updateImgByPrimaryKeySelective(Img record);

    int updateImgByPrimaryKey(Img record);
}