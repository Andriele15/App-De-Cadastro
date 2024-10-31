# **APP Cadastro com Array**

> Um aplicativo Android simples para cadastrar e guardar informções em uma Array.

## 📱 Descrição

Permite o usuário cadastrar informçãoes em uma Array, e vê-las imprimidas em uma tela secundária.

## 🔧 Funcionalidades

- [x] Entrada de dados (Nome, endreço e telfone)
- [x] Tem três telas interartivas
- [x] Exibição do resultado em uma tela secundária mostrando as informações salvas na tela
- [x] Interface simples e intuitiva

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.
- [X] **Array** para fazer uma simulação de um banco de dados.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-De-Cadastro.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/com/example/imccalculator
│ │ │ │ ├── MainActivity.java # Atividade principal
│ │ │ │ ├── Registro.java # Atividade para pegar as informções
│ │ │ │ ├── TelaCadstroUsuario.java # Atividade para a tela de cadastro
│ │ │ │ ├── TelaListagemUsuarios.java # Atividade para a tela de listagem
│ │ │ │ ├── TelaPrincipal.java # Atividade para a Tela principal
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ │ ├── cad.xml # Layout da tela de cadastro
│ │ │ │ │ ├── list.xml # Layout da tela de listagem
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

 
## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário poderá escolher se quer cadastrar ou ir para tela de listagem de usuários cadastrados.
 
![activitymain](https://github.com/user-attachments/assets/2cc80d37-416e-4a4c-8bed-6aa9ef04510f)

2. **Tela De Cadastro**

Na tela de cadastro, ele poderá inserir informçãoes para o cadastro. Além da opção de cadastrar, também terá a de cancelar, apagando aquelas informções que foram preenchidas.

![cad](https://github.com/user-attachments/assets/13d2b54e-62ac-4d1d-9f98-2a207f4640a2)

3. **Tela De listagem**

Na tela de listagem, terá como o usário explorar os registros criados atráves dos botões. Terá um TextView mostrando a quantidade de registros, e em registro você parou.
Também tem a opção de fechar aquela tela.

![list](https://github.com/user-attachments/assets/ef8c5ee0-01a9-4488-b829-ec55b18d2a22)

 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT

Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
