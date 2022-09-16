package pro.niyaz.calcfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import pro.niyaz.calcfragment.fragments.ContactListFragment;
import pro.niyaz.calcfragment.fragments.SimpleListFragment;
import pro.niyaz.calcfragment.fragments.TempCalcFragment;

public class MainActivity extends AppCompatActivity {
    Button btn_TempCalc;
    Button btn_SimpleListCalc;
    Button btn_Contacts;
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
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, tempCalcFragment);
        fragmentTransaction.commit();
    }

    public void onSimpleListClick(View view) {
        SimpleListFragment simpleListFragment = new SimpleListFragment();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, simpleListFragment);
        fragmentTransaction.commit();
    }

    public void onContactsClick(View view) {
        ContactListFragment contactListFragment = new ContactListFragment();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_Calcs, contactListFragment);
        fragmentTransaction.commit();
    }
}