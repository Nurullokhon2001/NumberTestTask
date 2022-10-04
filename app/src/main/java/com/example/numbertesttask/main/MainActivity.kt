package com.example.numbertesttask.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.numbertesttask.R
import com.example.numbertesttask.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity(), ShowFragment {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            show(NumbersFragment(), false)

    }

    override fun show(fragment: Fragment) {
        show(fragment, true)
    }

    private fun show(fragment: Fragment, add: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        val container = R.id.container
        if (add) transaction.add(container, fragment).addToBackStack(fragment.javaClass.simpleName)
        else transaction.replace(container, fragment)
        transaction.commit()

    }
}

interface ShowFragment {
    fun show(fragment: Fragment)

    class Base : ShowFragment {
        override fun show(fragment: Fragment) = Unit
    }
}