package com.dream.xiaobei.user.ui

import android.os.Bundle
import com.dream.xiaobei.databinding.ActivityUserinfoConfirmBinding
import com.dream.xiaobei.databinding.ActivityWelcomeBinding
import com.dream.xiaobei.main.MainActivity
import com.dream.xiaobei.user.vm.UserViewModel
import com.tcl.base.common.ui.BaseActivity
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity

class UserConfirmActivity : BaseActivity<UserViewModel,ActivityUserinfoConfirmBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        mBinding.avatarIv.ktClick {
            ktStartActivity(UserEdtActivity::class)
        }
        mBinding.goToIv.ktClick {
            ktStartActivity(MainActivity::class)
        }
    }

    override fun initData() {
    }

    override fun initDataOnResume() {
    }
}