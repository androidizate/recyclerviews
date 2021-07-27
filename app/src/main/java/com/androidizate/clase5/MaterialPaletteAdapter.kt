package com.androidizate.clase5

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidizate.clase5.MaterialPaletteAdapter.PaletteViewHolder
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by Andres Oller.
 */
// En este constructor recibimos la lista de colores y ademas quien sera el listener del onClick
// On this constructor we receive the list of colors and who is going to be listening clicks
class MaterialPaletteAdapter(
    private val colorList: List<Color>,
    private val recyclerViewOnItemClickListener: RecyclerViewOnItemClickListener
) : RecyclerView.Adapter<PaletteViewHolder?>() {

    interface RecyclerViewOnItemClickListener {
        fun onColorClick(color: Color)
    }

    // Aqui decidimos cual sera el layout de los items "R.layout.item"
    // Here we decide which is the item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaletteViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return PaletteViewHolder(row)
    }

    // Cada vez que se asocia una vista a la recycler se ejecuta este metodo, por lo tanto debemos actualizar la informacion del item
    // Everytime a view is attached to the reyclerview, this method is executed so we must update item info
    override fun onBindViewHolder(holder: PaletteViewHolder, position: Int) {
        holder.bind(colorList[position])
    }

    override fun getItemCount(): Int = colorList.size

    // This is the equivalent to the item.xml but using Kotlin code
    inner class PaletteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(color: Color) {
            itemView.titleTextView.text = color.name
            itemView.subtitleTextView.text = color.hex.toString()
            val gradientDrawable = itemView.circleView.background as GradientDrawable
            gradientDrawable.setColor(color.value)

            // Este OnClick es el que se ejecuta cuando hacemos click en un item de la lista y es el encargado de avisarle
            // al listener (la Activity en este caso) que hubo un click en el adapter.
            itemView.setOnClickListener {
                recyclerViewOnItemClickListener.onColorClick(color)
            }
        }
    }
}
