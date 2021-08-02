package com.androidizate.clase5.colors

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.androidizate.clase5.Color
import com.androidizate.clase5.ColorFragmentsListener
import com.androidizate.clase5.R
import com.androidizate.clase5.databinding.FragmentColorsBinding
import java.util.*

class ColorsFragment : Fragment() {

    private lateinit var binding: FragmentColorsBinding
    private val colors: MutableList<Color> = ArrayList()
    private lateinit var listener: ColorFragmentsListener

    // We decide which is going to be our Layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentColorsBinding.inflate(layoutInflater)
        return binding.root
    }

    // UI is ready to be used
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)

        // We initialize color array
        initColors()

        // We instantiate the recyclerView
        val recyclerView = binding.recyclerView

        // We add the item divider decoration between each item
        recyclerView.addItemDecoration(
            DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL)
        )

        // val adapter = MaterialPaletteAdapter(this)

        val adapter = MaterialPaletteAdapter {
            listener.navigateToColorDetails(it)
        }

        // We set a MaterialPaletteAdapter to the recyclerView, sending as parameters the colors and Activity
        recyclerView.adapter = adapter
        adapter.addItems(colors)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as ColorFragmentsListener
    }

    private fun initColors() {
        colors.add(
            Color(
                getString(R.string.red),
                resources.getString(R.string.md_red_500),
                resources.getColor(R.color.md_red_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.pink),
                resources.getString(R.string.md_pink_500),
                resources.getColor(R.color.md_pink_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.purple),
                resources.getString(R.string.md_purple_500),
                resources.getColor(R.color.md_purple_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.deeppurple),
                resources.getString(R.string.md_deep_purple_500),
                resources.getColor(R.color.md_deep_purple_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.indigo),
                resources.getString(R.string.md_indigo_500),
                resources.getColor(R.color.md_indigo_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.blue),
                resources.getString(R.string.md_blue_500),
                resources.getColor(R.color.md_blue_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.lightblue),
                resources.getString(R.string.md_light_blue_500),
                resources.getColor(R.color.md_light_blue_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.cyan),
                resources.getString(R.string.md_cyan_500),
                resources.getColor(R.color.md_cyan_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.teal),
                resources.getString(R.string.md_teal_500),
                resources.getColor(R.color.md_teal_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.green),
                resources.getString(R.string.md_green_500),
                resources.getColor(R.color.md_green_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.lightgreen),
                resources.getString(R.string.md_light_green_500),
                resources.getColor(R.color.md_light_green_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.lime),
                resources.getString(R.string.md_lime_500),
                resources.getColor(R.color.md_lime_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.yellow),
                resources.getString(R.string.md_yellow_500),
                resources.getColor(R.color.md_yellow_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.amber),
                resources.getString(R.string.md_amber_500),
                resources.getColor(R.color.md_amber_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.orange),
                resources.getString(R.string.md_orange_500),
                resources.getColor(R.color.md_orange_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.deeporange),
                resources.getString(R.string.md_deep_orange_500),
                resources.getColor(R.color.md_deep_orange_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.brown),
                resources.getString(R.string.md_brown_500),
                resources.getColor(R.color.md_brown_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.grey),
                resources.getString(R.string.md_grey_500),
                resources.getColor(R.color.md_grey_500)
            )
        )
        colors.add(
            Color(
                getString(R.string.bluegrey),
                resources.getString(R.string.md_blue_grey_500),
                resources.getColor(R.color.md_blue_grey_500)
            )
        )
    }
}
