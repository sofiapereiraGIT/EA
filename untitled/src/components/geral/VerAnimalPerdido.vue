<template>
    <div>
        <div class="limiter ">
            <div class="container-login100">
                <div class="wrap-login100 p-t-190 p-b-30 row">
                    <form class="login100-form validate-form">
                        <div class="columnAlign">
                            <div class="login100-form-avatar">
                                <img v-if="animalData.Fotografia==='' || animalData.Fotografia===null" src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image">
                                <img v-else :src="require('../../../img/'+animalData.Fotografia)" style="margin-bottom: 10px" class="img w3-image">
                            </div>
                            <br>
                            <div>
                                <router-link v-if="animalData.UserType===0" class="txt1" to="/UserPerfil">
                                    Ver Perfil do Utilizador
                                </router-link>
                                <router-link v-if="animalData.UserType===1" class="txt1" to="/CanilPerfil">
                                    Ver Perfil do Canil
                                </router-link>
                            </div>
                            <br>
                        </div>
                        <div class="column">
                            <br>
                            <div class="column2">
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-user fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Nome: {{ animalData.Nome }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-paw fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Tipo: {{ animalData.Discriminator }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-id-card-alt fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Raça: {{ animalData.Raca }} <br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-venus-mars fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Sexo: {{ animalData.Sexo }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-building fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Concelho: {{ animalData.Concelho }}
                                    <br>
                                    <div class="w3-large w3-margin-bottom" style="text-align: left">
                                        <br/>
                                        <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-margin-right"></i>
                                        Descrição: {{ animalData.Descricao }}<br>
                                    </div>
                                </div>
                            </div>
                            <div class="column2">
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-hourglass-half fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Idade: {{ animalData.Idade }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-ruler-combined fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Porte: {{ animalData.Porte }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-palette fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Cor do Pêlo: {{ animalData.CorPelo }}<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-ruler-horizontal fa-fw w3-hover-text-black w3-margin-right"></i>
                                    Comprimento do Pêlo: {{ animalData.CompPelo }}<br>
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

export default {
  name: 'VerAnimalPerdidos',
  data: () => ({
    animalData: {}
  }),
  mounted: function () {
    this.animalData = this.$session.get('animal')
    if (this.animalData.Descricao === null) {
      this.animalData.Descricao = 'Sem Descrição'
    }
    this.animalData.Discriminator = this.getDiscriminator(this.animalData.Discriminator)
    this.animalData.Sexo = this.getSexo(this.animalData.Sexo)
    this.animalData.Idade = this.getIdade(this.animalData.Idade)
    this.animalData.CompPelo = this.getCompPelo(this.animalData.CompPelo)
    this.animalData.Porte = this.getPorte(this.animalData.Porte)
    this.animalData.Concelho = this.animalData.Concelho
  },
  methods: {
    getDiscriminator (discriminator) {
      if (discriminator === 'C') {
        return 'Cão'
      }
      if (discriminator === 'G') {
        return 'Gato'
      }
    },
    getSexo (sexo) {
      if (sexo === 'M') {
        return 'Macho'
      } else {
        return 'Fêmea'
      }
    },
    getIdade (idade) {
      if (idade === 'B') {
        return 'Bebe (Menos de 6 Meses)'
      }
      if (this.animalData.Idade === 'J') {
        return 'Jovem'
      }
      if (idade === 'A') {
        return 'Adulto'
      }
    },
    getCompPelo (compPelo) {
      if (compPelo === 'C') {
        return 'Curto'
      }
      if (compPelo === 'M') {
        return 'Médio'
      }
      if (compPelo === 'L') {
        return 'Longo'
      }
      if (compPelo === 'I') {
        return 'Indefinido'
      }
      if (compPelo === 'S') {
        return 'Sem pêlo'
      }
    },
    getPorte (porte) {
      if (porte === 'P') {
        return 'Pequeno'
      }
      if (porte === 'M') {
        return 'Médio'
      }
      if (porte === 'G') {
        return 'Grande'
      }
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

    /* Hide the browser's default checkbox */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
        height: 0;
        width: 0;
    }

    /* On mouse-over, add a grey background color */
    .container:hover input ~ .checkmark {
        background-color: #ccc;
    }

    /* When the checkbox is checked, add a blue background */
    .container input:checked ~ .checkmark {
        background-color: #2196F3;
    }

    /* Show the checkmark when checked */
    .container input:checked ~ .checkmark:after {
        display: inline-block;
    }

    /* Style the checkmark/indicator */
    .container .checkmark:after {
        left: 9px;
        top: 5px;
        width: 5px;
        height: 10px;
        border: solid white;
        border-width: 0 3px 3px 0;
        -webkit-transform: rotate(45deg);
        -ms-transform: rotate(45deg);
        transform: rotate(45deg);
    }

    /* Create two equal columns that floats next to each other */
    .columnAlign {
        float: left;
        width: 50%;
        padding: 60px 0;
        text-align: center;

    }

    .column {
        float: left;
        width: 50%;
        padding: 60px 0px;
    }

    .column2 {
        float: left;
        width: 50%;
        padding: 10px;
        display:inline-block;
        text-align: left;
    }

    /* Clear floats after the columns */
    .row:after {
        content: "";
        display: table;
        clear: both;
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

    .login100-form-title i {
        font-size: 60px;
    }

    @media (max-width: 576px) {
        .wrap-login100 {
            padding: 77px 15px 33px 15px;
        }
    }
</style>
