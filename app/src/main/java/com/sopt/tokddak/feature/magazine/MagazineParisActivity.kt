package com.sopt.tokddak.feature.magazine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sopt.tokddak.R
import kotlinx.android.synthetic.main.activity_magazine_paris.*

class MagazineParisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazine_paris)

        init()
    }

    fun init(){
        btn_back.bringToFront()
        btn_back.setOnClickListener {
            finish()
        }
    }
}
