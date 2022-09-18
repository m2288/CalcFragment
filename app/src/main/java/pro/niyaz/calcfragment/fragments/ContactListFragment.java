package pro.niyaz.calcfragment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import pro.niyaz.calcfragment.ContactAdapter;
import pro.niyaz.calcfragment.R;

public class ContactListFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView = getActivity().findViewById(R.id.lv_c_list);
        String[] contacts = getResources().getStringArray(R.array.contact_names);
        ContactAdapter contactAdapter = new ContactAdapter(getActivity(), R.layout.list_contact_layout, contacts);
        listView.setAdapter(contactAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] contact_list = getResources().getStringArray(R.array.contact_names);
                //Toast.makeText(MainActivity.this, "" + (position+1) + ": " + contact_list[position], Toast.LENGTH_SHORT).show();
                System.out.println(position + 1 + ": " + contact_list[position]);
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_list, container, false);
    }
}