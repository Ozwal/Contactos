package tinoco.castro.oswaldo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contactos> lista;
    private Contactos contact;
    private int r;
    private ListView listView;
    private TextView agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = new ArrayList<>();
        Contactos con = new Contactos("Oswaldo","ozwaldocastro@gmail.com","@ozwal12","4451313941","12/02/1998");
        agregar=(TextView)findViewById(R.id.txtAgrega);
        lista.add(con);
        agregar.setText(lista.size()+"");
        mostrar();
    }

    public void next(View view){
        Intent siguiente = new Intent(this, Activity2.class);
        startActivityForResult(siguiente, r);
    }

    public void mostrar(){
        listView = (ListView) findViewById(R.id.lstVista);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < lista.size(); i++){
            list.add(lista.get(i).mensaje());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        contact=(Contactos)data.getSerializableExtra("contact");
        lista.add(contact);
        agregar.setText(lista.size()+"");
        mostrar();
    }
}
