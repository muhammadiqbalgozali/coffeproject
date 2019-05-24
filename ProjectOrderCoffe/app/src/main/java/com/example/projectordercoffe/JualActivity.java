package com.example.projectordercoffe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class JualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual);

//        pendeklarasian variable Edittext pada layou jual
//        kopi
        final EditText etespresso = findViewById(R.id.et_espresso);
        final EditText etamericano = findViewById(R.id.et_americano);
        final EditText etpicollo = findViewById(R.id.et_picollo);
        final EditText etsinggleoriginal = findViewById(R.id.et_singgleorigin);
        final EditText etcappucino = findViewById(R.id.et_cappucino);
        final EditText etcafelate = findViewById(R.id.et_cafelate);
        final EditText etcaramellate = findViewById(R.id.et_caramellatte);
        final EditText ethazelnutlatte = findViewById(R.id.et_hazelnutlatte);

        // base choclate
        final EditText etchoclate = findViewById(R.id.et_choclate);
        final EditText etchoclatecaramel = findViewById(R.id.et_choclatecaramel);
        final EditText etchoclatehazelnut = findViewById(R.id.et_choclatehazelnut);
        final EditText etchoclatevanilla = findViewById(R.id.et_choclatevanilla);
        final EditText etchoclateavocado = findViewById(R.id.et_choclateavocado);

//        base smoothes
        final EditText etavocado = findViewById(R.id.avocado);
        final EditText etmanggo = findViewById(R.id.et_manggo);
        final EditText etstrawberry = findViewById(R.id.et_strawberry);

//        Base Tea
        final EditText ettea = findViewById(R.id.et_tea);
        final EditText etlemontea = findViewById(R.id.et_lemontea);
        final EditText etlycheetea = findViewById(R.id.et_lycheetea);
        final EditText etgreentealatte = findViewById(R.id.et_greentealatte);
        final EditText etthaitea = findViewById(R.id.et_thaitea);

//        Base soda
        final EditText etstrawberyMS = findViewById(R.id.strawberrymojitosquash);
        final EditText etmojitoLS = findViewById(R.id.et_mojitolimenadesquash);
        final EditText etmochaS = findViewById(R.id.et_mochasquash);
        final EditText etlimeS = findViewById(R.id.et_limesquash);


//        pendeklarasian variable TextView pada layou jual

//        tv_kopi
        final TextView tvespreso = findViewById(R.id.tv_espresso);
        final TextView tvamericano = findViewById(R.id.tv_americano);
        final TextView tvpicollo = findViewById(R.id.tv_picollo);
        final TextView tvsinggleoriginal = findViewById(R.id.tv_singgleorigin);
        final TextView tvcappucino = findViewById(R.id.tv_cappucino);
        final TextView tvcafelate = findViewById(R.id.tv_cafelate);
        final TextView tvcaramellate = findViewById(R.id.tv_caramellatte);
        final TextView tvhazelnutlatte = findViewById(R.id.tv_hazelnutlatte);
        final TextView tvtotal = findViewById(R.id.tv_total_harga);

        // tv_base chocolate
        final TextView tvchoclate = findViewById(R.id.tv_choclate);
        final TextView tvchoclatecaramel = findViewById(R.id.tv_choclatecaramel);
        final TextView tvchoclatehazelnut = findViewById(R.id.tv_choclatehazelnutlatte);
        final TextView tvchoclatevanilla = findViewById(R.id.tv_choclatevanilla);
        final TextView tvchoclateavocado = findViewById(R.id.tv_choclateavocado);

        //tv_base smoothes
        final TextView tvavocado = findViewById(R.id.tv_avocado);
        final TextView tvmanggo = findViewById(R.id.tv_manggo);
        final TextView tvstrawberry = findViewById(R.id.tv_strawberry);

        //tv_base Tea
        final TextView tvtea = findViewById(R.id.tv_tea);
        final TextView tvlemontea = findViewById(R.id.tv_lemontea);
        final TextView tvlycheetea = findViewById(R.id.tv_lycheetea);
        final TextView tvgreentealatte = findViewById(R.id.tv_greentealatte);
        final TextView tvtahitea = findViewById(R.id.tv_thaitea);

        //tv_base soda
        final TextView tvstrawberryMS = findViewById(R.id.tv_strawberrymojitosquash);
        final TextView tvMojitoLS = findViewById(R.id.tv__mojitolimenadesquash);
        final TextView tvmochaS = findViewById(R.id.tv_mochasquash);
        final TextView tvlimeS = findViewById(R.id.tv_limesquash);

        Button btnHitung = findViewById(R.id.btn_hitung);
        Button btnReset = findViewById(R.id.btn_reset);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //base kopi
        etespresso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etespresso.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvespreso.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 18000;
                int total = qty * harga;
                tvespreso.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etamericano.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etamericano.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvamericano.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 22000;
                int total = qty * harga;
                tvamericano.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etpicollo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

                String qytItem = etpicollo.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvpicollo.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 25000;
                int total = qty * harga;
                tvpicollo.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etsinggleoriginal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etsinggleoriginal.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvsinggleoriginal.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 26000;
                int total = qty * harga;
                tvsinggleoriginal.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etcappucino.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etcappucino.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvcappucino.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 25000;
                int total = qty * harga;
                tvcappucino.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etcafelate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etcafelate.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvcafelate.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvcafelate.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etcaramellate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etcaramellate.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvcaramellate.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvcaramellate.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        ethazelnutlatte.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = ethazelnutlatte.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvhazelnutlatte.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvhazelnutlatte.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // base chocolate
        etchoclate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etchoclate.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvchoclate.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvchoclate.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etchoclatecaramel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,  int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etchoclatecaramel.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvchoclatecaramel.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvchoclatecaramel.setText("Total : Rp. " + total + " ,-");
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etchoclatehazelnut.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,  int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etchoclatehazelnut.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvchoclatehazelnut.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvchoclatehazelnut.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etchoclatevanilla.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence,  int start, int before, int count) {
                String qytItem = etchoclatevanilla.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvchoclatevanilla.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvchoclatevanilla.setText("Total : Rp. " + total + " ,-");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etchoclateavocado.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence,  int start, int before, int count) {
                String qytItem = etchoclateavocado.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvchoclateavocado.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvchoclateavocado.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

//        Base Smoothes

        etavocado.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etavocado.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvavocado.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvavocado.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etmanggo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etmanggo.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvmanggo.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvmanggo.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etstrawberry.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etstrawberry.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvstrawberry.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvstrawberry.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        //Base Tea
        ettea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = ettea.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvtea.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvtea.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etlemontea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etlemontea.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvlemontea.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvlemontea.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etlycheetea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etlycheetea.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvlycheetea.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvlycheetea.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etgreentealatte.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etgreentealatte.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvgreentealatte.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvgreentealatte.setText("Total : Rp. " + total + " ,-");

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
etthaitea.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
        String qytItem = etthaitea.getText().toString().trim();

        int qty;

        try {
            qty = parseInt(qytItem);
        } catch (NumberFormatException ex) {
            tvtahitea.setText("Total : RP. 0 ,-");
            return;
        }
        int harga = 27000;
        int total = qty * harga;
        tvtahitea.setText("Total : Rp. " + total + " ,-");

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
});

//Base soda
        etstrawberyMS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etstrawberyMS.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvstrawberryMS.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvstrawberryMS.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etmojitoLS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etmojitoLS.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvMojitoLS.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvMojitoLS.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etmochaS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etmochaS.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvmochaS.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvmochaS.setText("Total : Rp. " + total + " ,-");



            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etlimeS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence,int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                String qytItem = etlimeS.getText().toString().trim();

                int qty;

                try {
                    qty = parseInt(qytItem);
                } catch (NumberFormatException ex) {
                    tvlimeS.setText("Total : RP. 0 ,-");
                    return;
                }
                int harga = 27000;
                int total = qty * harga;
                tvlimeS.setText("Total : Rp. " + total + " ,-");


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Base Kopi
                String valespresso = etespresso.getText().toString().trim();
                String valamericano = etamericano.getText().toString().trim();
                String valpicollo = etpicollo.getText().toString().trim();
                String valsinggleoriginal = etsinggleoriginal.getText().toString().trim();
                String valcappucino = etcappucino.getText().toString().trim();
                String valcafelate = etcafelate.getText().toString().trim();
                String valcaramellate = etcaramellate.getText().toString().trim();
                String valhazelnutlatte = ethazelnutlatte.getText().toString().trim();

//                Base Chocolate
                String valchoclate = etchoclate.getText().toString().trim();
                String valchoclatecaramel = etchoclatecaramel.getText().toString().trim();
                String valchoclatehazelnut = etchoclatehazelnut.getText().toString().trim();
                String valchoclatevanilla = etchoclatevanilla.getText().toString().trim();
                String valchoclateavocado = etchoclateavocado.getText().toString().trim();

//                Base Smoothes
                String valavocado = etavocado.getText().toString().trim();
                String valmanggo = etmanggo.getText().toString().trim();
                String valstrawberry = etstrawberry.getText().toString().trim();

//                Base Tea
                String valtea = ettea.getText().toString().trim();
                String vallemontea = etlemontea.getText().toString().trim();
                String vallycheetea = etlycheetea.getText().toString().trim();
                String valgreentealatte = etgreentealatte.getText().toString().trim();
                String valthaite = etthaitea.getText().toString().trim();

//                Base Soda
                String valstrawberryMS = etstrawberyMS.getText().toString().trim();
                String valmojitoLS = etmojitoLS.getText().toString().trim();
                String valmochaS = etmochaS.getText().toString().trim();
                String vallimeS = etlimeS.getText().toString().trim();

//                Base Kopi
                float nilaiespresso;
                try {
                    nilaiespresso = Float.parseFloat(valespresso);
                } catch (NumberFormatException ex) {
                    nilaiespresso = 0;
                }
                float nilaimericano;
                try {
                    nilaimericano = Float.parseFloat(valamericano);
                } catch (NumberFormatException ex) {
                    nilaimericano = 0;
                }
                float nilaipicollo;
                try {
                    nilaipicollo = Float.parseFloat(valpicollo);
                } catch (NumberFormatException ex) {
                    nilaipicollo = 0;
                }
                float nilaisinggleoriginal;
                try {
                    nilaisinggleoriginal = Float.parseFloat(valsinggleoriginal);
                } catch (NumberFormatException ex) {
                    nilaisinggleoriginal = 0;
                }
                float nilaicappucino;
                try {
                    nilaicappucino = Float.parseFloat(valcappucino);
                } catch (NumberFormatException ex) {
                    nilaicappucino = 0;
                }
                float nilaicafelate;
                try {
                    nilaicafelate = Float.parseFloat(valcafelate);
                } catch (NumberFormatException ex) {
                    nilaicafelate = 0;
                }
                float nilaicaramellate;
                try {
                    nilaicaramellate = Float.parseFloat(valcaramellate);
                } catch (NumberFormatException ex) {
                    nilaicaramellate = 0;
                }
                float nilaihazelnutlatte;
                try {
                    nilaihazelnutlatte = Float.parseFloat(valhazelnutlatte);
                } catch (NumberFormatException ex) {
                    nilaihazelnutlatte = 0;
                }

//                Base chocolate

                float nilaichoclate;
                try {
                    nilaichoclate = Float.parseFloat(valchoclate);
                } catch (NumberFormatException ex) {
                    nilaichoclate = 0;
                }
                float nilaichoclatecaramel;
                try {
                    nilaichoclatecaramel = Float.parseFloat(valchoclatecaramel);
                } catch (NumberFormatException ex) {
                    nilaichoclatecaramel = 0;
                }
                float nilaichoclatehazelnut;
                try {
                    nilaichoclatehazelnut = Float.parseFloat(valchoclatehazelnut);
                } catch (NumberFormatException ex) {
                    nilaichoclatehazelnut = 0;
                }
                float nilaichoclatevanilla;
                try {
                    nilaichoclatevanilla = Float.parseFloat(valchoclatevanilla);
                } catch (NumberFormatException ex) {
                    nilaichoclatevanilla = 0;
                }
                float nilaichoclateavocado;
                try {
                    nilaichoclateavocado = Float.parseFloat(valchoclateavocado);
                } catch (NumberFormatException ex) {
                    nilaichoclateavocado = 0;
                }

//                Base Smoothes
                float nilaiavocado;
                try {
                    nilaiavocado = Float.parseFloat(valavocado);
                } catch (NumberFormatException ex) {
                    nilaiavocado = 0;
                }
                float nilaimanggo;
                try {
                    nilaimanggo = Float.parseFloat(valmanggo);
                } catch (NumberFormatException ex) {
                    nilaimanggo = 0;
                }
                float nilaistrawberry;
                try {
                    nilaistrawberry = Float.parseFloat(valstrawberry);
                } catch (NumberFormatException ex) {
                    nilaistrawberry = 0;
                }

//                Base Tea
                float nilaitea;
                try {
                    nilaitea = Float.parseFloat(valchoclate);
                } catch (NumberFormatException ex) {
                    nilaitea = 0;
                }
                float nilailemontea;
                try {
                    nilailemontea = Float.parseFloat(valchoclatecaramel);
                } catch (NumberFormatException ex) {
                    nilailemontea = 0;
                }
                float nilailycheetea;
                try {
                    nilailycheetea = Float.parseFloat(valchoclatehazelnut);
                } catch (NumberFormatException ex) {
                    nilailycheetea = 0;
                }
                float nilaigreentealatte;
                try {
                    nilaigreentealatte = Float.parseFloat(valchoclatevanilla);
                } catch (NumberFormatException ex) {
                    nilaigreentealatte = 0;
                }
                float nilaithaitea;
                try {
                    nilaithaitea= Float.parseFloat(valchoclateavocado);
                } catch (NumberFormatException ex) {
                    nilaithaitea = 0;
                }

//                Base Soda
                float nilaistrawberryMS;
                try {
                    nilaistrawberryMS = Float.parseFloat(valchoclatecaramel);
                } catch (NumberFormatException ex) {
                    nilaistrawberryMS = 0;
                }
                float nilaimojitoLS;
                try {
                    nilaimojitoLS = Float.parseFloat(valchoclatehazelnut);
                } catch (NumberFormatException ex) {
                    nilaimojitoLS = 0;
                }
                float nilaimochaS;
                try {
                    nilaimochaS = Float.parseFloat(valchoclatevanilla);
                } catch (NumberFormatException ex) {
                    nilaimochaS = 0;
                }
                float nilailimeS;
                try {
                    nilailimeS= Float.parseFloat(valchoclateavocado);
                } catch (NumberFormatException ex) {
                    nilailimeS = 0;
                }

//                menentukan harga produk dengan tipe data integer

//                Base Kopi
                int hargaespreso = 18000;
                int hargaamericano = 22000;
                int hargapicollo = 25000;
                int hargasinggleoriginal = 26000;
                int hargacappucino = 25000;
                int hargacafelate = 27000;
                int hargacaramellate = 27000;
                int hargahazelnutlatte = 27000;

//                Base Choclate
                int hargachoclate = 29000;
                int hargachoclatecaramel = 33000;
                int hargachoclatehazelnut = 33000;
                int hargachoclatevanilla = 33000;
                int hargachoclateavocado = 33000;

                //Base Smoothes
                int hargaavocado = 25000;
                int hargamanggo = 25000;
                int hargastrawberry = 30000;

                //Base Tea
                int hargatea = 29000;
                int hargalemontea = 33000;
                int hargalycheetea = 33000;
                int hargagreentealatte = 33000;
                int hargathaitea = 33000;

//                Base Soda
                int hargastrawberryMS = 29000;
                int hargaMojitoLS = 33000;
                int hargamochaS = 33000;
                int hargalimeS = 33000;



//                membuat rumus sesuiai variable

//                Base Kopi
                float totalespreso = nilaiespresso * hargaespreso;
                float totalamericano = nilaimericano * hargaamericano;
                float totalpicollo = nilaipicollo * hargapicollo;
                float totalsinggleoriginal = nilaisinggleoriginal * hargasinggleoriginal;
                float totalcappucino = nilaicappucino * hargacappucino;
                float totalcafelate = nilaicafelate * hargacafelate;
                float totalcaramellate = nilaicaramellate * hargacaramellate;
                float totalhezelnutlatte = nilaihazelnutlatte * hargahazelnutlatte;

//                Base choclate
                float totalchoclate = nilaichoclate * hargachoclate;
                float totalchoclatecaramel = nilaichoclatecaramel * hargachoclatecaramel;
                float totalchoclatehazelnut = nilaichoclatehazelnut * hargachoclatehazelnut;
                float totalchoclatevanilla = nilaichoclatevanilla * hargachoclatevanilla;
                float totalchoclateavocado = nilaichoclateavocado * hargachoclateavocado;

//                Base Smoothes
                float totalvocado = nilaiavocado * hargaavocado;
                float totalmanggo = nilaimanggo * hargamanggo;
                float totalstrawberry = nilaistrawberry * hargastrawberry;

                //Base Tea
                float totaltea = nilaitea * hargatea;
                float totallemontea = nilailemontea * hargalemontea;
                float totallycheetea = nilailycheetea * hargalycheetea;
                float totalgreentealatte = nilaigreentealatte * hargagreentealatte;
                float totalthaitea = nilaithaitea * hargathaitea;

//                Base Soda
                float totalstrawberryMS = nilaistrawberryMS * hargastrawberryMS;
                float totalmojitoLS = nilaimojitoLS * hargaMojitoLS;
                float totalmochaS = nilaimochaS * hargamochaS;
                float totallimeS = nilailimeS * hargalimeS;

//                membuat rumus seluruh total
                float Total = totalespreso + totalamericano +totalpicollo + totalsinggleoriginal + totalcappucino +
                        totalcafelate + totalcaramellate + totalhezelnutlatte + totalchoclate + totalchoclatecaramel + totalchoclatehazelnut
                        + totalchoclatevanilla + totalchoclateavocado + totalvocado + totalmanggo + totalstrawberry
                        + totaltea + totallemontea + totallycheetea + totalgreentealatte + totalthaitea
                        + totalstrawberryMS + totalmojitoLS + totalmochaS + totallimeS;

//                total harga
                tvtotal.setText(Double.toString(Total));
            }
        });
    }
}
