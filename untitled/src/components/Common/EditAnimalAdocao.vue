<template>
    <div>
        <div class="limiter ">
            <div class="container-login100">
                <div class="wrap-login100 p-t-190 p-b-30 row">
                    <form class="login100-form validate-form" @submit.prevent="submitAnimal">
                        <div v-if="error===1" class="Error">
                            <span class="closebtn" @click="closeErrorNotification()">&times;</span>
                            <strong>Info!</strong> {{ message }}
                        </div>
                        <div v-if="success===1" class="Success">
                            <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
                            <strong>Info!</strong> {{ message }}
                        </div>
                        <div class="columnAlign">
                            <div class="login100-form-avatar">
                                <img v-if="(animalNovo.Fotografia===null || animalNovo.Fotografia==='') && animalNovo.Discriminator === 'C'" src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image">
                                <img v-if="(animalNovo.Fotografia===null || animalNovo.Fotografia==='') && animalNovo.Discriminator === 'G'" src="../../assets/gato.png" style="margin-bottom: 10px" class="img w3-image">
                                <img v-else :src="require('../../../img/'+animalNovo.Fotografia)" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                            </div>
                            <br>
                            <div>
                                <button v-if="!mudarFoto" class="login100-form-btn" @click="mudarFoto = true">Mudar imagem</button>
                                <input v-if="mudarFoto" id="foto" class="w3-input w3-border" type="file" placeholder="Imagem" accept="image/*" v-on:change="uploadFotografia">
                            </div>
                            <br>
                            <label v-if="this.animalNovo.Estado === 'E'" class="container">Encontrei este animal na rua
                                <input type="radio" checked="checked" name="radio" value="E" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-else class="container">Encontrei este animal na rua
                                <input type="radio" name="radio" value="E" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.$session.get('user')[1] === 1 && this.animalNovo.Estado === 'F'" class="container">Encontra-se em FAT
                                <input type="radio" checked="checked" name="radio" value="F" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.$session.get('user')[1] === 1 && this.animalNovo.Estado != 'F'" class="container">Encontra-se em FAT
                                <input type="radio" name="radio" value="F" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.$session.get('user')[1] === 1 && this.animalNovo.Estado === 'C'" class="container">Procuro FAT
                                <input type="radio" checked="checked" name="radio" value="C" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.$session.get('user')[1] === 1 && this.animalNovo.Estado != 'C'" class="container">Procuro FAT
                                <input type="radio" name="radio" value="C" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.animalNovo.Estado === 'A'" class="container">Adotado
                                <input type="radio" checked="checked" name="radio" value="A" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-else class="container">Adotado
                                <input type="radio" name="radio" value="A" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-if="this.animalNovo.Estado === 'M'" class="container">Falecido
                                <input type="radio" checked="checked" name="radio" value="M" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                            <label v-else class="container">Falecido
                                <input type="radio" name="radio" value="M" v-model="animalNovo.Estado">
                                <span class="checkmark"></span>
                            </label>
                        </div>
                        <div class="column">
                            <br>
                            <div class="wrap-input100 validate-input m-b-10">
                                <label><input v-model="animalNovo.Nome" class="input100" type="text" name="Nome" placeholder="Nome" required></label>
                            </div>
                            <div class="wrap-input100 validate-input m-b-10">
                                <label><input v-model="animalNovo.Descricao" class="input100" type="text" name="Descrição" placeholder="Descrição"></label>
                            </div>
                            <div class="column2">
                                <div class="select">
                                    <select v-model="animalNovo.Discriminator" required>
                                        <option v-if="animalNovo.Discriminator === 'C'" v-bind:value="animalNovo.Discriminator">Cão</option>
                                        <option v-if="animalNovo.Discriminator === 'G'" v-bind:value="animalNovo.Discriminator">Gato</option>
                                        <option value="C">Cão</option>
                                        <option value="G">Gato</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.Sexo" required>
                                        <option v-if="animalNovo.Sexo === 'F'" v-bind:value="animalNovo.Sexo">Fêmea</option>
                                        <option v-if="animalNovo.Sexo === 'M'" v-bind:value="animalNovo.Sexo">Macho</option>
                                        <option value="F">Fêmea</option>
                                        <option value="M">Macho</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.Idade" required>
                                        <option v-if="animalNovo.Idade === 'B'" v-bind:value="animalNovo.Idade">Bebé (Menos de 6 meses)</option>
                                        <option v-if="animalNovo.Idade === 'J'" v-bind:value="animalNovo.Idade">Jovem</option>
                                        <option v-if="animalNovo.Idade === 'A'" v-bind:value="animalNovo.Idade">Adulto</option>
                                        <option value="B">Bebé (Menos de 6 meses)</option>
                                        <option value="J">Jovem</option>
                                        <option value="A">Adulto</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.Porte" required>
                                        <option v-if="animalNovo.Porte === 'P'" v-bind:value="animalNovo.Porte">Pequeno</option>
                                        <option v-if="animalNovo.Porte === 'M'" v-bind:value="animalNovo.Porte">Médio</option>
                                        <option v-if="animalNovo.Porte === 'G'" v-bind:value="animalNovo.Porte">Grande</option>
                                        <option v-if="animalNovo.Porte === 'I'" v-bind:value="animalNovo.Porte">Indefinido</option>
                                        <option value="P">Pequeno</option>
                                        <option value="M">Médio</option>
                                        <option value="G">Grande</option>
                                        <option value="I">Indefinido</option>
                                    </select>
                                </div>
                            </div>
                            <div class="column2">
                                <div class="select">
                                    <select v-model="animalNovo.CorPelo" required>
                                        <option v-bind:value="animalNovo.CorPelo">{{animalNovo.CorPelo}}</option>
                                        <option value="Bege">Bege</option>
                                        <option value="Branco">Branco</option>
                                        <option value="Castanho">Castanho</option>
                                        <option value="Cinzento">Cinzento</option>
                                        <option value="Laranja">Laranja</option>
                                        <option value="Preto">Preto</option>
                                        <option value="Indefinido">Indefinido</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.CompPelo" required>
                                        <option v-if="animalNovo.CompPelo === 'S'" v-bind:value="animalNovo.CompPelo">Sem pêlo</option>
                                        <option v-if="animalNovo.CompPelo === 'C'" v-bind:value="animalNovo.CompPelo">Curto</option>
                                        <option v-if="animalNovo.CompPelo === 'M'" v-bind:value="animalNovo.CompPelo">Médio</option>
                                        <option v-if="animalNovo.CompPelo === 'L'" v-bind:value="animalNovo.CompPelo">Longo</option>
                                        <option value="S">Sem pêlo</option>
                                        <option value="C">Curto</option>
                                        <option value="M">Médio</option>
                                        <option value="L">Longo</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-if="animalNovo.Discriminator==='C'" v-model="animalNovo.Raca" required>
                                        <option v-bind:value="animalNovo.Raca">{{animalNovo.Raca}}</option>
                                        <option value="Beagle">Beagle</option>
                                        <option value="Buldogue">Buldogue</option>
                                        <option value="Golden Retriever">Golden Retriever</option>
                                        <option value="Lavrador">Lavrador</option>
                                        <option value="Pastor Alemao">Pastor Alemão</option>
                                        <option value="Poodle">Poodle</option>
                                        <option value="Rottweiler">Rottweiler</option>
                                        <option value="Outro">Outra raça</option>
                                        <option value="Sem Raça Definida">Sem raça definida</option>
                                    </select>
                                    <select v-if="animalNovo.Discriminator==='G'" v-model="animalNovo.Raca" required>
                                        <option v-bind:value="animalNovo.Raca">{{animalNovo.Raca}}</option>
                                        <option value="Persa">Persa</option>
                                        <option value="Ragdoll">Ragdoll</option>
                                        <option value="ScottishFold">Scottish Fold</option>
                                        <option value="Siames">Siamês</option>
                                        <option value="Outro">Outra raça</option>
                                        <option value="Sem Raça Definida">Sem raça definida</option>
                                    </select>
                                </div>
                                <br>
                                <div>
                                    <input class="login100-form-btn" type="submit" value="Guardar">
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'EditAnimalAdocao',

  data: function () {
    return {
      animal: null,
      animalNovo: {
        CorPelo: '',
        Raca: '',
        Sexo: '',
        Discriminator: '',
        Estado: '',
        Descricao: '',
        Idade: '',
        CompPelo: '',
        Concelho: '',
        Fotografia: '',
        ID: '',
        Nome: '',
        Porte: ''
      },
      mudarFoto: false,
      success: 0,
      error: 0
    }
  },

  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }

    this.animal = this.$session.get('animal')
    this.animalNovo.CorPelo = this.animal.CorPelo
    this.animalNovo.Raca = this.animal.Raca
    this.animalNovo.Sexo = this.animal.Sexo
    this.animalNovo.Discriminator = this.animal.Discriminator
    this.animalNovo.Estado = this.animal.Estado
    this.animalNovo.Descricao = this.animal.Descricao
    this.animalNovo.Idade = this.animal.Idade
    this.animalNovo.CompPelo = this.animal.CompPelo
    this.animalNovo.Concelho = this.animal.Concelho
    this.animalNovo.Fotografia = this.animal.Fotografia
    this.animalNovo.ID = this.animal.ID
    this.animalNovo.Nome = this.animal.Nome
    this.animalNovo.Porte = this.animal.Porte
  },

  methods: {
    stateChange (newState) {
      setTimeout(function () {
        if (newState === -1) {
          route.push('/GerirAnimais')
        }
      }, 3000)
    },
    closeErrorNotification () {
      this.error = 0
    },
    uploadFotografia () {
      this.animalNovo.Fotografia = this.getElementById('foto')
    },

    submitAnimal () {
      axios.post(this.$axiosurl + 'UpdateAnimal', this.animalNovo).then(response => {
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

    /* Reset Select */
    /* The container */
    .img {
        height: 300px;
        width: 300px;
        overflow-y: hidden;
        overflow-x: hidden;
        object-fit: cover;
    }
    .container {
        display: block;
        position: relative;
        padding-left: 35px;
        margin-bottom: 12px;
        cursor: pointer;
        font-size: 22px;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
    }

    /* Hide the browser's default radio button */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
    }

    /* Create a custom radio button */
    .checkmark {
        position: absolute;
        top: 0;
        left: 0;
        height: 25px;
        width: 25px;
        background-color: #eee;
        border-radius: 50%;
    }

    /* On mouse-over, add a grey background color */
    .container:hover input ~ .checkmark {
        background-color: #ccc;
    }

    /* When the radio button is checked, add a blue background */
    .container input:checked ~ .checkmark {
        background-color: #2196F3;
    }

    /* Create the indicator (the dot/circle - hidden when not checked) */
    .checkmark:after {
        content: "";
        position: absolute;
        display: none;
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
    select {
        -webkit-appearance: none;
        -moz-appearance: none;
        -ms-appearance: none;
        appearance: none;
        outline: 0;
        box-shadow: none;
        border: 0 !important;
        background: #2c3e50 none;
    }
    /* Remove IE arrow */
    select::-ms-expand {
        display: none;
    }
    /* Custom Select */
    .select {
        position: relative;
        display: flex;
        width: 15em;
        height: 2em;
        line-height: 2;
        background: #2c3e50;
        overflow: hidden;
        border-radius: .24em;
    }
    select {
        flex: 1;
        padding: 0 .2em;
        color: #fff;
        cursor: pointer;
    }
    /* Arrow */
    .select::after {
        content: '\25BC';
        position: absolute;
        top: 0;
        right: 0;
        padding: 0 1em;
        background: #34495e;
        cursor: pointer;
        pointer-events: none;
        -webkit-transition: .25s all ease;
        -o-transition: .25s all ease;
        transition: .25s all ease;
    }
    /* Transition */
    .select:hover::after {
        color: #2196F3;
    }

    /* The container */
    .container {
        display: inline-block;
        position: relative;
        padding-left: 35px;
        margin-bottom: 12px;
        cursor: pointer;
        font-size: 15px;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
    }

    /* Hide the browser's default checkbox */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
        height: 0;
        width: 0;
    }

    .center {
        margin-left: auto;
        margin-right: auto;
        width: 250px;
        height: 250px;
        background-size: cover;
    }

    /* Create two equal columns that floats next to each other */
    .columnAlign {
        float: left;
        width: 50%;
        padding: 5px 0;
        text-align: center;

    }

    .column {
        float: left;
        width: 50%;
        padding: 5px 0;
    }

    .columnBtn {
        float: right;
        width: 100%;
        padding: 10px 0;
        text-align: right;
    }

    .column2 {
        float: left;
        width: 50%;
        padding: 0px;
        display:inline-block;
    }

    /* Clear floats after the columns */
    .row:after {
        content: "";
        display: table;
        clear: both;
    }
    .login100-form-btn {
        font-family: Montserrat-Bold, serif;
        font-size: 15px;
        line-height: 1.5;
        color: #fff;
        text-transform: uppercase;

        width: 50%;
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

    .limiter {
        width: 100%;
        margin: 0 auto;
    }

    .container-login100 {
        width: 100%;
        min-height: 100vh;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        align-items: center;
        padding: 15px;
        background: url('../../assets/CaoEGato.jpg');
    }

    .wrap-login100 {
        width: 1100px;
        height: 500px;
        background: #fff;
        border-radius: 10px;
        overflow: scroll;
        padding: 0px 0px 0px 0px;

        box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -moz-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -webkit-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -o-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -ms-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
    }

    .login100-form {
        width: 100%;
    }

    .login100-form-title i {
        font-size: 60px;
    }

    .wrap-input100 {
        width: 90%;
        position: relative;
        border-bottom: 2px solid #adadad;
        margin-bottom: 37px;
    }

    .input100 {
        font-family: Poppins-Regular, serif;
        font-size: 15px;
        color: #555555;
        line-height: 1.2;

        display: block;
        width: 100%;
        height: 45px;
        background: transparent;
        padding: 0 5px;
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

    .validate-input {
        position: relative;
    }
</style>
