package com.faisalmirza.viewbindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.faisalmirza.viewbindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val colorList = listOf("#FF5733", "#C24D34", "#EDB4A8", "#F4E142", "#CEF442", "#42F47B", "#42F4E9", "#42CEF4", "#427BF4", "#9E42F4", "#E942F4", "#F442B9", "#F44247")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.tvHello.text = "Hello View Binding"

        setUpRecyclerView(binding)

        setContentView(binding.root)
    }

    private fun setUpRecyclerView(binding: ActivityMainBinding) {
        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        val mAdapter = RecyclerViewAdapter()
        mAdapter.addListItem(ArrayList(colorList))

        binding.recyclerView.adapter = mAdapter
    }
}
