package com.example.service.impl;

import com.example.mapper.AssetMapper;
import com.example.service.AssetService;
import com.example.vo.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author XueGuCheng
 * @create 2020-12-07 23:06
 */
@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetMapper assetMapper;

    @Override
    public List<Asset> getAssetTree() {
        return assetMapper.getAssetTree();
    }

    @Override
    public List<Asset> findAssetByName(String name) {
        return assetMapper.findAssetByName(name);
    }

    @Override
    public List<Asset> ListAsset() {
        return assetMapper.ListAsset();
    }

    @Override
    public List<Asset> queryPage(Integer startRows) {
        return assetMapper.queryPage(startRows);
    }

    @Override
    public int getRowCount() {
        return assetMapper.getRowCount();
    }

    @Override
    public int insertAsset(Asset asset) {
        return assetMapper.insertAsset(asset);
    }

    @Override
    public int delete(int assetId) {
        return assetMapper.delete(assetId);
    }

    @Override
    public int Update(Asset asset) {
        return assetMapper.Update(asset);
    }
}
