package tinoco.castro.oswaldo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtEmail;
    private EditText txtTwitter;
    private EditText txtTel;
    private EditText txtFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtTwitter=(EditText)findViewById(R.id.txtTwitter);
        txtTel=(EditText)findViewById(R.id.txtTel);
        txtFecha=(EditText)findViewById(R.id.txtFecha);
    }

    public void agregar(View view) {
        Contactos contact = new Contactos(txtUsuario.getText().toString(), txtEmail.getText().toString(),
                txtTwitter.getText().toString(), txtTel.getText().toString(), txtFecha.getText().toString());
        Intent guardar = new Intent(this, MainActivity.class);
        guardar.putExtra("contact", contact);
        setResult(MainActivity.RESULT_OK, guardar);
        finish();
    }
}
