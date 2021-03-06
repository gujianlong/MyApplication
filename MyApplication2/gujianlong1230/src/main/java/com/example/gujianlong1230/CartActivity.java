package com.example.gujianlong1230;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.gujianlong1230.adabter.CartAdapter;
import com.example.gujianlong1230.base.BaseActivity;
import com.example.gujianlong1230.base.BasePresenter;
import com.example.gujianlong1230.bean.BannerBean;
import com.example.gujianlong1230.bean.CartBean;
import com.example.gujianlong1230.bean.DingBean;
import com.example.gujianlong1230.bean.OrderBean;
import com.example.gujianlong1230.bean.UserBean;
import com.example.gujianlong1230.mvp.Presenter;
import com.example.gujianlong1230.url.MyUrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartActivity extends BaseActivity {


    private ExpandableListView elv;
    private CartAdapter cartAdapter;

    @Override
    protected void startDing() {
        mPresenter.getInfoParam();

    }

    @Override
    protected BasePresenter getPresenter() {
        return new Presenter();
    }

    @Override
    protected void initView() {
        elv = findViewById(R.id.elv);
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_gouwuche;
    }


    @Override
    public void onHomeSuccess(UserBean userBean) {

    }

    @Override
    public void onHomeError(Throwable throwable) {

    }

    @Override
    public void onBannerSuccess(BannerBean bannerBean) {

    }

    @Override
    public void onBannerError(Throwable throwable) {

    }

    @Override
    public void onCartSuccess(CartBean cartBean) {
        List<CartBean.ResultBean> result = cartBean.getResult();
        cartAdapter = new CartAdapter(this, result);
        elv.setAdapter(cartAdapter);
//        for (int i = 0; i < result.size(); i++) {
//            elv.expandGroup(i);
//        }
        cartAdapter.notifyDataSetChanged();
    }

    @Override
    public void onCartError(Throwable throwable) {
        Toast.makeText(this, "请求失败" + throwable, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDingSuccess(DingBean dingBean) {

    }

    @Override
    public void onDingError(Throwable throwable) {

    }

    @Override
    public void onOrderSuccess(OrderBean orderBean) {

    }

    @Override
    public void onOrderError(Throwable throwable) {

    }
}
