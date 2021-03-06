package com.example.quedo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTask extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.edittask, container, false);

        Button btnEdit = (Button)rootView.findViewById(R.id.button);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.suc_toast, container, false);
                Toast toast = new Toast(EditTask.this.getActivity());
                toast.setGravity(Gravity.FILL, 0, 0);
                toast.setView(layout); //inflated view
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });

        return rootView;
    }

}