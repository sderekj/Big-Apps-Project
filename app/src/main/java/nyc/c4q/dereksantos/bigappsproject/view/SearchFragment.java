package nyc.c4q.dereksantos.bigappsproject.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import nyc.c4q.dereksantos.bigappsproject.R;

/**
 * Created by akashaarcher on 2/2/17.
 */
public class SearchFragment extends Fragment {

    EditText searchBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        searchBox = (EditText) view.findViewById(R.id.search_fill_text);
        searchBox.setHint("Search");
        searchBox.setTextColor(Color.parseColor("#B8B8B8"));

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Search");

        return view;
    }
}
