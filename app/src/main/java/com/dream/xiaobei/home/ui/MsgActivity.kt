package com.dream.xiaobei.home.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityRvBinding
import com.dream.xiaobei.home.adapter.MsgAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class MsgActivity : BaseActivity<UserViewModel, ActivityRvBinding>() {
    val mMsgAdapter = MsgAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.commonRv.apply {
            adapter = mMsgAdapter
            addItemDecoration(WaterFallItemDecoration(0, 60))
        }
    }

    override fun initData() {
        val dataList = mutableListOf<EmptyBean>()
        repeat(6) {
            dataList.add(EmptyBean())
        }
        mMsgAdapter.setList(dataList)
    }

    override fun initDataOnResume() {
    }
}