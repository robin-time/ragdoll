package com.ragdoll.sharding.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author time
 * @since 2022-02-12
 */
@TableName("goods_0")
public class Goods0 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long goodsId;

    private String goodsName;

    private Long goodsType;


    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "Goods0{" +
        "goodsId=" + goodsId +
        ", goodsName=" + goodsName +
        ", goodsType=" + goodsType +
        "}";
    }
}
