package com.androidizate.clase5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Andres Oller.
 */
class BaseAdapter : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = 0

    inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}