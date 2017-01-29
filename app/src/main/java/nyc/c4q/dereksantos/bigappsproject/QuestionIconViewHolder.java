package nyc.c4q.dereksantos.bigappsproject;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.dereksantos.bigappsproject.model.QuestionIcon;

/**
 * Created by akashaarcher on 1/28/17.
 */

public class QuestionIconViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    private final ImageView iconPic;
    private final TextView iconName;


    public QuestionIconViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        iconPic = (ImageView) view.findViewById(R.id.icon_img);
        iconName = (TextView) view.findViewById(R.id.icon_label);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.icon_layout, parent, false);
    }

    public void bind(QuestionIcon icon) {
        iconName.setText(icon.getTitle());
        Integer resource = icon.getImageResource();
        Picasso.with(view.getContext())
                .load(resource)
                .resize(96, 96)
                .into(iconPic);

        iconPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TabActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }

//
//    public void setOnClickListener(View.OnClickListener clickListener) {
//        view.setOnClickListener(clickListener);
//    }


}
