package com.rasel.datacollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import net.cachapa.expandablelayout.ExpandableLayout;

public class MainActivity extends AppCompatActivity {

    ExpandableLayout expandable_Personnel, expandable_Headquarters, expandable_Industry,expandable_Installtion, expandable_PresentMachines, expandable_RequiredMachines ;

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        expandable_Personnel = findViewById(R.id.expandable_Personnel);
        expandable_Headquarters = findViewById(R.id.expandable_Headquarters);
        expandable_Industry = findViewById(R.id.expandable_Industry);
        expandable_Installtion = findViewById(R.id.expandable_Installtion);
        expandable_PresentMachines = findViewById(R.id.expandable_PresentMachines);
        expandable_RequiredMachines = findViewById(R.id.expandable_RequiredMachines);
    }

    public void btnClicked(View view) {

        switch (view.getId()) {
            case R.id.btnPersonnel:
                if (expandable_Personnel.isExpanded()) {
                    expandable_Personnel.collapse();
                } else {
                    expandable_Personnel.expand();

                    expandable_Headquarters.collapse();
                    expandable_Industry.collapse();
                    expandable_Installtion.collapse();
                    expandable_PresentMachines.collapse();
                    expandable_RequiredMachines.collapse();
                }
                break;
            case R.id.btnHeadquarters:
                if (expandable_Headquarters.isExpanded()) {
                    expandable_Headquarters.collapse();
                } else {
                    expandable_Headquarters.expand();

                    expandable_Personnel.collapse();
                    expandable_Industry.collapse();
                    expandable_Installtion.collapse();
                    expandable_PresentMachines.collapse();
                    expandable_RequiredMachines.collapse();
                }
                break;
            case R.id.btnIndustry:
                if (expandable_Industry.isExpanded()) {
                    expandable_Industry.collapse();
                } else {
                    expandable_Industry.expand();

                    expandable_Personnel.collapse();
                    expandable_Headquarters.collapse();
                    expandable_Installtion.collapse();
                    expandable_PresentMachines.collapse();
                    expandable_RequiredMachines.collapse();
                }
                break;
            case R.id.btnInstalltion:
                if (expandable_Installtion.isExpanded()) {
                    expandable_Installtion.collapse();
                } else {
                    expandable_Installtion.expand();

                    expandable_Personnel.collapse();
                    expandable_Headquarters.collapse();
                    expandable_Industry.collapse();
                    expandable_PresentMachines.collapse();
                    expandable_RequiredMachines.collapse();
                }
                break;
            case R.id.btnPresentMachines:
                if (expandable_PresentMachines.isExpanded()) {
                    expandable_PresentMachines.collapse();
                } else {
                    expandable_PresentMachines.expand();

                    expandable_Personnel.collapse();
                    expandable_Headquarters.collapse();
                    expandable_Industry.collapse();
                    expandable_Installtion.collapse();
                    expandable_RequiredMachines.collapse();
                }
                break;
            case R.id.btnRequiredMachines:
                if (expandable_RequiredMachines.isExpanded()) {
                    expandable_RequiredMachines.collapse();
                } else {
                    expandable_RequiredMachines.expand();

                    expandable_Personnel.collapse();
                    expandable_Headquarters.collapse();
                    expandable_Industry.collapse();
                    expandable_Installtion.collapse();
                    expandable_PresentMachines.collapse();
                }
                break;

        }

    }

   /* public void btnClicked(View view) {

        switch (view.getId()) {
            case R.id.btnPersonnel:
                if (expandable_Personnel.isExpanded()) {
                    expandable_Personnel.collapse();
                } else {
                    expandable_Personnel.expand();
                }
                break;
            case R.id.btnHeadquarters:
                if (expandable_Headquarters.isExpanded()) {
                    expandable_Headquarters.collapse();
                } else {
                    expandable_Headquarters.expand();
                }
                break;
            case R.id.btnIndustry:
                if (expandable_Industry.isExpanded()) {
                    expandable_Industry.collapse();
                } else {
                    expandable_Industry.expand();
                }
                break;
            case R.id.btnInstalltion:
                if (expandable_Installtion.isExpanded()) {
                    expandable_Installtion.collapse();
                } else {
                    expandable_Installtion.expand();
                }
                break;
            case R.id.btnPresentMachines:
                if (expandable_PresentMachines.isExpanded()) {
                    expandable_PresentMachines.collapse();
                } else {
                    expandable_PresentMachines.expand();
                }
                break;
            case R.id.btnRequiredMachines:
                if (expandable_RequiredMachines.isExpanded()) {
                    expandable_RequiredMachines.collapse();
                } else {
                    expandable_RequiredMachines.expand();
                }
                break;

        }

    } */

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

    }
}
