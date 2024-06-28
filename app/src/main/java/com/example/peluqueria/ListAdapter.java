package com.example.peluqueria;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.peluqueria.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListPeluquerias> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListPeluquerias>itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {return mData.size();}/*Da el tamaño de la lista*/

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder,final int position){
        holder.bindData(mData.get(position));
    }

    public void  setItems(List<ListPeluquerias> items) { mData = items;}
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombre, horario, servicio, calle , telefono, email;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            nombre = itemView.findViewById(R.id.nombreTextview);
            horario = itemView.findViewById(R.id.horariosTextView);
            servicio = itemView.findViewById(R.id.serviciosTextView);
            calle = itemView.findViewById(R.id.direccionTextView);
            telefono = itemView.findViewById(R.id.telefonoTextView);
            email = itemView.findViewById(R.id.correoTextView);
        }

        void bindData(final ListPeluquerias item){
            //iconImage.setImageBitmap();
            nombre.setText(item.getNombre());
            horario.setText(item.getHorario());
            servicio.setText(item.getServicio());
            calle.setText(item.getCalle());
            telefono.setText(item.getTelefono());
            email.setText(item.getEmail());
        }

    }


}
