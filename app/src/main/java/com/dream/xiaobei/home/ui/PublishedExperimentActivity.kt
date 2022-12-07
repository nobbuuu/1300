package com.dream.xiaobei.home.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityRvBinding
import com.dream.xiaobei.home.adapter.PublishExperimentAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity

class PublishedExperimentActivity : BaseActivity<UserViewModel, ActivityRvBinding>() {
    val mAdapter = PublishExperimentAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.titleBar.leftTitle = "发布过的实验"
        mBinding.commonRv.apply {
            adapter = mAdapter
        }
    }

    override fun initData() {
        val dataList = mutableListOf<EmptyBean>()
        repeat(2) {
            dataList.add(EmptyBean())
        }
        mAdapter.setList(dataList)
    }

    override fun initDataOnResume() {
    }
}