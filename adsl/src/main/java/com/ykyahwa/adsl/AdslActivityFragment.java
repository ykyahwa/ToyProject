package com.ykyahwa.adsl;

import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class AdslActivityFragment extends Fragment {

    private TextInputLayout textInputLayout;
    private EditText editText;
    private Button btTilError;
    private Button btEtError;
    public AdslActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_adsl, container, false);
        initialize(view);
        return view;
    }

    private void initialize(View view) {
        textInputLayout = (TextInputLayout) view.findViewById(R.id.til_input1);
        editText = (EditText) view.findViewById(R.id.et_input2);
        btTilError = (Button) view.findViewById(R.id.bt_til_error);
        btTilError.setOnClickListener(buttonClickListener);
        btEtError = (Button) view.findViewById(R.id.bt_et_error);
        btEtError.setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.bt_til_error) {
                textInputLayout.setError("ID TextInputLayout 에러");
            } else if (id == R.id.bt_et_error) {
                editText.setError("PW EditText 에러");
            }
        }
    };
}
