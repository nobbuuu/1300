package com.dream.xiaobei.home.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityRvBinding
import com.dream.xiaobei.home.adapter.SubjectAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class SubjectListActivity : BaseActivity<UserViewModel, ActivityRvBinding>() {
    val mAdapter = SubjectAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.commonRv.apply {
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
    }

    override fun initDataOnResume() {
    }
}