package com.dream.xiaobei.user.ui

import android.os.Bundle
import com.dream.xiaobei.databinding.ActivityWelcomeBinding
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity

class WelComeActivity : BaseActivity<UserViewModel,ActivityWelcomeBinding>() {
    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun initData() {
        mBinding.experimenterLay.ktClick {
            ktStartActivity(IdentifyActivity::class)
        }
        mBinding.earMoney.ktClick {
            ktStartActivity(UserConfirmActivity::class)
        }
    }

    override fun initDataOnResume() {
    }
}