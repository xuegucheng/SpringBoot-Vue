package com.example.controller;

import com.example.service.AssetService;
import com.example.vo.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 *
 * @author XueGuCheng
 * @create 2020-12-07 23:09
 */
@RestController
@RequestMapping("/Asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @RequestMapping(value = "/getAssetTree", method = RequestMethod.GET)
    public List<Asset> getAssetTree() {
        List<Asset> assetTree = assetService.getAssetTree();
        return assetTree;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Integer delete(Integer assetId) {
        System.out.println(assetId);
        int result = assetService.delete(assetId);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String update(Asset asset) {
        int result = assetService.Update(asset);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(Asset asset) {
        return assetService.insertAsset(asset);
    }

    @RequestMapping("/ListAsset")
    @ResponseBody
    public List<Asset> ListAsset() {
        return assetService.ListAsset();
    }

    @RequestMapping("/ListAssetByName")
    @ResponseBody
    public List<Asset> ListAssetByName(String name) {
        return assetService.findAssetByName(name);
    }

    /**
     * 分页
     * @return
     */
    @RequestMapping(value="/page")
    @ResponseBody
    public List<Asset> page(Integer page){
        int pageNow = page == null ? 1 : page;
        int pageSize = 5;
        int startRows = pageSize*(pageNow-1);
        List<Asset> list = assetService.queryPage(startRows);
        return list;
    }

    /**
     * rows
     * @return
     */
    @RequestMapping(value="/rows")
    @ResponseBody
    public int rows(){
        return assetService.getRowCount();
    }


}
