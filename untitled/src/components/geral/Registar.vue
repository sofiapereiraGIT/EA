<template>
    <div class="login-wrap">
        <br>
        <div v-if="error===1" class="Error">
            <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
            <strong>Info!</strong> {{ message }}
        </div>
        <div v-if="success===1" class="Success">
            <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
            <strong>Info!</strong> {{ message }}
        </div>
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Utilizador Comum</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Canil</label>
            <div class="login-form ">
                <!-- Utilizador Comum Tab -->
                <form @submit.prevent="registarUC">
                    <div class="sign-in-htm row">
                        <div class="column">
                            <div class="group">
                                <label for="NameUC" class="label">Nome</label>
                                <input v-model="uc.nome" id="NameUC" type="text" class="input" required>
                            </div>
                            <div class="group">
                                <label for="EmailUC" class="label">Email</label>
                                <input v-model="uc.email" id="EmailUC" type="email" class="input" required>
                            </div>
                            <div class="group">
                                <label for="ConcelhoUC" class="label">Concelho</label>
                                <input v-model="uc.concelho" id="ConcelhoUC" type="text" class="input" required>
                            </div>
                        </div>
                        <div class="column">
                            <div class="group">
                                <label for="PassUC" class="label">Password</label>
                                <input v-model="uc.password" id="PassUC" type="password" class="input" data-type="password" required>
                            </div>
                            <div class="group">
                                <label for="ConfPassUC" class="label">Confirme a password</label>
                                <input v-model="uc.confPassword" id="ConfPassUC" type="password" class="input" data-type="password" required>
                            </div>
                            <div class="group">
                                <label for="PhoneUC" class="label">Telemóvel</label>
                                <input v-model="uc.telemovel" id="PhoneUC" type="number" class="input">
                            </div>
                        </div>
                        <div class="group">
                            <label for="PhoneUC" class="label">Insira uma foto sua</label>
                            <input id="PhotoUC" type="file">
                        </div>
                        <div class="group">
                            <input id="CheckBoxUC" type="checkbox" class="check" checked>
                            <label for="CheckBoxUC"><span class="icon"></span> Quero que o meu telemóvel seja visivel pelos outros utilizadores</label>
                        </div>
                        <div class="group">
                            <input id="TermsUC" type="checkbox" class="check" checked>
                            <label for="TermsUC"><span class="icon"></span> Aceito os Termos e Condições</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Registar">
                        </div>
                    </div>
                </form>
                <!-- Canil Tab -->
                <form @submit.prevent="registarCanil">
                    <div class="sign-up-htm row">
                        <div class="column">
                            <div class="group">
                                <label for="NameC" class="label">Nome</label>
                                <input v-model="c.nome" id="NameC" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="EmailC" class="label">Email</label>
                                <input v-model="c.email" id="EmailC" type="email" class="input">
                            </div>
                            <div class="group">
                                <label for="PassC" class="label">Password</label>
                                <input v-model="c.password" id="PassC" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <label for="CheckBoxC" class="label">Confirme a password</label>
                                <input v-model="c.confPassword" id="CheckBoxC" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <label for="PhoneC" class="label">Telemóvel</label>
                                <input v-model="c.telemovel" id="PhoneC" type="number" class="input">
                            </div>
                            <div class="group">
                                <label for="ConcelhoC" class="label">Concelho</label>
                                <input v-model="c.concelho" id="ConcelhoC" type="text" class="input">
                            </div>
                        </div>
                        <div class="column">
                            <div class="group">
                                <div class="group">
                                    <label for="MoradaC" class="label">Morada</label>
                                    <input v-model="c.morada" id="MoradaC" type="text" class="input">
                                </div>
                                <div class="group">
                                    <label for="LinkSiteC" class="label">Link site oficial</label>
                                    <input v-model="c.site" id="LinkSiteC" type="text" class="input">
                                </div>
                                <div class="group">
                                    <label for="LinkFacebookC" class="label">Link Facebook </label>
                                    <input v-model="c.facebook" id="LinkFacebookC" type="text" class="input">
                                </div>
                                <div class="group">
                                    <label for="LinkInstagramC" class="label">Link Instagram</label>
                                    <input v-model="c.instagram" id="LinkInstagramC" type="text" class="input">
                                </div>
                                <div class="group">
                                    <label for="HorarioC" class="label">Horário</label>
                                    <input v-model="c.horario" id="HorarioC" type="text" class="input">
                                </div>
                            </div>
                            <div class="group">
                                <label for="DescricaoC" class="label">Descrição</label>
                                <textarea v-model="c.descricao" id="DescricaoC" class="input"></textarea>
                            </div>
                        </div>
                        <div class="group">
                            <label for="FotoC" class="label">Insira uma foto que represente o canil </label>
                            <input id="FotoC" type="file">
                        </div>
                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Aceito os termos e condições</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Registar">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Registar',
  data: () => ({
    success: 0,
    error: 0,
    message: '',
    uc: {
      nome: '',
      email: '',
      concelho: '',
      password: '',
      confPassword: '',
      telemovel: '',
      fotografia: ''
    },
    c: {
      nome: '',
      email: '',
      password: '',
      confPassword: '',
      concelho: '',
      telemovel: '',
      morada: '',
      site: '',
      facebook: '',
      instagram: '',
      horario: '',
      descricao: '',
      fotografia: ''
    }
  }),
  methods: {
    registarUC () {
      axios.defaults.headers.post['Content-Type'] = 'application/json'
      if (this.uc.password !== this.uc.confPassword) {
        this.success = 0
        this.error = 1
        this.message = 'As Passwords Não Coincidem'
      } else {
        axios.post('http://localhost:8080/procura4patas/UtilizadorComum', this.uc)
          .then(response => {
            if (response.data.msg === true) {
              this.message = 'Foi Registado Com Sucesso'
              this.error = 0
              this.success = 1
            }
          }).catch(e => {
            this.message = 'Não Foi Possível Registar o Utilizador'
            this.success = 0
            this.error = 1
          })
      }
    },
    registarCanil () {
      axios.defaults.headers.post['Content-Type'] = 'application/json'
      if (this.c.password !== this.c.confPassword) {
        this.success = 0
        this.error = 1
        this.message = 'As Passwords Não Coincidem'
      } else {
        axios.post('http://localhost:8080/procura4patas/Canil', this.c)
          .then(response => {
            if (response.data.msg === true) {
              this.message = 'Foi Registado Com Sucesso'
              this.error = 0
              this.success = 1
            }
          }).catch(e => {
            this.message = 'Não Foi Possível Registar o Utilizador'
            this.success = 0
            this.error = 1
          })
      }
    }
  }
}
</script>

<style scoped>
    .Success {
        padding: 20px;
        background-color: green;
        color: white;
    }
    .Error {
        padding: 20px;
        background-color: #f44336;
        color: white;
    }
    .closebtn {
        margin-left: 15px;
        color: white;
        font-weight: bold;
        float: right;
        font-size: 22px;
        line-height: 20px;
        cursor: pointer;
        transition: 0.3s;
    }
    .closebtn:hover {
        color: black;
    }
  body{
    margin:0;
    color:#6a6f8c;
    background:#c8c8c8;
    font:600 16px/18px 'Open Sans',sans-serif;
  }
  *,:after,:before{box-sizing:border-box}

  a{color:inherit;text-decoration:none}

  .login-wrap{
    width:100%;
    margin:auto;
    max-width:100%;
    min-height:1024px;
    position:relative;
    box-shadow:0 12px 15px 0 rgba(0,0,0,.24),0 17px 50px 0 rgba(0,0,0,.19);
  }
  .login-html{
    width:100%;
    height:100%;
    position:absolute;
    padding:90px 70px 50px 70px;
    background: transparent; /* Mudar a cor do fundo */
  }
  .login-html .sign-in-htm,
  .login-html .sign-up-htm{
    top:0;
    left:0;
    right:0;
    bottom:0;
    position:absolute;
    transform:rotateY(180deg);
    backface-visibility:hidden;
    transition:all .4s linear;
  }
  .login-html .sign-in,
  .login-html .sign-up,
  .login-form .group .check{
    display:none;
  }
  .login-html .tab,
  .login-form .group .label,
  .login-form .group .button{
    text-transform:uppercase;
  }
  .login-html .tab{
    font-size:22px;
    padding-bottom:5px;
    margin: 0 15px 10px 0;
    display:inline-block;
    border-bottom:2px solid transparent;
  }
  .login-html .sign-in:checked + .tab,
  .login-html .sign-up:checked + .tab {
    color: #0031ff; /* Cor das letras da tab */
    border-color:#1161ee; /* Cor da seleção da tab */
  }
  .login-form{
    min-height:345px;
    position:relative;
    perspective:1000px;
    transform-style:preserve-3d;
  }
  .login-form .group{
    margin-bottom:15px;
  }
  .login-form .group .textarea,
  .login-form .group .label,
  .login-form .group .input{
    width:100%;
    color: #000000; /* Cor das letras do botão */
    display:block;
  }

  .login-form .group .button{
    width:20%;
    color: #fffbff; /* Cor das letras do botão */
    float: right ;
    background-color: #f4511e;
    border: none;
    padding: 16px 32px;
    text-align: center;
    font-size: 16px;
    margin: 4px 2px;
    opacity: 0.6;
    transition: 0.3s;
    display: inline-block;
    text-decoration: none;
    cursor: pointer;
  }

  .login-form .group .button:hover {opacity: 1}

  .login-form .group .textarea,
  .login-form .group .input,
  .login-form .group .button{
    border:none;
    padding:15px 20px;
    border-radius:25px;
    background: rgba(24, 105, 138, 0.34); /* Cor das caixinhas */
  }
  .login-form .group input[data-type="password"]{
    text-security:circle;
    -webkit-text-security:circle;
  }
  .login-form .group .label{
    color: #000000; /* Muda a cor das labels */
    font-size:12px;
  }
  .login-form .group .button{
    background:#1161ee;
  }
  .login-form .group label .icon{
    width:15px;
    height:15px;
    border-radius:2px;
    position:relative;
    display:inline-block;
    background:rgba(255,255,255,.1);
  }
  .login-form .group label .icon:before,
  .login-form .group label .icon:after{
    content:'';
    width:10px;
    height:2px;
    background:#fff; /* Cor do visto do checkbox */
    position:absolute;
    transition:all .2s ease-in-out 0s;
  }
  .login-form .group label .icon:before{
    left:3px;
    width:5px;
    bottom:6px;
    transform:scale(0) rotate(0);
  }
  .login-form .group label .icon:after{
    top:6px;
    right:0;
    transform:scale(0) rotate(0);
  }
  .login-form .group .check:checked + label{
    color: #000000; /* Cor das  letras da checkbox */
  }
  .login-form .group .check:checked + label .icon{
    background:#1161ee;
  }
  .login-form .group .check:checked + label .icon:before{
    transform:scale(1) rotate(45deg);
  }
  .login-form .group .check:checked + label .icon:after{
    transform:scale(1) rotate(-45deg);
  }
  .login-html .sign-in:checked + .tab + .sign-up + .tab + .login-form .sign-in-htm{
    transform:rotate(0);
  }
  .login-html .sign-up:checked + .tab + .login-form .sign-up-htm{
    transform:rotate(0);
  }

  /* Create two equal columns that floats next to each other */
  .column {
    float: left;
    width: 50%;
    padding: 10px;
  }

  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }
</style>
