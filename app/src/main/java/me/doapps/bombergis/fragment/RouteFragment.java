package me.doapps.bombergis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import me.doapps.bombergis.R;

/**
 * Created by user on 27/05/2015.
 */
public class RouteFragment extends Fragment implements View.OnClickListener{
    private Button btnBscRuta;
    private InterfaceRoute interfaceRoute;
    private EditText txtOrigen;
    public RouteFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_route, container, false);
        btnBscRuta=(Button)view.findViewById(R.id.btnBscRuta);
        txtOrigen=(EditText)view.findViewById(R.id.txtOrigen);
        return view;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        btnBscRuta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        interfaceRoute.getRoute(txtOrigen.getText().toString());
    }

    public interface InterfaceRoute{
        void getRoute(String route);
    }
    public void setInterfaceRoute(InterfaceRoute interfaceRoute){
        this.interfaceRoute=interfaceRoute;
    }
}