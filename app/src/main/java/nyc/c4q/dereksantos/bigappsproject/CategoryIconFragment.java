package nyc.c4q.dereksantos.bigappsproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by akashaarcher on 1/30/17.
 */

public class CategoryIconFragment extends Fragment {

    private RecyclerView iconRv;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category_icon, container, false);

        iconRv = (RecyclerView) view.findViewById(R.id.icon_rv);
        iconRv.setLayoutManager(new GridLayoutManager(getContext(),2));
        iconRv.setAdapter(new CategoryIconAdapter());

        return view;
    }

}
