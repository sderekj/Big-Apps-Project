package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.ApiResponse;
import nyc.c4q.dereksantos.bigappsproject.model.FarmerMarket;
import nyc.c4q.dereksantos.bigappsproject.viewholders.ConnectViewHolder;

/**
 * Created by SACC on 1/30/17.
 */
public class ConnectAdapter extends RecyclerView.Adapter<ConnectViewHolder> {
    private List<ApiResponse> connectList = new ArrayList<>();

    public ConnectAdapter(List<ApiResponse> list) {
        this.connectList = list;
    }

    @Override
    public ConnectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ConnectViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ConnectViewHolder holder, int position) {
        ApiResponse apiResponse = connectList.get(position);
        holder.bind(apiResponse);
    }

    @Override
    public int getItemCount() {
        return connectList.size();
    }
}
