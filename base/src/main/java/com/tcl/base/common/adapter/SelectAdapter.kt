package com.tcl.base.common.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.tcl.base.R

class SelectAdapter : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_dialog_select) {
    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.selectTv, item)
    }
}