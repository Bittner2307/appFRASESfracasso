package com.example.frasesfracasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String [] frases = {
            "NADA É TÃO RUIM QUE NÃO POSSA PIORAR !",
            "FRACASSO É UM ESTADO DE ESPÍRITO !",
            "NUNCA É TARDE PARA DESISTIR !",
            "SEU MAIOR PROBLEMA É VOCE MESMO !",
            "SABENDO QUE ERA IMPOSSIVEL ,FOI LÁ E SOUBE !",
            "CALMA. TUDO PASSA,NEM QUE SEJA EM CIMA DE VOCE !",
            "ACREDITE , VOCE NASCEU PARA CONQUISTAR VÁRIOS FRACASSOS !",
            "O CAMINHO É LONGO,MAS A DERROTA É CERTA !",
            "É SÓ UMA FASE RUIM ,LOGO VAI PIORAR !",
            "NUNCA FOI AZAR SEMPRE FOI A INCOMPETENCIA !",
            "SEJA PROTAGONISTA DO SEU FRACASSO !",
            "VOCE É MAIS FRACO DO QUE PENSA !",
            "NADA COMO UM DIA PIOR DO QUE O OUTRO ! ",
            "O UNIVERSO ESTÁ POUCO SE FODENDO PARA VOCE !",
            "O RECOMEÇO É OPORTUNIDADE PARA UM GRANDE FRACASSO !",
            "A VIDA TE DERRUBA HOJE PREPARANDO PARA QUEDA DE AMANHÃ !",
            "RECLAME MENOS, FRACASSE MAIS !",
            "DURMA 12 HORAS POR DIA ,ASSIM AS CHANCES DE FAZER MERDA CAEM PELA METADE!",
            "TUDO ESTÁ DANDO ERRADO  CONFORME O ESPERADO!",
            "NUNCA DEIXE QUE NINGUÉM DIGA QUE VOCE NÃO CONSEGUE,DIGA VOCE MESMO: EU NÃO CONSIGO ! ",
            "A VIDA É UM CONTO DE FALHAS!",
            "LUTE COMO NUNCA ,FALHE COMO SEMPRE !",
            "O IMPORTANTE NÃO É LUTAR SEMPRE,MAS PERDER TODOS OS DIAS !",
            "VOCE É FRACASSADO PULE DE UM PRÉDIO !",


        };
        int numero = new Random().nextInt(23);//gera randomicamente os numeros (frases)
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }
  public void  gerarSair(View view){
        finish();
  }
}