package com.dream.xiaobei.mine

import android.os.Bundle
import com.dream.xiaobei.databinding.FragmentMineBinding
import com.dream.xiaobei.home.ui.*
import com.dream.xiaobei.mine.vm.MineViewModel
import com.dream.xiaobei.user.ui.IdentifyActivity
import com.dream.xiaobei.user.ui.RatingStarsActivity
import com.dream.xiaobei.user.ui.UserInfoActivity
import com.tcl.base.common.ui.BaseFragment
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity

/**
 *@author tiaozi
 *@date   2022/1/26
 *description
 */
class MineFragment : BaseFragment<MineViewModel, FragmentMineBinding>() {
    override fun initView(savedInstanceState: Bundle?) {

        mBinding.msgIv.ktClick {
            ktStartActivity(MsgActivity::class)
        }
        mBinding.starRatingLay.ktClick {
            ktStartActivity(RatingStarsActivity::class)
        }
        mBinding.joinedExperiment.ktClick {
            ktStartActivity(JoinedExperimentActivity::class)
        }
        mBinding.publishedExperiment.ktClick {
            ktStartActivity(PublishedExperimentActivity::class)
        }
        mBinding.mainIdentifyLay.ktClick {
            ktStartActivity(IdentifyActivity::class)
        }
        mBinding.createExperiment.ktClick {
            ktStartActivity(CreateExperimentActivity::class)
        }
        mBinding.auditSubject.ktClick {
            ktStartActivity(SubjectListActivity::class)
        }
        mBinding.avatarIv.ktClick {
            ktStartActivity(UserInfoActivity::class)
        }
        mBinding.userInfoIv.ktClick {
            ktStartActivity(UserInfoActivity::class)
        }

    }
}