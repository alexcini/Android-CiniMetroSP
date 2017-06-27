package com.alexcini.metrosp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by logonrm on 26/06/2017.
 */

public class ViewHolderLinhas extends RecyclerView.ViewHolder {

    public ImageView tvcorLinha;
    public TextView tvnumLinha;
    public TextView ivimgLinha;

    public ViewHolderLinhas(View itemView) {
        super(itemView);
        tvcorLinha = (ImageView) itemView.findViewById(R.id.tvcorLinha);
        tvnumLinha = (TextView) itemView.findViewById(R.id.tvnumLinha);
        ivimgLinha = (TextView) itemView.findViewById(R.id.ivimgLinha);
    }
}
