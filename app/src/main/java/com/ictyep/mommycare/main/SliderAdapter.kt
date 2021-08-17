package com.ictyep.mommycare.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.slider.Slider
import com.ictyep.mommycare.databinding.SliderItemBinding

class SliderAdapter(private val sliders: List<SliderItem>): RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    inner class SliderViewHolder(private val binding: SliderItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(sliderItem: SliderItem) {
            binding.itemBackground.setBackgroundResource(sliderItem.image)
            binding.itemDesc.text = sliderItem.desc
            binding.itemCallToAction.text = sliderItem.callToActionText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val binding = SliderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SliderViewHolder(binding)
    }
    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bind(sliders[position])
    }
    override fun getItemCount() = sliders.size
}