package com.bhanu.magicpin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_first.name
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editText.setText(DataHolder.name)
        button.setOnClickListener {
            DataHolder.name = editText.text.toString()
            EventBus.getDefault().postSticky(MessageEvent(EventType.UPDATE, DataHolder.name))
            onBackPressed()
        }
    }

    @Subscribe
    override fun onMessageEvent(event: MessageEvent){

        when(event.type){
            EventType.UPDATE ->{
            }
        }
    }
}
