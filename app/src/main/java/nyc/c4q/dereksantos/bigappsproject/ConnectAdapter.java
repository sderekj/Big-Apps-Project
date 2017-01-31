package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SACC on 1/30/17.
 */
public class ConnectAdapter extends RecyclerView.Adapter<ConnectViewHolder> {
    private List<Question> connectList = new ArrayList<>();

    public ConnectAdapter(List<Question> list) {
        this.connectList = list;
    }

    @Override
    public ConnectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ConnectViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ConnectViewHolder holder, int position) {
        Question question = connectList.get(position);
        holder.bind(question);
    }

    @Override
    public int getItemCount() {
        return connectList.size();
    }
}
