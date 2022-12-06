package com.dream.xiaobei.home.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.dream.xiaobei.R
import com.dream.xiaobei.bean.AllExperimentImgBean

class AllExperimentImgAdapter :
    BaseQuickAdapter<AllExperimentImgBean, BaseViewHolder>(R.layout.item_experiment_all_img) {
    override fun convert(holder: BaseViewHolder, item: AllExperimentImgBean) {

        holder.setText(R.id.nameTv, item.name)
        holder.setText(R.id.topNameTv, item.topName)
        holder.setText(R.id.botNameTv, item.botName)
        holder.setImageResource(R.id.imgIv, item.img)

    }
}