package com.example.ftrani.listacontactos;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactoAdapter extends BaseAdapter{

    private List<Contacto> contactos;

    public ContactoAdapter(List<Contacto> contactos){
        this.contactos = contactos;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contactos.get(position).getTelefono();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        //optimizacion de reutilizacion de recursos
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_contacto,parent,false);
        }else{
            view = convertView;
        }

        Contacto contacto = (Contacto)getItem(position);

        TextView txtTelefono = (TextView) view.findViewById(R.id.txtTelefono);
        TextView txtNombre = (TextView) view.findViewById(R.id.txtNombre);
        TextView txtApellido = (TextView) view.findViewById(R.id.txtApellido);

        txtTelefono.setText(String.valueOf(contacto.getTelefono()));
        txtNombre.setText(contacto.getNombre());
        txtApellido.setText(contacto.getApellido());

        return view;
    }
}
