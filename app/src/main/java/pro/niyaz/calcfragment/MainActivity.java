package pro.niyaz.calcfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import pro.niyaz.calcfragment.fragments.AreaCalcFragment;
import pro.niyaz.calcfragment.fragments.DistanceCalcFragment;
import pro.niyaz.calcfragment.fragments.TempCalcFragment;

public class MainActivity extends AppCompatActivity {
    Button btn_TempCalc;
    Button btn_DistCalc;
    Button btn_AreaCalc;
    FrameLayout fl_Calcs;


    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTempCalcClick(View view) {
        TempCalcFragment tempCalcFragment = new TempCalcFragment();
        System.out.println("onTempCalcClick");
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, tempCalcFragment);
        fragmentTransaction.commit();
    }

    public void onDistCalcClick(View view) {
        DistanceCalcFragment distanceCalcFragment = new DistanceCalcFragment();
        System.out.println("onDistCalcClick");
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, distanceCalcFragment);
        fragmentTransaction.commit();
    }

    public void onAreaCalcClick(View view) {
        AreaCalcFragment areaCalcFragment = new AreaCalcFragment();
        System.out.println("onAreaCalcClick");
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, areaCalcFragment);
        fragmentTransaction.commit();
    }
}