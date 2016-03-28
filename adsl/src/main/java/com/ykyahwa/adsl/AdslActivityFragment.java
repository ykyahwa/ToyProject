package com.ykyahwa.adsl;

import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class AdslActivityFragment extends Fragment {

    @Bind(R.id.til_input1)  TextInputLayout textInputLayout;
    @Bind(R.id.et_input2)  EditText editText;
    @Bind(R.id.bt_til_error)  Button btTilError;
    @Bind(R.id.bt_et_error)  Button btEtError;
    public AdslActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_adsl, container, false);

        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick({R.id.bt_til_error,R.id.bt_et_error})  void click(View v) {
        int id = v.getId();
        if (id == R.id.bt_til_error) {
            textInputLayout.setError("ID TextInputLayout 에러");
        } else if (id == R.id.bt_et_error) {
            editText.setError("PW EditText 에러");
        }
    }
}
