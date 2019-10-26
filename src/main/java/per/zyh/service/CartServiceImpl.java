package per.zyh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.zyh.DAO.CartDAO;
import per.zyh.pojo.Cart;
import per.zyh.pojo.CartAndGoods;
import per.zyh.pojo.Goods;

import java.util.List;

/**
 * * author：张永辉; 2019/10/25; 10:38
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDAO cartDAO;

    @Override
    public Integer insertGoods(Integer userId, Integer goodsId,Integer goodsNum) {

        return cartDAO.insertGoods(userId, goodsId,goodsNum);
    }

    @Override
    public Integer queryCartIdByGoodsId(Integer goodsId, Integer userId) {
        return cartDAO.queryCartIdByGoodsId(goodsId,userId);
    }


    @Override
    public List<Integer> queryAllGoodsIdByUserId(Integer userId) {
        return cartDAO.queryAllGoodsIdByUserId(userId);
    }

    @Override
    public Integer queryGoodsNumByGoodsId(Integer goodsId, Integer userId) {
        return cartDAO.queryGoodsNumByGoodsId(goodsId,userId);
    }

    @Override
    public Integer updateGoodsNumByGoodsId(Integer goodsId, Integer goodsNum, Integer userId) {
        return cartDAO.updateGoodsNumByGoodsId(goodsId, goodsNum,userId);
    }


    @Override
    public Integer deleteGoods(Integer goodsId, Integer userId) {

        return cartDAO.deleteGoods(goodsId,userId);
    }

    @Override
    public List<CartAndGoods> queryAll(Integer userId) {
        return cartDAO.queryAll(userId);
    }

}
