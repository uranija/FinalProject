package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.udacity.gradle.jokes.Joker;
import com.udacity.gradle.jokesource.JokeSource;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);




        TextView textView = (TextView) root.findViewById(R.id.text_view);
        Joker myJoker = new Joker();
        textView.setText(myJoker.getJoke());

        TextView textView2 = (TextView) root.findViewById(R.id.text_view2);
        JokeSource myJokeSource = new JokeSource();
        textView2.setText(myJokeSource.getJoke());

        return root;

    }
}
