package com.dream.xiaobei.user.ui

import android.os.Bundle
import com.dream.xiaobei.databinding.ActivityExperimentInfoBinding
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity

class ExperimentInfoActivity : BaseActivity<UserViewModel, ActivityExperimentInfoBinding>() {

    override fun initView(savedInstanceState: Bundle?) {
        initTitleBar(isWhileIcon = true)

    }

    override fun initData() {
    }

    override fun initDataOnResume() {
    }
}