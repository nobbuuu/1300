package com.dream.xiaobei.dialog

import android.content.Context
import android.os.Bundle
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.databinding.LayoutMentalExperimentBinding
import com.dream.xiaobei.home.adapter.MentalExperimentAdapter
import com.dream.xiaobei.home.adapter.TimeSelectAdapter
import com.tcl.base.dialog.BaseBindingDialog
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class MentalExperimentDialog(context: Context) :
    BaseBindingDialog<LayoutMentalExperimentBinding>(context) {
    val mMentalAdapter = MentalExperimentAdapter()
    val mTimeSelectAdapter = TimeSelectAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.mentalRv.apply {
            adapter = mMentalAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }
        mBinding.timeChoseRv.apply {
            adapter = mTimeSelectAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }

        val dataList = mutableListOf<EmptyBean>()
        repeat(3) {
            dataList.add(EmptyBean())
        }
        mMentalAdapter.setList(dataList)
        mTimeSelectAdapter.setList(dataList)
    }
}