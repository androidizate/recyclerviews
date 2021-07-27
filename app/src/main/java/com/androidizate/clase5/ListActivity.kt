package com.androidizate.clase5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidizate.clase5.MaterialPaletteAdapter.RecyclerViewOnItemClickListener
import kotlinx.android.synthetic.main.activity_list.*
import java.util.*

/**
 * Created by Andres Oller.
 */
class ListActivity : AppCompatActivity(), RecyclerViewOnItemClickListener {
    private val colors: MutableList<Color> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setSupportActionBar(toolbar)

        // Inicializamos el array de colores
        initColors()

        // Instanciamos el recyclerView
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        // Le seteamos el layout al recycler
        recyclerView.layoutManager = linearLayoutManager

        // Agregamos el divisor entre cada uno de los items
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )

        // A la recycler le seteamos un adapter enviando como parametros el array de colores y la Activity como listener
        recyclerView.adapter = MaterialPaletteAdapter(colors, this)
    }

    private fun initColors() {
        colors.add(Color(getString(R.string.red), resources.getString(R.string.md_red_500), resources.getColor(R.color.md_red_500)))
        colors.add(Color(getString(R.string.pink), resources.getString(R.string.md_pink_500), resources.getColor(R.color.md_pink_500)))
        colors.add(Color(getString(R.string.purple), resources.getString(R.string.md_purple_500), resources.getColor(R.color.md_purple_500)))
        colors.add(Color(getString(R.string.deeppurple), resources.getString(R.string.md_deep_purple_500), resources.getColor(R.color.md_deep_purple_500)))
        colors.add(Color(getString(R.string.indigo), resources.getString(R.string.md_indigo_500), resources.getColor(R.color.md_indigo_500)))
        colors.add(Color(getString(R.string.blue), resources.getString(R.string.md_blue_500), resources.getColor(R.color.md_blue_500)))
        colors.add(Color(getString(R.string.lightblue), resources.getString(R.string.md_light_blue_500), resources.getColor(R.color.md_light_blue_500)))
        colors.add(Color(getString(R.string.cyan), resources.getString(R.string.md_cyan_500), resources.getColor(R.color.md_cyan_500)))
        colors.add(Color(getString(R.string.teal), resources.getString(R.string.md_teal_500), resources.getColor(R.color.md_teal_500)))
        colors.add(Color(getString(R.string.green), resources.getString(R.string.md_green_500), resources.getColor(R.color.md_green_500)))
        colors.add(Color(getString(R.string.lightgreen), resources.getString(R.string.md_light_green_500), resources.getColor(R.color.md_light_green_500)))
        colors.add(Color(getString(R.string.lime), resources.getString(R.string.md_lime_500), resources.getColor(R.color.md_lime_500)))
        colors.add(Color(getString(R.string.yellow), resources.getString(R.string.md_yellow_500), resources.getColor(R.color.md_yellow_500)))
        colors.add(Color(getString(R.string.amber), resources.getString(R.string.md_amber_500), resources.getColor(R.color.md_amber_500)))
        colors.add(Color(getString(R.string.orange), resources.getString(R.string.md_orange_500), resources.getColor(R.color.md_orange_500)))
        colors.add(Color(getString(R.string.deeporange), resources.getString(R.string.md_deep_orange_500), resources.getColor(R.color.md_deep_orange_500)))
        colors.add(Color(getString(R.string.brown), resources.getString(R.string.md_brown_500), resources.getColor(R.color.md_brown_500)))
        colors.add(Color(getString(R.string.grey), resources.getString(R.string.md_grey_500), resources.getColor(R.color.md_grey_500)))
        colors.add(Color(getString(R.string.bluegrey), resources.getString(R.string.md_blue_grey_500), resources.getColor(R.color.md_blue_grey_500)))
    }

    // Este metodo se ejecuta cuando en algun item hacemos click
    override fun onColorClick(color: Color) {
        toolbar.setBackgroundColor(color.value)
    }
}
