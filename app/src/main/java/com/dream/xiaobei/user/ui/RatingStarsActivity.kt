package com.dream.xiaobei.user.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityRatingStarsBinding
import com.dream.xiaobei.home.adapter.RatingHisAdapter
import com.dream.xiaobei.home.ui.RatingInfoActivity
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.kt.ktStartActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class RatingStarsActivity : BaseActivity<UserViewModel, ActivityRatingStarsBinding>() {
    val mAdapter = RatingHisAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.ratingRv.apply {
            adapter = mAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }
    }

    override fun initData() {

        val dataList = mutableListOf<EmptyBean>()
        repeat(6) {
            dataList.add(EmptyBean())
        }
        mAdapter.setList(dataList)
        mAdapter.setOnItemClickListener { adapter, view, position ->
            ktStartActivity(RatingInfoActivity::class)
        }
    }

    override fun initDataOnResume() {
    }
}