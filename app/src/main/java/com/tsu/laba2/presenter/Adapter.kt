package com.tsu.laba2.presenter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tsu.laba2.R

class Adapter (private val dataSet: Array<String>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    open class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {}

    class ItemViewHolder(v: View) : ViewHolder(v) {
        val textView: TextView
        init {
            textView=v.findViewById((R.id.infoTask))
        }
    }

    class CategoryViewHolder(v: View) : ViewHolder(v) {
        val textView: TextView
        init {
            textView=v.findViewById(R.id.nameTask)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position%3==0) 1 else 0
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        when (viewType) {
            0 -> {
                val item = LayoutInflater.from(viewGroup.context).inflate(R.layout.recycler_view_of_todo_list, viewGroup, false)
                return ItemViewHolder(item)
            }
        }
        val item = LayoutInflater.from(viewGroup.context).inflate(R.layout.category, viewGroup, false)
        return CategoryViewHolder(item)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Log.d(TAG, "Element $position set.")

        if (viewHolder is ItemViewHolder)
        {
            viewHolder.textView.text = dataSet[position]
        }

        if (viewHolder is CategoryViewHolder)
        {
            viewHolder.textView.text = dataSet[position]
        }
    }

    override fun getItemCount() = dataSet.size

    companion object {
        private val TAG = "Adapter"
    }
}