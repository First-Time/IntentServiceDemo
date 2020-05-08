package com.lyf.intentservice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()
    }

    private fun initListener() {
        btn_start_foo.setOnClickListener {
            MyIntentService.startActionFoo(this, "foo1", "foo1-1")
        }

        btn_start_baz.setOnClickListener {
            MyIntentService.startActionBaz(this, "baz1", "baz1-1")
        }

        btn_start_foo_3.setOnClickListener {
            MyIntentService.startActionFoo(this, "foo1", "foo1-1")
            MyIntentService.startActionFoo(this, "foo2", "foo2-1")
            MyIntentService.startActionFoo(this, "foo3", "foo3-1")
        }

        btn_start_baz_3.setOnClickListener {
            MyIntentService.startActionBaz(this, "baz1", "baz1-1")
            MyIntentService.startActionBaz(this, "baz2", "baz2-1")
            MyIntentService.startActionBaz(this, "baz3", "baz3-1")

        }

        btn_start_foo_baz_3.setOnClickListener {
            MyIntentService.startActionFoo(this, "foo1", "foo1-1")
            MyIntentService.startActionBaz(this, "baz1", "baz1-1")
            MyIntentService.startActionFoo(this, "foo2", "foo2-1")
            MyIntentService.startActionBaz(this, "baz2", "baz2-1")
            MyIntentService.startActionFoo(this, "foo3", "foo3-1")
            MyIntentService.startActionBaz(this, "baz3", "baz3-1")
        }
    }
}
