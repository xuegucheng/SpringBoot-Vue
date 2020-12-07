package com.example.mapper;

import com.example.vo.Asset;
import com.example.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssetMapper {

    //获取当前所有设备树形结构
    public List<Asset> getAssetTree();

    public List<Asset> findAssetByName(String name);

    public List<Asset> ListAsset();

    public List<Asset> queryPage(Integer startRows);

    public int getRowCount();

    public int insertAsset(Asset asset);

    public int delete(int assetId);

    public int Update(Asset asset);

}
