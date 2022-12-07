package com.dream.xiaobei.user.ui

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityUserInfoBinding
import com.dream.xiaobei.user.adapter.ExperimentInfoAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class UserInfoActivity : BaseActivity<UserViewModel, ActivityUserInfoBinding>() {
    val mAdapter = ExperimentInfoAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.experimentRv.apply {
            layoutManager = GridLayoutManager(this@UserInfoActivity, 3)
            adapter = mAdapter
            addItemDecoration(WaterFallItemDecoration(30, 30))
        }

        mBinding.educationTv.ktClick {
            ktStartActivity(ExperimentRoomActivity::class)
        }
    }

    override fun initData() {
        val dataList = mutableListOf<EmptyBean>()
        repeat(6) {
            dataList.add(EmptyBean())
        }
        mAdapter.setList(dataList)
    }

    override fun initDataOnResume() {
    }
}