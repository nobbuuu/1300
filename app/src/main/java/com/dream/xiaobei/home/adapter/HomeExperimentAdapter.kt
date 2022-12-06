package com.dream.xiaobei.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.AllExperimentBean
import com.dream.xiaobei.bean.AllExperimentImgBean
import com.tcl.base.weiget.recylerview.GridSpacingItemDecoration
import com.tcl.base.weiget.recylerview.WaterFallItemDecoration

class HomeExperimentAdapter :
    BaseQuickAdapter<AllExperimentBean, BaseViewHolder>(R.layout.item_home_experiment) {
    override fun convert(holder: BaseViewHolder, item: AllExperimentBean) {
        when (holder.itemViewType) {
            1 -> {
                val imgRv = holder.getView<RecyclerView>(R.id.allRv)
                val imgAdapter = AllExperimentImgAdapter()
                imgRv.apply {
                    adapter = imgAdapter
                    layoutManager = GridLayoutManager(context,3)
                    addItemDecoration(GridSpacingItemDecoration(3,30, 0,false))
                }
                val imgData = mutableListOf<AllExperimentImgBean>(
                    AllExperimentImgBean("4", "消费决策", "¥5", R.mipmap.psychology),
                    AllExperimentImgBean("30", "认知实验", "¥15", R.mipmap.psychology),
                    AllExperimentImgBean("70", "情绪识别", "¥30", R.mipmap.icon_ava)
                )
                imgAdapter.setList(imgData)
            }
            2 -> {

            }
        }
    }

    override fun onCreateDefViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return createBaseViewHolder(
            parent,
            when (viewType) {
                1 -> R.layout.item_experiment_all
                2 -> R.layout.item_home_experiment
                else -> R.layout.item_home_experiment
            }
        )
    }

    override fun getDefItemViewType(position: Int): Int {
        return data[position].itemType
    }
}