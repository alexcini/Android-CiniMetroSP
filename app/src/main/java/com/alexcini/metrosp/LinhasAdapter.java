package com.alexcini.metrosp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 26/06/2017.
 */

public class LinhasAdapter extends RecyclerView.Adapter {

    private List<linha> linhas;
    private AdapterView.OnItemClickListener;


    public LinhasAdapter(List androids) {
        this.linhas = linhas;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.android_row,
                parent, false);

        return new AndroidViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listener.onItemClick(linhas.get(position));
        }
    });
    }

    @Override
    public void onBindViewHolder(ViewHolderLinhas holder, int position) {

        holder.tvcorLinha.setText(androids.get(position).getcor());
        holder.tvnumLinha.setText(androids.get(position).getVersao());

        Picasso.with(holder.itemView.getContext())
                .load(androids.get(position).getUrlImagem())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return androids.size();
    }

    public class AndroidViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivLogo;
        public TextView tvCor;
        public TextView tvNum;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ivLogo = (ImageView) itemView.findViewById(R.id.imgLinha);
            tvCor = (TextView) itemView.findViewById(R.id.corLinha);
            tvNum = (TextView) itemView.findViewById(R.id.numLinha);
        }
    }

}
