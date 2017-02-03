package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.TipCard;
import nyc.c4q.dereksantos.bigappsproject.viewholders.TipViewHolder;

/**
 * Created by shannonalexander-navarro on 1/29/17.
 */

public class TipAdapter extends RecyclerView.Adapter {

    List<TipCard> tips = new ArrayList<>();

    public TipAdapter(List<TipCard> tips) {
        this.tips = tips;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tip_card_item, parent, false);
        return new TipViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        TipViewHolder tipViewHolder = (TipViewHolder) holder;
        TipCard tipList = tips.get(position);
        tipViewHolder.bind(tipList);
    }

    @Override
    public int getItemCount() {
        return tips.size();
    }
}
