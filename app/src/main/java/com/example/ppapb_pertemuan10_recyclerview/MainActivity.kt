package com.example.ppapb_pertemuan10_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppapb_pertemuan10_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapterStudent = StudentAdapter()
        with(binding){
            rvStudent.apply {
                adapter = adapterStudent
                layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@MainActivity)
            }
        }
    }
}