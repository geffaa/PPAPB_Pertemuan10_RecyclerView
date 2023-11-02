package com.example.ppapb_pertemuan10_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ppapb_pertemuan10_recyclerview.databinding.ItemStudentBinding

class StudentAdapter(private val listStudent: List<Student>):
    RecyclerView.Adapter<StudentAdapter.ItemStudentViewHolder>() {

    inner class ItemStudentViewHolder(private val binding
    : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Student){
            with(binding){
                hobbyTxt.text = data.hobby
                nameTxt.text = data.name
            }
        }
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
       return listStudent.size
    }

    override fun onBindViewHolder(holder: ItemStudentViewHolder, position: Int) {
        holder.bind(listStudent[position])
    }
}