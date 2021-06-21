package com.example.lector_rss.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lector_rss.R;

import java.util.List;

public class NoticiaAdaptador extends RecyclerView.Adapter<NoticiaAdaptador.ViewHolder> {
    public List<Noticia> noticiaList;
    private Context context;

    public NoticiaAdaptador(List<Noticia> noticiaList, Context context){
        this.noticiaList=noticiaList;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombre.setText(noticiaList.get(position).getNombreNoticia());
        holder.txtFecha.setText(noticiaList.get(position).getFechaNoticia());
        holder.txtAutor.setText(noticiaList.get(position).getAutorNoticia());
        Glide.with(context)
                .load(noticiaList.get(position).getFoto())
                .centerCrop()
                .into(holder.imgFoto); //componente donde se mostrara la imagen

    }

    @Override
    public int getItemCount() {
        return noticiaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView txtNombre;
        private TextView txtFecha;
        private TextView txtAutor;



        public ViewHolder(@NonNull View  itemView){
            super(itemView);
            txtNombre = itemView.findViewById(R.id.NombreNoticiaText);
            txtFecha =itemView.findViewById(R.id.FechaText_CVD);
            txtAutor =itemView.findViewById(R.id.CreadorText_CVD);
            imgFoto = itemView.findViewById(R.id.ImageView_CVD);
        }
    }
}