/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.brunnsdal_name), getString(R.string.brunnsdal_location), getString(R.string.brunnsdal_contact), R.drawable.brunnsdal));
        places.add(new Place(getString(R.string.pappa_name), getString(R.string.pappa_location), getString(R.string.pappa_contact), R.drawable.pappa));
        places.add(new Place(getString(R.string.halme_name), getString(R.string.halme_location), getString(R.string.halme_contact), R.drawable.halme));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}