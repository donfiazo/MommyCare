package com.ictyep.mommycare

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.ictyep.mommycare.databinding.ActivityMainBinding
import com.ictyep.mommycare.main.SliderAdapter
import com.ictyep.mommycare.main.SliderItem
import com.zhpan.indicator.enums.IndicatorSlideMode
import com.zhpan.indicator.enums.IndicatorStyle

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)
        binding.navView.setupWithNavController(navController)
        setSupportActionBar(binding.myToolbar)

        setupActionBarWithNavController(navController, appBarConfiguration)


        binding.myToolbar.setupWithNavController(navController, appBarConfiguration)


    }

//    private fun setupSlider() {
//        binding.mainLayout.mainPager.adapter = SliderAdapter(getDummyItems())
//        binding.mainLayout.indicatorView.apply {
//            setSliderColor(Color.parseColor("#C4C4C4"), Color.parseColor("#26ABEA"))
//            setSliderWidth(resources.getDimension(R.dimen.dp_10))
//            setSliderHeight(resources.getDimension(R.dimen.dp_5))
//            setSlideMode(IndicatorSlideMode.WORM)
//            setIndicatorStyle(IndicatorStyle.CIRCLE)
//            setupWithViewPager(binding.mainLayout.mainPager)
//        }
//
//        listOf(0,1,2).forEach {
//            Handler(Looper.getMainLooper()).postDelayed({
//                binding.mainLayout.mainPager.setCurrentItem(it, true)
//            }, (it + 1)*2000L)
//        }
//    }
//
//
//    private fun getDummyItems(): List<SliderItem> {
//        return listOf(
//            SliderItem(
//                "Dazzle In Our \nBeautiful Summer \nCollections",
//                "Shop Now",
//                R.drawable.mother_child
//            ),
//            SliderItem(
//                "Quality is a Lifestyle \nAnd We Make It \nVery Affordable",
//                "Shop Now",
//                R.drawable.clothes
//            ),
//            SliderItem(
//                "Lets Adore Their \nFeets With the Best \nProducts",
//                "Shop Now",
//                R.drawable.shoes
//            )
//        )
    }


