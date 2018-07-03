package digitalhouse.com.exercicio1_23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceptorActivity extends AppCompatActivity {

    private static final String RECEBENDO_NOME = null;
    private static final String RECEBENDO_SOBRENOME = null;
    private static final String RECEBENDO_IDADE = null;

    TextView nome;
    TextView sobrenome;
    TextView idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        nome = (TextView) findViewById(R.id.recepNome);
        idade = (TextView) findViewById(R.id.recepIdade);
        sobrenome = (TextView) findViewById(R.id.recepSobrenome);

        Intent outroIntent = getIntent();

        Bundle outroBundle = outroIntent.getExtras();

        String nomeRecebido = outroBundle.getString("RECEBENDO_NOME");
        nome.setText(nomeRecebido);

        String sobrenomeRecebido = outroBundle.getString("RECEBENDO_SOBRENOME");
        sobrenome.setText(sobrenomeRecebido);

        String idadeRecebida = outroBundle.getString("RECEBENDO_IDADE");
        idade.setText(idadeRecebida);

    }
}
