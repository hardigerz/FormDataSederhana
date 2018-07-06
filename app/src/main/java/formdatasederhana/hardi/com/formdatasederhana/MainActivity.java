package formdatasederhana.hardi.com.formdatasederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.inputnama)
    EditText inputNama;

    @BindView(R.id.inputnik)
    EditText inputNik;

    @BindView(R.id.inputumur)
    EditText inputUmur;

    @BindView(R.id.inputalamat)
    EditText inputAlamat;

    @BindView(R.id.inputinstitusi)
    EditText inputInstitusi;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;

    @BindView(R.id.hasil_nik)
    TextView hasilNik;

    @BindView(R.id.hasil_umur)
    TextView hasilUmur;

    @BindView(R.id.hasil_alamat)
    TextView hasilAlamat;

    @BindView(R.id.hasil_institusi)
    TextView hasilInstitusi;

    @BindView(R.id.simpan_button)
    Button simpanButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.simpan_button)
    public void btnClicked(Button button) {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String nik = inputNik.getText().toString();
        hasilNik.setText(nik);
        String umur = inputUmur.getText().toString();
        hasilUmur.setText(umur);
        String alamat = inputAlamat.getText().toString();
        hasilAlamat.setText(alamat);
        String institusi = inputInstitusi.getText().toString();
        hasilInstitusi.setText(institusi);

    }

    public void btnClicked(View view) {
    }
}
