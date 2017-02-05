package nyc.c4q.dereksantos.bigappsproject.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.dereksantos.bigappsproject.R;
import nyc.c4q.dereksantos.bigappsproject.adapters.ResourceAdapter;
import nyc.c4q.dereksantos.bigappsproject.adapters.TipAdapter;
import nyc.c4q.dereksantos.bigappsproject.model.ResourceCard;
import nyc.c4q.dereksantos.bigappsproject.model.TipCard;

/**
 * Created by shannonalexander-navarro on 1/28/17.
 */

public class ResourcesFragment extends Fragment {
    private int page;
    private String title;
    private static String INT_TAG = "zero";
    private static String TITLE_TAG = "rFrag";
    private RecyclerView tipRV;
    private TipAdapter tipAdapter;
    List<TipCard> tipCards = new ArrayList<>();
    private CardView cardView;
    private RecyclerView resourceRV;
    private ResourceAdapter resourceAdapter;
    List<ResourceCard> resourceCards = new ArrayList<>();

    public static Fragment newInstance(int page, String title) {
        ResourcesFragment resourcesFrag = new ResourcesFragment();
        Bundle bundleArgs = new Bundle();
        bundleArgs.putInt(INT_TAG, page);
        bundleArgs.putString(TITLE_TAG, title);
        resourcesFrag.setArguments(bundleArgs);
        return resourcesFrag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(INT_TAG, 0);
        title = getArguments().getString(TITLE_TAG);
        addTips();
        addResources();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resource_fragment, container, false);
        tipRV = (RecyclerView) view.findViewById(R.id.tip_rv);
        tipRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        tipAdapter = new TipAdapter(tipCards);
        tipRV.setAdapter(tipAdapter);
        cardView = (CardView) view.findViewById(R.id.tip_card);
        cardView.setPreventCornerOverlap(false);

        resourceRV = (RecyclerView) view.findViewById(R.id.resource_rv);
        resourceRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        resourceAdapter = new ResourceAdapter(resourceCards);
        resourceRV.setAdapter(resourceAdapter);


        return view;
    }

    //    Get a subway app for your phone
//    https://play.google.com/store/apps/details?id=com.thetransitapp.droid&hl=en
//    The Staten Island Ferry is free!
//    On an escalator, stand on the right, walk on the left
//    Half priced metro cards are available for Senior Citizens (age 65 and older) and customers with qualifying disabilities
//    Appointments are required for ID NYC cards.
//            http://www1.nyc.gov/site/idnyc/card/make-an-appointment.page
//            1 Comment Collapse
//    Tip list
    private void addTips() {
        tipCards.add(new TipCard("the Staten Island Ferry is free! And you can get a great view of the Statue of Liberty from it."));
        tipCards.add(new TipCard("the cost of a fare for public transportation is $2.75, with that you get 1 free transfer good for 2hours"));
        tipCards.add(new TipCard("children under 44\" ride free on public transportation" ));
        tipCards.add(new TipCard("half priced metro cards are available for Senior Citizens (age 65 or older) and those with qualifying disabilities"));
    }

    private void addResources(){
        resourceCards.add(new ResourceCard(
                "ID NYC",
                "Free, government issued IDs for New Yorkers age 14 and up regardless of immigration status." +
                        "See website on how to make an appointment.",
                "N/A",
                "http://www1.nyc.gov/site/idnyc/card/make-an-appointment.page"
        ));

        resourceCards.add(new ResourceCard(
                "NYC School Calendar",
                "Keep up to date with your child's school schedule, including upcoming vacation days",
                "N/A",
                "http://schools.nyc.gov/Calendar/default.htm"
        ));
        resourceCards.add(new ResourceCard(
                "MTA Trip Planner",
                "Use the MTA's trip planner to help figure out how to get where you need to go.",
                "N/A",
                "http://tripplanner.mta.info/MyTrip/ui_web/customplanner/TripPlanner.aspx"
        ));
    }
}
