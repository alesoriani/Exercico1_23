package digitalhouse.com.exercicio1_23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    EditText editNome;
    EditText editSobrenome;
    EditText editIdade;
    Button btEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        btEnviar = (Button) findViewById(R.id.btEnviar);
        editNome = (EditText) findViewById(R.id.editNome);
        editSobrenome = (EditText) findViewById(R.id.editSobrenome);
        editIdade = (EditText) findViewById(R.id.editIdade);

    }

    public void botaoPressionado(View v) {
        //Toast.makeText(this, "mensagem Qualquer", Toast.LENGTH_SHORT).show();
        Intent meuIntent = new Intent(SenderActivity.this, ReceptorActivity.class);

        String valorDoNome = editNome.getText().toString();
        String valorDoSobrenome = editSobrenome.getText().toString();
        String valorDaIdade = editIdade.getText().toString();

        Bundle meuBundle = new Bundle();

        meuBundle.putString("RECEBENDO_NOME", valorDoNome);
        meuBundle.putString("RECEBENDO_SOBRENOME", valorDoSobrenome);
        meuBundle.putString("RECEBENDO_IDADE", valorDaIdade);

        meuIntent.putExtras(meuBundle);

        startActivity(meuIntent);
    }
}