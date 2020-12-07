package com.example.service;

import com.example.vo.Asset;

import java.util.List;

/**
 * 描述:
 * AssetService
 *
 * @author XueGuCheng
 * @create 2020-12-07 23:05
 */
public interface AssetService {

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
