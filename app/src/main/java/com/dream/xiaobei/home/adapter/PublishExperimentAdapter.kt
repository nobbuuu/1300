package com.dream.xiaobei.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.EmptyBean
import com.dream.xiaobei.user.ui.ExperimentInfoActivity
import com.tcl.base.kt.ktStartActivity

class PublishExperimentAdapter :
    BaseQuickAdapter<EmptyBean, BaseViewHolder>(R.layout.item_experiment_first) {
    override fun convert(holder: BaseViewHolder, item: EmptyBean) {

        val secondAdapter = PublishSecondAdapter()
        holder.getView<RecyclerView>(R.id.secondRv).apply {
            adapter = secondAdapter
        }
        val secondList = mutableListOf<EmptyBean>()
        repeat(2) {
            secondList.add(EmptyBean())
        }
        secondAdapter.setList(secondList)
        secondAdapter.setOnItemClickListener { adapter, view, position ->
            context.ktStartActivity(ExperimentInfoActivity::class)
        }
    }
}