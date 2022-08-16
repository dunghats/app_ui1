package com.example.app_ui_kit.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_ui_kit.BuildConfig;
import com.example.app_ui_kit.adapter.DiscoverAdapter;
import com.example.app_ui_kit.DiscoverModel;
import com.example.app_ui_kit.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DiscoverFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DiscoverFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static final String FRAGMENT_TAG =
            BuildConfig.APPLICATION_ID + ".DISCOVER_FRAGMENT_TAG";

    private String mParam1;
    private String mParam2;

    public DiscoverFragment() {
        // Required empty public constructor
    }

    public static DiscoverFragment newInstance(String param1, String param2) {
        DiscoverFragment fragment = new DiscoverFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_discover, container, false);

        ArrayList<DiscoverModel> discoverModels = new ArrayList<>();
        discoverModels.add(new DiscoverModel(R.drawable.avt1, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));
        discoverModels.add(new DiscoverModel(R.drawable.avt2, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));
        discoverModels.add(new DiscoverModel(R.drawable.avt3, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));
        discoverModels.add(new DiscoverModel(R.drawable.avt4, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));
        discoverModels.add(new DiscoverModel(R.drawable.avt5, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));
        discoverModels.add(new DiscoverModel(R.drawable.avt6, "Soaring in the Destiny", "03:02PM", "Christina Munoz"));

        RecyclerView recyclerView = view.findViewById(R.id.rcView);
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(requireContext(), discoverModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(discoverAdapter);

        return view;
    }
}