package com.dream.xiaobei.message

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.bean.UserInfo
import com.dream.xiaobei.databinding.FragmentMessageBinding
import com.dream.xiaobei.message.vm.MessageViewModel
import com.dream.xiaobei.user.adapter.RunningAdapter
import com.tcl.base.common.ui.BaseFragment

/**
 *@author tiaozi
 *@date   2022/1/26
 *description
 */
class MessageFragment :BaseFragment<MessageViewModel,FragmentMessageBinding>() {
    override fun initView(savedInstanceState: Bundle?) {

        val mAdapter = RunningAdapter()
        val data = arrayListOf<EmptyBean>()
        repeat(3){
            data.add(EmptyBean())
        }
        mBinding.runningRv.apply {
            adapter = mAdapter
        }
        mAdapter.setList(data)

    }
}