package simple.recycler.ejemplo.com.ejemplorecyclersimple;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jose on 08/05/17.
 */

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {
    Context context;
    List<Persona> personaList;

    public  PersonaAdapter(Context context, List<Persona> personaList){
        this.context = context;
        this.personaList = personaList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(personaList.get(position).getNombre());
        holder.apellido.setText(personaList.get(position).getApellido());

    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView nombre,apellido;
        ImageView image;

        public ViewHolder(View item){
            super(item);
            cardView = (CardView) item.findViewById(R.id.cardview);
            nombre = (TextView) item.findViewById(R.id.nombre);
            apellido = (TextView) item.findViewById(R.id.apellido);
        }
    }
}
