package org.aplusstudios.com.treehouserecylerviewclass;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import org.aplusstudios.com.treehouserecylerviewclass.adapters.VisaRecyclerViewAdapter;
import org.aplusstudios.com.treehouserecylerviewclass.databinding.ActivityMainBinding;
import org.aplusstudios.com.treehouserecylerviewclass.viewModel.Visa;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    VisaRecyclerViewAdapter visaRecyclerViewAdapter;
    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);

        visaRecyclerViewAdapter = new VisaRecyclerViewAdapter(getApplicationContext(), getVisaData());
        activityMainBinding.hourlyListRecylerView.setAdapter(visaRecyclerViewAdapter);
        activityMainBinding.hourlyListRecylerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private List<Visa> getVisaData() {
        return Arrays.asList(
                new Visa("Mr.Vin", "Credit"),
                new Visa("Mr.Mike", "Debit"),
                new Visa("Mr.Joel", "Debit"),
                new Visa("Mr.Win", "Credit"),
                new Visa("Mr.Mike", "Debit"),
                new Visa("Mr.Joel", "Debit"),
                new Visa("Mr.Win", "Credit"),
                new Visa("Mr.Mark", "Gold"),
                new Visa("Mr.Mike", "Debit"),
                new Visa("Mr.Joel", "Debit"),
                new Visa("Mr.Win", "Credit"),
                new Visa("Mr.Mark", "Gold"),
                new Visa("Mr.Mike", "Debit"),
                new Visa("Mr.Joel", "Debit"),
                new Visa("Mr.Win", "Credit"),
                new Visa("Mr.Mark", "Gold"),
                new Visa("Mr.Mark", "Gold"));
    }
}
