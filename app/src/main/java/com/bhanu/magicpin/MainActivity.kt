package com.bhanu.magicpin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.Subscribe

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next.setOnClickListener { startActivity(Intent(this, FirstActivity::class.java)) }
    }

    @Subscribe(sticky = true)
    override fun onMessageEvent(event: MessageEvent){

        when(event.type){
            EventType.UPDATE ->{
                (event.item as? String)?.let { name.text = it }
            }
        }
    }
}
