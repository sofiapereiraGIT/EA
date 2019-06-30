<template>
    <div style="padding-bottom:50px; padding-left: 50px; padding-right: 50px; padding-top: 100px">
        <form class="review-form" @submit.prevent="submitUtilizador">
            <div v-if="error===1" class="Error">
                <span class="closebtn" @click="closeErrorNotification()">&times;</span>
                <strong>Info!</strong> {{ message }}
            </div>
            <div v-if="success===1" class="Success">
                <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
                <strong>Info!</strong> {{ message }}
            </div>
            <div class="w3-row w3-padding-32 w3-section">
                <div class="w3-col m6 w3-container">
                    <img v-if="utilizador.fotografia===null || utilizador.fotografia==='' || utilizador.fotografia==='null'" src="../../assets/user.png" style="margin-bottom: 10px" class="img w3-image">
                    <img v-if="utilizador.fotografia && utilizador.fotografia!=='null' " :src="require('../../../img/'+utilizador.fotografia)" style="margin-bottom: 10px" class="img w3-image">
                    <br><br>
                    <button v-if="!mudarFoto" class="login100-form-btn" @click="mudarFoto = true">Mudar imagem</button>
                    <input v-if="mudarFoto" id="foto" class="w3-input w3-border" type="file" placeholder="Imagem" accept="image/*" v-on:change="uploadFotografia">
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                           {{this.utilizador.email}}
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.nome" class="w3-input w3-border" type="text" placeholder="Nome" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.telemovel" class="w3-input w3-border" type="text" placeholder="Contacto">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <label><select v-model="novoUtilizador.concelho" style="width: 100%" required>
                                <option v-bind:value="novoUtilizador.concelho">{{novoUtilizador.concelho}}</option>
                                <option value="Amarante">Amarante</option>
                                <option value="Braga">Braga</option>
                                <option value="Coimbra">Coimbra</option>
                                <option value="Faro">Faro</option>
                                <option value="Lisboa">Lisboa</option>
                                <option value="Porto">Porto</option>
                                <option value="Viana do Castelo">Viana do Castelo</option>
                            </select></label>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.descricao" class="w3-input w3-border" type="text" placeholder="Descrição">
                        </div>
                    </div>
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.password" class="w3-input w3-border" type="password" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="confirmPass" class="w3-input w3-border" type="password" placeholder="Confirme Password" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <input type="submit" class="login100-form-btn" value="Guardar">
                    </div>
                </div>
            </div>
        </form>
    </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'UserPerfilEdit',

  data: function () {
    return {
      utilizador: null,
      success: 0,
      error: 0,
      message: '',
      novoUtilizador: {
        email: null,
        password: null,
        nome: null,
        fotografia: null,
        concelho: null,
        telemovel: null,
        descricao: null
      },
      mudarFoto: false,
      confirmPass: null
    }
  },

  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    } else {
      const value = this.$session.get('user')
      if (value[1] === 1) {
        /* Redirecionar para a Página de Acesso Negado */
        route.push(('/AccessDenied'))
      }
    }
    this.FetchData()
  },

  methods: {
    stateChange (newState) {
      setTimeout(function () {
        if (newState === -1) {
          route.push('/UserHomePage')
        }
      }, 3000)
    },

    closeErrorNotification () {
      this.error = 0
    },

    FetchData: function () {
      const value = this.$session.get('user')
      axios.get(this.$axiosurl + 'UtilizadorComum?email=' + value[0] + '&emailPedido=' + value[0]).then(response => {
        this.utilizador = response.data
        this.novoUtilizador.email = this.utilizador.email
        this.novoUtilizador.password = this.utilizador.password
        this.novoUtilizador.nome = this.utilizador.nome
        this.novoUtilizador.fotografia = this.utilizador.fotografia
        this.novoUtilizador.concelho = this.utilizador.concelho
        this.novoUtilizador.telemovel = this.utilizador.telemovel
        this.novoUtilizador.descricao = this.utilizador.descricao
      })
    },

    submitUtilizador () {
      if (this.novoUtilizador.password != null && this.novoUtilizador.nome != null && this.novoUtilizador.concelho != null) {
        if (this.novoUtilizador.password === this.confirmPass) {
          if (this.novoUtilizador.fotografia == null) this.novoUtilizador.fotografia = ''
          if (this.novoUtilizador.telemovel == null) this.novoUtilizador.telemovel = ''
          if (this.novoUtilizador.descricao == null) this.novoUtilizador.descricao = ''

          axios.post(this.$axiosurl + 'UpdateUtilizadorComum', this.novoUtilizador)
            .then(response => {
              route.push('/UserPerfilEdit')
              this.mudarFoto = false
              this.success = 1
              this.error = 0
              this.message = 'As alterações foram efetuadas com sucesso. Irá ser redirecionado dentro de 3 segundos.'
              this.stateChange(-1)
            }).catch(e => {
              this.success = 0
              this.error = 1
              this.message = 'Não foi possível efetuar as alterações. Por favor, tente novamente.'
            })
        } else {
          this.error = 1
          this.success = 0
          this.message = 'Password não coincide. Por favor, tente novamente.'
        }
      }
    },

    uploadFotografia () {
      this.novoUtilizador.fotografia = this.getElementById('foto')
    }
  }
}
</script>

<style scoped>
    .img {
        height: 300px;
        width: 300px;
        overflow-y: hidden;
        overflow-x: hidden;
        object-fit: cover;
    }

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

    /* Hide the browser's default radio button */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
    }

    /* On mouse-over, add a grey background color */
    .container:hover input ~ .checkmark {
        background-color: #ccc;
    }

    /* When the radio button is checked, add a blue background */
    .container input:checked ~ .checkmark {
        background-color: #2196F3;
    }

    /* Show the indicator (dot/circle) when checked */
    .container input:checked ~ .checkmark:after {
        display: block;
    }

    /* Style the indicator (dot/circle) */
    .container .checkmark:after {
        top: 9px;
        left: 9px;
        width: 8px;
        height: 8px;
        border-radius: 50%;
        background: white;
    }

    /* Hide the browser's default checkbox */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
        height: 0;
        width: 0;
    }

    .login100-form-btn {
        font-family: Montserrat-Bold, serif;
        font-size: 15px;
        line-height: 1.5;
        color: #fff;
        text-transform: uppercase;

        width: 60%;
        height: 50px;
        border-radius: 25px;
        background: gray;
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        justify-content: right;
        align-items: center;
        padding: 0 0px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }
    .login100-form-btn:hover {
        background: black;
    }
    @font-face {
        font-family: Poppins-Regular;
        src: url('../../fonts/poppins/Poppins-Regular.ttf');
    }

    @font-face {
        font-family: Poppins-Medium;
        src: url('../../fonts/poppins/Poppins-Medium.ttf');
    }

    @font-face {
        font-family: Poppins-Bold;
        src: url('../../fonts/poppins/Poppins-Bold.ttf');
    }

    @font-face {
        font-family: Poppins-SemiBold;
        src: url('../../fonts/poppins/Poppins-SemiBold.ttf');
    }
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body, html {
        height: 100%;
        font-family: Poppins-Regular, sans-serif;
    }

    a {
        font-family: Poppins-Regular, serif;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0;
        transition: all 0.4s;
        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
    }

    h1,h2,h3,h4,h5,h6 {
        margin: 0;
    }

    p {
        font-family: Poppins-Regular, serif;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0;
    }

    ul, li {
        margin: 0;
        list-style-type: none;
    }

    input {
        outline: none;
        border: none;
    }

    textarea {
        outline: none;
        border: none;
    }

    textarea:focus, input:focus {
        border-color: transparent !important;
    }

    input:focus::-webkit-input-placeholder { color:transparent; }
    input:focus:-moz-placeholder { color:transparent; }
    input:focus::-moz-placeholder { color:transparent; }
    input:focus:-ms-input-placeholder { color:transparent; }

    textarea:focus::-webkit-input-placeholder { color:transparent; }
    textarea:focus:-moz-placeholder { color:transparent; }
    textarea:focus::-moz-placeholder { color:transparent; }
    textarea:focus:-ms-input-placeholder { color:transparent; }

    input::-webkit-input-placeholder { color: #adadad;}
    input:-moz-placeholder { color: #adadad;}
    input::-moz-placeholder { color: #adadad;}
    input:-ms-input-placeholder { color: #adadad;}

    textarea::-webkit-input-placeholder { color: #adadad;}
    textarea:-moz-placeholder { color: #adadad;}
    textarea::-moz-placeholder { color: #adadad;}
    textarea:-ms-input-placeholder { color: #adadad;}

    button {
        outline: none !important;
        border: none;
        background: transparent;
        display: inline-block;
    }

    button:hover {
        cursor: pointer;
    }

    iframe {
        border: none !important;
    }

    .login100-form-title i {
        font-size: 60px;
    }

    .input100:focus + .focus-input100::after {
        top: -15px;
    }

    .input100:focus + .focus-input100::before {
        width: 100%;
    }

    .has-val.input100 + .focus-input100::after {
        top: -15px;
    }

    .has-val.input100 + .focus-input100::before {
        width: 100%;
    }

    .login100-form-btn {
        font-family: Poppins-Medium, serif;
        font-size: 15px;
        color: #fff;
        line-height: 1.2;
        text-transform: uppercase;

        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: inline-block;
        justify-content: right;
        padding: 0 20px;
        width: 40%;
        height: 50px;
    }

    @media (max-width: 576px) {
        .wrap-login100 {
            padding: 77px 15px 33px 15px;
        }
    }
</style>
