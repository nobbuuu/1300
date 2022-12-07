package com.dream.xiaobei.home.ui

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.AllExperimentBean
import com.dream.xiaobei.databinding.FragmentHomeBinding
import com.dream.xiaobei.home.adapter.HomeExperimentAdapter
import com.dream.xiaobei.home.vm.HomeViewModel
import com.dream.xiaobei.user.ui.ExperimentInfoActivity
import com.tcl.base.common.ui.BaseFragment
import com.tcl.base.kt.ktClick
import com.tcl.base.kt.ktStartActivity
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator


/**
 *@author tiaozi
 *@date   2022/1/26
 *description 首页
 */
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    val mAdapter = HomeExperimentAdapter()
    override fun initView(savedInstanceState: Bundle?) {

        val urlList = arrayListOf("1", "2", "3")
        mBinding.banner.setAdapter(object : BannerImageAdapter<String>(urlList) {
            override fun onBindView(
                holder: BannerImageHolder,
                data: String,
                position: Int,
                size: Int
            ) {
                //图片加载自己实现
                Glide.with(holder.itemView)
                    .load(R.mipmap.dk_file_manager_banner)
                    .apply(RequestOptions.bitmapTransform(RoundedCorners(30)))
                    .into(holder.imageView)
            }
        })
            .addBannerLifecycleObserver(this) //添加生命周期观察者
            .setIndicator(CircleIndicator(requireContext()))
        mBinding.homeRv.apply {
            adapter = mAdapter
            addItemDecoration(WaterFallItemDecoration(0, 30))
        }

        mBinding.experimentIv.ktClick {
            findNavController().navigate(R.id.navigation_message)
        }

    }

    override fun initDataOnViewCreated() {
        super.initDataOnViewCreated()
        val data = mutableListOf<AllExperimentBean>(AllExperimentBean(1), AllExperimentBean(2))
        mAdapter.setList(data)

        mAdapter.setOnItemClickListener { adapter, view, position ->
            when (data[position].itemType) {
                1 -> {
                    ktStartActivity(MentalExperimentActivity::class)
                }
                2 -> {
                    ktStartActivity(ExperimentInfoActivity::class)
                }
            }
        }
    }
}