package pro.niyaz.calcfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<String> {

    private int layoutResourceId;
    private String[] data;
    private Context context;

    public ContactAdapter(@NonNull Context context, int resource, String[] list) {
        super(context, resource, list);

        this.context = context;
        layoutResourceId = resource;
        data = list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(layoutResourceId, parent, false);
        TextView contact_name = convertView.findViewById(R.id.contact_name);
        TextView contact_number = convertView.findViewById(R.id.contact_number);
        contact_name.setText(data[position]);
        contact_number.setText(data[position]);

        return convertView;
    }
}
