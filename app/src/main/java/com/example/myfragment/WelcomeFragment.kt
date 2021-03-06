package com.example.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_welcome, container, false)

        val buttonNext = v.findViewById<View>(R.id.buttonNext)

        buttonNext.setOnClickListener(){
            val profileFg = ProfileFragment()

            activity!!.supportFragmentManager.beginTransaction().apply{
                replace(R.id.mainFrame, profileFg)
                addToBackStack(null)
                commit()
            }
        }

        return v
    }

}