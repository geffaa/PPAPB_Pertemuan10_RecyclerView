package com.example.ppapb_pertemuan10_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ppapb_pertemuan10_recyclerview.databinding.ItemStudentBinding

class StudentAdapter():
    RecyclerView.Adapter<StudentAdapter.ItemStudentViewHolder>() {

    inner class ItemStudentViewHolder(private val binding
    : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemStudentViewHolder {
        val binding = ItemStudentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemStudentViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return 5
    }

    override fun onBindViewHolder(holder: ItemStudentViewHolder, position: Int) {

    }
}