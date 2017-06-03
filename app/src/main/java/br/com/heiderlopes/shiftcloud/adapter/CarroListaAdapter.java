package br.com.heiderlopes.shiftcloud.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.heiderlopes.shiftcloud.R;
import br.com.heiderlopes.shiftcloud.model.Carro;

public class CarroListaAdapter extends RecyclerView.Adapter<CarroViewHolder> {

    private List<Carro> carros;

    public CarroListaAdapter(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public CarroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutLinha = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.carro_item, parent, false);

        return new CarroViewHolder(layoutLinha, carros);
    }

    @Override
    public void onBindViewHolder(CarroViewHolder holder, int position) {
        Carro carro = carros.get(position);
        holder.tvModelo.setText(carro.getModelo());
        holder.tvFabricante.setText(carro.getFabricante());
    }

    @Override
    public int getItemCount() {
        return carros.size();
    }
}
