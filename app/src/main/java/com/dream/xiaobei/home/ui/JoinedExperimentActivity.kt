package com.dream.xiaobei.home.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.*
import com.dream.xiaobei.home.adapter.JoinExperimentAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity

class JoinedExperimentActivity : BaseActivity<UserViewModel, ActivityRvBinding>() {
    val mAdapter = JoinExperimentAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.titleBar.leftTitle = "参与过的实验"
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