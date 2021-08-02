package com.androidizate.clase5.colordetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.androidizate.clase5.Color
import com.androidizate.clase5.R

private const val ARG_COLOR = "color"

class ColorDetailsFragment : Fragment() {
    private var color: Color? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            color = it.getParcelable(ARG_COLOR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), color?.name, Toast.LENGTH_SHORT).show()
    }

    companion object {
        @JvmStatic
        fun newInstance(color: Color) =
            ColorDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_COLOR, color)
                }
            }
    }
}
