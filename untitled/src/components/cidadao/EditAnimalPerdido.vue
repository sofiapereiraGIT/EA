<template>
    <div>
        <div class="limiter ">
            <div class="container-login100">
                <div class="wrap-login100 p-t-190 p-b-30 row">
                    <form class="login100-form validate-form" @submit.prevent="submitAnimal">
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
                                <br>
                                <br>
                                <button class="login100-form-btn" @click="eliminarAnimal()">Eliminar Animal</button>
                            </div>
                            <br>
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
                                    <select v-model="animalNovo.Concelho" required>
                                        <option v-bind:value="animalNovo.Concelho">{{animalNovo.Concelho}}</option>
                                        <option value="Amarante">Amarante</option>
                                        <option value="Braga">Braga</option>
                                        <option value="Coimbra">Coimbra</option>
                                        <option value="Faro">Faro</option>
                                        <option value="Lisboa">Lisboa</option>
                                        <option value="Porto">Porto</option>
                                        <option value="Viana do Castelo">Viana do Castelo</option>
                                    </select>
                                </div>
                                <br>
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
                                        <option v-if="animalNovo.Sexo === 'M'" v-bind:value="animalNovo.Sexo">Macho</option>
                                        <option v-if="animalNovo.Sexo === 'F'" v-bind:value="animalNovo.Sexo">Fêmea</option>
                                        <option value="M">Macho</option>
                                        <option value="F">Fêmea</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.Idade" required>
                                        <option v-if="animalNovo.Idade === 'B'" v-bind:value="animalNovo.Idade">Bebé (Menos de 6 Meses)</option>
                                        <option v-if="animalNovo.Idade === 'J'" v-bind:value="animalNovo.Idade">Jovem</option>
                                        <option v-if="animalNovo.Idade === 'A'" v-bind:value="animalNovo.Idade">Adulto</option>
                                        <option value="B">Bebé (Menos de 6 Meses)</option>
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
                                <br>
                            </div>
                            <div class="column2">
                                <div class="select">
                                    <select v-model="animalNovo.CorPelo" required>
                                        <option v-bind:value="animalNovo.CorPelo">{{animalNovo.CorPelo}}</option>
                                        <option value="Laranja">Laranja</option>
                                        <option value="Bege">Bege</option>
                                        <option value="Branco">Branco</option>
                                        <option value="Castanho">Castanho</option>
                                        <option value="Cinzento">Cinzento</option>
                                        <option value="Preto">Preto</option>
                                        <option value="Indefinido">Indefinido</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-model="animalNovo.CompPelo" required>
                                        <option v-if="animalNovo.CompPelo === 'S'" v-bind:value="animalNovo.CompPelo">Sem Pêlo</option>
                                        <option v-if="animalNovo.CompPelo === 'C'" v-bind:value="animalNovo.CompPelo">Curto</option>
                                        <option v-if="animalNovo.CompPelo === 'M'" v-bind:value="animalNovo.CompPelo">Médio</option>
                                        <option v-if="animalNovo.CompPelo === 'L'" v-bind:value="animalNovo.CompPelo">Longo</option>
                                        <option value="S">Sem Pêlo</option>
                                        <option value="C">Curto</option>
                                        <option value="M">Médio</option>
                                        <option value="L">Longo</option>
                                    </select>
                                </div>
                                <br>
                                <div class="select">
                                    <select v-if="animalNovo.Discriminator==='C'" v-model="animalNovo.Raca" required>
                                        <option v-bind:value="animalNovo.Raca">{{animalNovo.Raca}}</option>
                                        <option value="Sem Raça Definida">Sem Raça Definida</option>
                                        <option value="Pastor Alemao">Pastor Alemão</option>
                                        <option value="Lavrador">Lavrador</option>
                                        <option value="Buldogue">Buldogue</option>
                                        <option value="Beagle">Beagle</option>
                                        <option value="Poodle">Poodle</option>
                                        <option value="Rottwiller">Rottwiller</option>
                                        <option value="Golden Retriever">Golden Retriever</option>
                                        <option value="Outro">Outro</option>
                                    </select>
                                    <select v-if="animalNovo.Discriminator==='G'" v-model="animalNovo.Raca" required>
                                        <option v-bind:value="animalNovo.Raca">{{animalNovo.Raca}}</option>
                                        <option value="" disabled>Raça Gato</option>
                                        <option value="Sem Raça Definida">Sem Raça Definida</option>
                                        <option value="Persa">Persa</option>
                                        <option value="Siamês">Siamês</option>
                                        <option value="Ragdoll">Ragdoll</option>
                                        <option value="Scottish Fold">Scottish Fold</option>
                                        <option value="Outro">Outro</option>
                                    </select>
                                </div>
                                <br>
                                <div class="columnBtn">
                                    <input class="login100-form-btn" type="submit" value="Guardar">
                                    <br>
                                </div>
                            </div>
                            <div>
                                <br>
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
  name: 'EditAnimalPerdido',
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
      mudarFoto: false
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
    uploadFotografia () {
      this.animalNovo.Fotografia = this.getElementById('foto')
    },

    submitAnimal () {
      axios.post(this.$axiosurl + 'UpdateAnimal', this.animalNovo).then(response => {
        route.push('/EditAnimalPerdido')
        this.mudarFoto = false
      })
    },

    eliminarAnimal () {
      var dados = {}
      dados['ID'] = this.animalNovo.ID
      dados['email'] = this.$session.get('user')[0]

      axios.post(this.$axiosurl + 'DeleteAnimalPerdido', dados).then(response => {
        route.push('/GerirAnimais')
      })
    }
  }
}
</script>

<style scoped>
    /* Reset Select */
    /* The container */
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

    .img {
        height: 300px;
        width: 300px;
        overflow-y: hidden;
        overflow-x: hidden;
        object-fit: cover;
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
        padding: 100px 0;
        text-align: center;

    }

    .column {
        float: left;
        width: 50%;
        padding: 70px 0;
    }

    .columnBtn {
        float: left;
        width: 100%;
        padding: 10px 0;
        text-align: center;
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

    .txt1 {
        text-align: center;
        font-family: Poppins-Regular, serif;
        font-size: 13px;
        color: #666666;
        line-height: 1.5;
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

    .login100-form-title {
        display: block;
        font-family: Poppins-Bold,serif;
        font-size: 30px;
        color: #333333;
        line-height: 1.2;
        text-align: center;
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

    .focus-input100 {
        position: absolute;
        display: block;
        width: 100%;
        height: 100%;
        top: 0;
        left: 0;
        pointer-events: none;
    }

    .focus-input100::before {
        content: "";
        display: block;
        position: absolute;
        bottom: -2px;
        left: 0;
        width: 0;
        height: 2px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;

        background: #6a7dfe;
        background: -webkit-linear-gradient(left, #21d4fd, #b721ff);
        background: -o-linear-gradient(left, #21d4fd, #b721ff);
        background: -moz-linear-gradient(left, #21d4fd, #b721ff);
        background: linear-gradient(left, #21d4fd, #b721ff);
    }

    .focus-input100::after {
        font-family: Poppins-Regular, serif;
        font-size: 15px;
        color: #999999;
        line-height: 1.2;

        content: attr(data-placeholder);
        display: block;
        width: 100%;
        position: absolute;
        top: 16px;
        left: 0px;
        padding-left: 5px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
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

    .btn-show-pass {
        font-size: 15px;
        color: #999999;

        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        align-items: center;
        position: absolute;
        height: 100%;
        top: 0;
        right: 0;
        padding-right: 5px;
        cursor: pointer;
        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }

    .container-login100-form-btn {
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        padding-top: 13px;
    }

    .wrap-login100-form-btn {
        width: 100%;
        display: block;
        position: relative;
        z-index: 1;
        border-radius: 25px;
        overflow: hidden;
        margin: 0 auto;
    }

    .login100-form-bgbtn {
        position: absolute;
        z-index: -1;
        width: 300%;
        height: 100%;
        background: #a64bf4;
        background: -webkit-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: -o-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: -moz-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        top: 0;
        left: -100%;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
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
        align-items: right;
        padding: 0 20px;
        width: 40%;
        height: 50px;
    }

    .wrap-login100-form-btn:hover .login100-form-bgbtn {
        left: 0;
    }

    @media (max-width: 576px) {
        .wrap-login100 {
            padding: 77px 15px 33px 15px;
        }
    }

    .validate-input {
        position: relative;
    }

    .alert-validate::before {
        content: attr(data-validate);
        position: absolute;
        max-width: 70%;
        background-color: #fff;
        border: 1px solid #c80000;
        border-radius: 2px;
        padding: 4px 25px 4px 10px;
        top: 50%;
        -webkit-transform: translateY(-50%);
        -moz-transform: translateY(-50%);
        -ms-transform: translateY(-50%);
        -o-transform: translateY(-50%);
        transform: translateY(-50%);
        right: 0;
        pointer-events: none;

        font-family: Poppins-Regular, serif;
        color: #c80000;
        font-size: 13px;
        line-height: 1.4;
        text-align: left;

        visibility: hidden;
        opacity: 0;

        -webkit-transition: opacity 0.4s;
        -o-transition: opacity 0.4s;
        -moz-transition: opacity 0.4s;
        transition: opacity 0.4s;
    }

    .alert-validate::after {
        content: "\f06a";
        font-family: FontAwesome, serif;
        font-size: 16px;
        color: #c80000;

        display: block;
        position: absolute;
        background-color: #fff;
        top: 50%;
        -webkit-transform: translateY(-50%);
        -moz-transform: translateY(-50%);
        -ms-transform: translateY(-50%);
        -o-transform: translateY(-50%);
        transform: translateY(-50%);
        right: 5px;
    }

    .alert-validate:hover:before {
        visibility: visible;
        opacity: 1;
    }

    @media (max-width: 992px) {
        .alert-validate::before {
            visibility: visible;
            opacity: 1;
        }
    }
</style>
