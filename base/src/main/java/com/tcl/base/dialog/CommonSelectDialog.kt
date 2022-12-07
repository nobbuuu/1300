package com.tcl.base.dialog

import android.content.Context
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.tcl.base.common.adapter.SelectAdapter
import com.tcl.base.databinding.DialogBaseSelectBinding

class CommonSelectDialog(
    context: Context,
    val data: MutableList<String>,
    val block: ((String) -> Unit)? = null
) :
    BaseBindingDialog<DialogBaseSelectBinding>(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mSelectAdapter = SelectAdapter()
        mBinding.selectRv.apply {
            adapter = mSelectAdapter
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
        }
        mSelectAdapter.setList(data)
        mSelectAdapter.setOnItemClickListener { adapter, view, position ->
            dismiss()
            block?.invoke(data[position])
        }
    }
}