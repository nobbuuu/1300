package com.dream.xiaobei.home.ui

import android.R.attr.banner
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dream.xiaobei.R
import com.dream.xiaobei.databinding.FragmentHomeBinding
import com.dream.xiaobei.home.vm.AreaViewModel
import com.tcl.base.common.ui.BaseFragment
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator


/**
 *@author tiaozi
 *@date   2022/1/26
 *description 首页
 */
class HomeFragment : BaseFragment<AreaViewModel, FragmentHomeBinding> (){


    override fun initView(savedInstanceState: Bundle?) {

        val urlList = arrayListOf<String>("1","2","3")
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
    }
}