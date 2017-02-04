package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.ResourceCard;

/**
 * Created by shannonalexander-navarro on 2/3/17.
 */

public class ResourceViewHolder extends RecyclerView.ViewHolder {
    private TextView resourceTitle;
    private TextView resourceDescription;
    private TextView resourceAddress;
    private TextView resourcePhone;

    public ResourceViewHolder(View itemView) {
        super(itemView);
        initViews();
    }

    public void bind(ResourceCard ourResources) {
        resourceTitle.setText(ourResources.getResourceTitle());
        resourceDescription.setText(ourResources.getResourceDescription());
        resourceAddress.setText(ourResources.getResourceAddress());
        resourcePhone.setText(ourResources.getResourcePhone());
    }

    private void initViews(){
        resourceTitle = (TextView) itemView.findViewById(R.id.resource_titleTV);
        resourceDescription = (TextView) itemView.findViewById(R.id.resource_descriptionTV);
        resourceAddress = (TextView) itemView.findViewById(R.id.resource_addyTV);
        resourcePhone = (TextView) itemView.findViewById(R.id.resource_phoneTV);
    }


}
