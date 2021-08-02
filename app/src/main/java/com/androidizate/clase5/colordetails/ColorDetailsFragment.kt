package com.androidizate.clase5.colordetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.androidizate.clase5.Color
import com.androidizate.clase5.ColorFragmentsListener
import com.androidizate.clase5.R
import com.androidizate.clase5.databinding.FragmentColorDetailsBinding
import kotlinx.android.synthetic.main.fragment_color_details.*

private const val ARG_COLOR = "color"

class ColorDetailsFragment : Fragment() {
    private lateinit var binding: FragmentColorDetailsBinding
    private var color: Color? = null
    private lateinit var listener: ColorFragmentsListener

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
        binding = FragmentColorDetailsBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            listener.navigateBack()
        }
        Toast.makeText(requireContext(), color?.name, Toast.LENGTH_SHORT).show()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as ColorFragmentsListener
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
