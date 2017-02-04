package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.ResourceCard;
import nyc.c4q.dereksantos.bigappsproject.viewholders.ResourceViewHolder;

/**
 * Created by shannonalexander-navarro on 2/3/17.
 */

public class ResourceAdapter extends RecyclerView.Adapter {

    List<ResourceCard> resourceList = new ArrayList<>();

    public ResourceAdapter(List<ResourceCard> resourceCards) {
        this.resourceList = resourceCards;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.resource_item, parent,false);
        return new ResourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ResourceViewHolder resourceViewHolder = (ResourceViewHolder) holder;
        ResourceCard ourResources = resourceList.get(position);
        resourceViewHolder.bind(ourResources);
    }

    @Override
    public int getItemCount() {
        return resourceList.size();
    }
}
