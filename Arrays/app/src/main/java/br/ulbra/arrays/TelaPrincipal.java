package br.ulbra.arrays;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;
    public TelaPrincipal(MainActivity mainActivity){
        this.act = mainActivity;
    }

    public void CarregarTela(){
        act.setContentView(R.layout.activity_main);
        btcadastrar_usuario = (Button) act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = (Button) act.findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });

        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_listagem.CarregarTela();
            }
        });

    }

    public void setTela_cadastro(TelaCadastroUsuario tela_cadastro){
        this.tela_cadastro = tela_cadastro;
    }

    public void setTela_listagem( TelaListagemUsuarios tela_listagem){
        this.tela_listagem = tela_listagem;
    }


}
