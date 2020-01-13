package com.airbnb.lottie.samples.demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.samples.R
import kotlinx.android.synthetic.main.activity_demo.*

/**
 * Desc:测试点赞
 * <p>
 * Date: 2020-01-13
 * Copyright: Copyright (c) 2010-2019
 * Updater:
 * Update Time:
 * Update Comments:
 *
 * @Author: zhengxiaobin
 */
class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        initView()
    }

    private fun initView() {
        this.wishListIcon.setOnClickListener {
            it.isActivated = !it.isActivated
            setActivated(it as LottieAnimationView)
        }

        this.icon_zan.setOnClickListener {
            it.isActivated = !it.isActivated
            setActivated(it as LottieAnimationView)
        }

        this.icon_heart.progress = 1f
        this.icon_heart.isActivated = true
        this.icon_heart.setOnClickListener {
            it.isActivated = !it.isActivated
            setActivated(it as LottieAnimationView)
        }
    }

    fun setActivated(view: LottieAnimationView) {
        view.speed = if (view.isActivated) 1f else -2f
        view.progress = 0f
        view.playAnimation()
    }

    fun onButton(view: View) {
        this.animationView.setAnimation("HamburgerArrow.json")
        animationView.playAnimation()

    }

}
