package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SACC on 1/30/17.
 */
public class ConnectViewHolder extends RecyclerView.ViewHolder {
    private final TextView titleTextView;
    private final TextView descriptionTextView;

    public ConnectViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.connect_title_tv);
        descriptionTextView = (TextView) itemView.findViewById(R.id.connect_description_tv);
    }

    public static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.connect_viewholder, parent, false);
    }

    public void bind(Question question) {
        titleTextView.setText(question.getTitle());
        descriptionTextView.setText(question.getDescription());
    }
}
