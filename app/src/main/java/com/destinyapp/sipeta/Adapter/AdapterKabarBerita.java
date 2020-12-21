package com.destinyapp.sipeta.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.destinyapp.sipeta.Method.Destiny;
import com.destinyapp.sipeta.Model.DataModel;
import com.destinyapp.sipeta.R;

import java.util.List;

public class AdapterKabarBerita extends RecyclerView.Adapter<AdapterKabarBerita.HolderData> {
    private List<DataModel> mList;
    private Context ctx;

    Boolean onClick=false;
    RecyclerView recyclerView;
    Destiny destiny;
    public AdapterKabarBerita(Context ctx, List<DataModel> mList){
        this.ctx = ctx;
        this.mList = mList;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_kabar_berita,viewGroup,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HolderData holderData, int posistion) {
        destiny = new Destiny();
        final DataModel dm = mList.get(posistion);
        holderData.Judul.setText(dm.getJudul_berita());
        holderData.Deskripsi.setText(destiny.SmallDescription(destiny.FilterTextToJava(dm.getIsi_berita())));
        holderData.web.loadData(dm.getIsi_berita(),"text/html","UTF-8");
        holderData.Tanggal.setText(destiny.MagicDateChange(dm.getCreated_at_berita()));
        Glide.with(ctx)
                .load(destiny.BASE_URL()+dm.getCover_berita())
                .into(holderData.Image);
        holderData.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(ctx, DetailKabarSekolahActivity.class);
//                i.putExtra("JUDUL", dm.getJudul_kabar());
//                i.putExtra("ISI",dm.getIsi_kabar());
//                i.putExtra("TANGGAL",dm.getCreated_at_kabar());
//                i.putExtra("GAMBAR", destiny.BASE_URL()+dm.getCover_kabar());
//                ctx.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class HolderData extends RecyclerView.ViewHolder{
        ImageView Image;
        TextView Judul,Deskripsi,Tanggal;
        WebView web;
        LinearLayout card;
        public HolderData(View v){
            super(v);
            Image = v.findViewById(R.id.ivGambar);
            Judul = v.findViewById(R.id.tvJudul);
            Deskripsi = v.findViewById(R.id.tvDeskripsi);
            Tanggal = v.findViewById(R.id.tvTanggal);
            web = v.findViewById(R.id.webDeskripsi);
            card = v.findViewById(R.id.LayoutCardView);
        }
    }
}


