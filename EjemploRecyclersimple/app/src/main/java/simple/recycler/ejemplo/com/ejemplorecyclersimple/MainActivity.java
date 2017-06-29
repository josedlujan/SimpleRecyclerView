package simple.recycler.ejemplo.com.ejemplorecyclersimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<Persona> personaList = new ArrayList<>();
    PersonaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new PersonaAdapter(this,personaList);
        recyclerView.setAdapter(adapter);
    }



    public void loadData(){
        personaList.add(new Persona("José","Luján"));
        personaList.add(new Persona("Alberto","Perez"));
        personaList.add(new Persona("Pedro","Lopez"));
        personaList.add(new Persona("Maria","Camacho"));
        personaList.add(new Persona("Luis","Jimenez"));
        personaList.add(new Persona("Jose","Alvarez"));
        personaList.add(new Persona("Damian","Gutierrez"));
        personaList.add(new Persona("Enrique","Sanchez"));
        personaList.add(new Persona("José","Luján"));
        personaList.add(new Persona("Alberto","Perez"));
        personaList.add(new Persona("Pedro","Lopez"));
        personaList.add(new Persona("Maria","Camacho"));
        personaList.add(new Persona("Luis","Jimenez"));
        personaList.add(new Persona("Jose","Alvarez"));
        personaList.add(new Persona("Damian","Gutierrez"));
        personaList.add(new Persona("Enrique","Sanchez"));
        personaList.add(new Persona("José","Luján"));
        personaList.add(new Persona("Alberto","Perez"));
        personaList.add(new Persona("Pedro","Lopez"));
        personaList.add(new Persona("Maria","Camacho"));
        personaList.add(new Persona("Luis","Jimenez"));
        personaList.add(new Persona("Jose","Alvarez"));
        personaList.add(new Persona("Damian","Gutierrez"));
        personaList.add(new Persona("Enrique","Sanchez"));



    }
}
