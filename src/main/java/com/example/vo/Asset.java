package com.example.vo;


public class Asset {

  private long assetId;
  private String nodeContent;
  private String parentNodeContent;
  private long nodeNum;
  private long parentNum;


  public long getAssetId() {
    return assetId;
  }

  public void setAssetId(long assetId) {
    this.assetId = assetId;
  }


  public String getNodeContent() {
    return nodeContent;
  }

  public void setNodeContent(String nodeContent) {
    this.nodeContent = nodeContent;
  }


  public String getParentNodeContent() {
    return parentNodeContent;
  }

  public void setParentNodeContent(String parentNodeContent) {
    this.parentNodeContent = parentNodeContent;
  }


  public long getNodeNum() {
    return nodeNum;
  }

  public void setNodeNum(long nodeNum) {
    this.nodeNum = nodeNum;
  }


  public long getParentNum() {
    return parentNum;
  }

  public void setParentNum(long parentNum) {
    this.parentNum = parentNum;
  }

}
