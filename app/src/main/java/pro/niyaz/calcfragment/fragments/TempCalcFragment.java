package pro.niyaz.calcfragment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import pro.niyaz.calcfragment.R;

public class TempCalcFragment extends Fragment {
    EditText edt_temp;
    Button btn_toCelsius;
    Button btn_toFahrenheit;

    TextView tv_result;

    public TempCalcFragment() {

        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edt_temp = getActivity().findViewById(R.id.edt_temp);
        tv_result = getActivity().findViewById(R.id.tv_result);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_temp_calc, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_toCelsius = getActivity().findViewById(R.id.btn_toCelsius);
        btn_toFahrenheit = getActivity().findViewById(R.id.btn_toFahrenheit);
        btn_toCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onToCelsiusClick();
            }
        });
        btn_toFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onToFahrenheitClick();
            }
        });
    }

    public void onToFahrenheitClick() {
        edt_temp = getActivity().findViewById(R.id.edt_temp);
        tv_result = getActivity().findViewById(R.id.tv_result);
        double c = Double.parseDouble(edt_temp.getText().toString());
        double f = c * 9 / 5 + 32;
        f = Math.floor(100 * f) / 100.0f;
        tv_result.setText("Celsius: " + c + " is\n" + f + " Fahranheit ");
    }

    public void onToCelsiusClick() {
        edt_temp = getActivity().findViewById(R.id.edt_temp);
        tv_result = getActivity().findViewById(R.id.tv_result);
        double f = Double.parseDouble(edt_temp.getText().toString());
        double c = ((f - 32) * 5 / 9);
        c = Math.floor(100 * c) / 100.0f;
        tv_result.setText("Fahranheit: " + f + " is\n" + c + " Celsius");
    }
}