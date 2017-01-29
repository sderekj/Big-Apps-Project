package nyc.c4q.dereksantos.bigappsproject;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.model.QuestionIcon;

/**
 * Created by akashaarcher on 1/28/17.
 */

public class QuestionIconAdapter extends RecyclerView.Adapter  {

    private List<QuestionIcon> icons = Arrays.asList(
            new QuestionIcon(R.drawable.baby, "Baby"),
            new QuestionIcon(R.drawable.child, "Children"),
            new QuestionIcon(R.drawable.food, "Food & Nutrition"),
            new QuestionIcon(R.drawable.healthcare, "Healthcare"),
            new QuestionIcon(R.drawable.housing, "Housing"),
            new QuestionIcon(R.drawable.school, "Education"),
            new QuestionIcon(R.drawable.transport, "Transportation")
    );


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuestionIconViewHolder(parent);
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        QuestionIconViewHolder iconViewHolder = (QuestionIconViewHolder) holder;
        QuestionIcon iconList = icons.get(position);
        iconViewHolder.bind(iconList);
    }

//    private View.OnClickListener buildThumbnailClickListener(Picture thumbnail) {
//        if (thumbnail != null) {
//            return navigateToThumbnailViewListener(thumbnail.getDesignerName());
//        }
//        return defaultClickListener();
//    }
//
//    private View.OnClickListener navigateToThumbnailViewListener(final String designerName) {
//        return new View.OnClickListener(){
//            @Override
//            public void onClick (View view) {
//                Intent intent = new Intent(view.getContext(), DetailsTab.class);
//                intent.putExtra(DetailView.COSTUME_NAME, designerName);
//                view.getContext().startActivity(intent);
//            }
//        };
//    }
//
//    private View.OnClickListener defaultClickListener() {
//        return new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Do Nothing
//            }
//        };
//    }

    @Override
    public int getItemCount() {
        return icons.size();
    }



}
