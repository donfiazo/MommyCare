package com.ictyep.mommycare

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ictyep.mommycare.databinding.FragmentHomeBinding
import com.ictyep.mommycare.main.SliderAdapter
import com.ictyep.mommycare.main.SliderItem
import com.zhpan.indicator.enums.IndicatorSlideMode
import com.zhpan.indicator.enums.IndicatorStyle

class HomeFragment : Fragment () {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }


    private fun setupSlider() {
        binding.mainPager.adapter = SliderAdapter(getDummyItems())
        binding.indicatorView.apply {
            setSliderColor(Color.parseColor("#C4C4C4"), Color.parseColor("#26ABEA"))
            setSliderWidth(resources.getDimension(R.dimen.dp_10))
            setSliderHeight(resources.getDimension(R.dimen.dp_5))
            setSlideMode(IndicatorSlideMode.WORM)
            setIndicatorStyle(IndicatorStyle.CIRCLE)
            setupWithViewPager(binding.mainPager)
        }

        listOf(0, 1, 2).forEach {
            Handler(Looper.getMainLooper()).postDelayed({
                binding.mainPager.setCurrentItem(it, true)
            }, (it + 1) * 2000L)
        }
    }


    private fun getDummyItems(): List<SliderItem> {
        return listOf(
            SliderItem(
                "Dazzle In Our \nBeautiful Summer \nCollections",
                "Shop Now",
                R.drawable.mother_child
            ),
            SliderItem(
                "Quality is a Lifestyle \nAnd We Make It \nVery Affordable",
                "Shop Now",
                R.drawable.clothes
            ),
            SliderItem(
                "Lets Adore Their \nFeets With the Best \nProducts",
                "Shop Now",
                R.drawable.shoes
            )
        )
    }
}
