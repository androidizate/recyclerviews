package com.androidizate.clase5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andres Oller.
 */
public class ListActivity extends AppCompatActivity implements MaterialPaletteAdapter.RecyclerViewOnItemClickListener {

    private List<Color> colors = new ArrayList<>();
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Inicializamos el array de colores
        initColors();

        //Instanciamos el recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        
        //A la recycler le seteamos un adapter enviando como parametros el array de colores y la Activity como listener
        recyclerView.setAdapter(new MaterialPaletteAdapter(colors, this));
        
        //Le seteamos el layout al recycler
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Agregamos el divisor entre cada uno de los items
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(),
                ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation()));
    }

    private void initColors() {
        colors.add(new Color(getString(R.string.red), getResources().getString(R.string.md_red_500), getResources().getColor(R.color.md_red_500)));
        colors.add(new Color(getString(R.string.pink), getResources().getString(R.string.md_pink_500), getResources().getColor(R.color.md_pink_500)));
        colors.add(new Color(getString(R.string.purple), getResources().getString(R.string.md_purple_500), getResources().getColor(R.color.md_purple_500)));
        colors.add(new Color(getString(R.string.deeppurple), getResources().getString(R.string.md_deep_purple_500), getResources().getColor(R.color.md_deep_purple_500)));
        colors.add(new Color(getString(R.string.indigo), getResources().getString(R.string.md_indigo_500), getResources().getColor(R.color.md_indigo_500)));
        colors.add(new Color(getString(R.string.blue), getResources().getString(R.string.md_blue_500), getResources().getColor(R.color.md_blue_500)));
        colors.add(new Color(getString(R.string.lightblue), getResources().getString(R.string.md_light_blue_500), getResources().getColor(R.color.md_light_blue_500)));
        colors.add(new Color(getString(R.string.cyan), getResources().getString(R.string.md_cyan_500), getResources().getColor(R.color.md_cyan_500)));
        colors.add(new Color(getString(R.string.teal), getResources().getString(R.string.md_teal_500), getResources().getColor(R.color.md_teal_500)));
        colors.add(new Color(getString(R.string.green), getResources().getString(R.string.md_green_500), getResources().getColor(R.color.md_green_500)));
        colors.add(new Color(getString(R.string.lightgreen), getResources().getString(R.string.md_light_green_500), getResources().getColor(R.color.md_light_green_500)));
        colors.add(new Color(getString(R.string.lime), getResources().getString(R.string.md_lime_500), getResources().getColor(R.color.md_lime_500)));
        colors.add(new Color(getString(R.string.yellow), getResources().getString(R.string.md_yellow_500), getResources().getColor(R.color.md_yellow_500)));
        colors.add(new Color(getString(R.string.amber), getResources().getString(R.string.md_amber_500), getResources().getColor(R.color.md_amber_500)));
        colors.add(new Color(getString(R.string.orange), getResources().getString(R.string.md_orange_500), getResources().getColor(R.color.md_orange_500)));
        colors.add(new Color(getString(R.string.deeporange), getResources().getString(R.string.md_deep_orange_500), getResources().getColor(R.color.md_deep_orange_500)));
        colors.add(new Color(getString(R.string.brown), getResources().getString(R.string.md_brown_500), getResources().getColor(R.color.md_brown_500)));
        colors.add(new Color(getString(R.string.grey), getResources().getString(R.string.md_grey_500), getResources().getColor(R.color.md_grey_500)));
        colors.add(new Color(getString(R.string.bluegrey), getResources().getString(R.string.md_blue_grey_500), getResources().getColor(R.color.md_blue_grey_500)));
    }

    // Este metodo se ejecuta cuando en algun item hacemos click
    @Override
    public void onColorClick(View v, int position) {
        toolbar.setBackgroundColor(colors.get(position).getValue());
    }
}
