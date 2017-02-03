package nyc.c4q.dereksantos.bigappsproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.model.CategoryIcon;
import nyc.c4q.dereksantos.bigappsproject.viewholders.CategoryIconViewHolder;

/**
 * Created by akashaarcher on 1/28/17.
 */

public class CategoryIconAdapter extends RecyclerView.Adapter  {

    private List<CategoryIcon> icons = Arrays.asList(
            new CategoryIcon(R.drawable.baby, "Baby"),
            new CategoryIcon(R.drawable.child, "Children"),
            new CategoryIcon(R.drawable.legal, "Legal Help"),
            new CategoryIcon(R.drawable.food, "Food & Nutrition"),
            new CategoryIcon(R.drawable.healthcare, "Healthcare"),
            new CategoryIcon(R.drawable.housing, "Housing"),
            new CategoryIcon(R.drawable.school, "Education"),
            new CategoryIcon(R.drawable.transport, "Transportation")
    );


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryIconViewHolder(parent);
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CategoryIconViewHolder iconViewHolder = (CategoryIconViewHolder) holder;
        CategoryIcon iconList = icons.get(position);
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
