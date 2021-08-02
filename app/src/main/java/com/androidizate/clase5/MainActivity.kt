package com.androidizate.clase5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.androidizate.clase5.colordetails.ColorDetailsFragment
import com.androidizate.clase5.colors.ColorsFragment
import com.androidizate.clase5.databinding.ActivityListBinding

interface ColorFragmentsListener {
    fun navigateToColorDetails(color: Color)
}

class MainActivity : AppCompatActivity(), ColorFragmentsListener {

    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateToFragment(ColorsFragment())
    }

    private fun navigateToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, fragment)
            .commit()
    }

    override fun navigateToColorDetails(color: Color) {
        navigateToFragment(ColorDetailsFragment.newInstance(color))
    }
}
