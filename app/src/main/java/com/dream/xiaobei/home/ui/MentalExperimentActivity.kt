package com.dream.xiaobei.home.ui

import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.ActivityIdentifyBinding
import com.dream.xiaobei.databinding.ActivityMentalExperimentBinding
import com.dream.xiaobei.databinding.ActivityUserinfoConfirmBinding
import com.dream.xiaobei.databinding.ActivityWelcomeBinding
import com.dream.xiaobei.home.adapter.MentalExperimentAdapter
import com.dream.xiaobei.home.adapter.TimeSelectAdapter
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class MentalExperimentActivity : BaseActivity<UserViewModel, ActivityMentalExperimentBinding>() {
    val mMentalAdapter = MentalExperimentAdapter()
    val mTimeSelectAdapter = TimeSelectAdapter()
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.mentalRv.apply {
            adapter = mMentalAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }
        mBinding.timeChoseRv.apply {
            adapter = mTimeSelectAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }
    }

    override fun initData() {
        val dataList = mutableListOf<EmptyBean>()
        repeat(3) {
            dataList.add(EmptyBean())
        }
        mMentalAdapter.setList(dataList)
        mTimeSelectAdapter.setList(dataList)
    }

    override fun initDataOnResume() {
    }
}