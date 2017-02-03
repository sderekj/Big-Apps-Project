package nyc.c4q.dereksantos.bigappsproject.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.TipCard;

/**
 * Created by shannonalexander-navarro on 1/29/17.
 */

public class TipViewHolder extends RecyclerView.ViewHolder {

    private TextView tipTitleTV;
    private TextView factoidTV;

    public TipViewHolder(View itemView) {
        super(itemView);
        initViews();
    }

    public void bind(TipCard tipList) {
        //tipTitleTV.setText(tipList.getDidYou());
        factoidTV.setText(tipList.getFactoid());
    }

    private void initViews(){
        tipTitleTV = (TextView) itemView.findViewById(R.id.tip_title_tv);
        factoidTV = (TextView) itemView.findViewById(R.id.factoid_tv);
    }
}
