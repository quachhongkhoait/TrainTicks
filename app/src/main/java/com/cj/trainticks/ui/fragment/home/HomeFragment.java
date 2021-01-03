package com.cj.trainticks.ui.fragment.home;

import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;

import android.view.View;
import android.widget.TextView;

import com.cj.trainticks.R;
import com.uits.baseproject.base.BaseFragment;
import com.uits.baseproject.utils.DateTimeUtil;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HomeFragment extends BaseFragment {

    private HomeViewModel mViewModel;
    private TextView mDaysToGo;
    private Calendar getDate;
    private DatePickerDialog mDateDialog;
    private SimpleDateFormat mSDF = new SimpleDateFormat("dd/MM/yyyy");

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public int getLayoutId() {
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        return R.layout.home_fragment;
    }

    @Override
    public void onViewCreated(@NotNull View view) {
        mDaysToGo = view.findViewById(R.id.mDaysToGo);
        onClick();
    }

    @SuppressLint("SetTextI18n")
    private void onClick() {
        mDaysToGo.setOnClickListener(v -> {
            getDate = Calendar.getInstance();
            mDateDialog = new DatePickerDialog(getActivity(),
                    android.R.style.Theme_Holo_Light_Dialog_MinWidth, (view, year, month, dayOfMonth) -> {
                Calendar selectDate = Calendar.getInstance();
                selectDate.set(Calendar.YEAR, year);
                selectDate.set(Calendar.MONTH, month);
                selectDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                mDaysToGo.setText(mSDF.format(selectDate.getTime()));
            },
                    getDate.get(Calendar.YEAR),
                    getDate.get(Calendar.MONTH),
                    getDate.get(Calendar.DAY_OF_MONTH));
            mDateDialog.show();
        });
    }
}