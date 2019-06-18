<template>
  <div>
    <!-- Imagem Principal + Slogan -->
    <div class="bgimg-1 w3-display-container">
      <div class="w3-display-middle" style="white-space:nowrap;">
        <span class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity">Completamos Famílias</span>
      </div>
    </div>
    <!-- Nº de Gatos e Cães para Adotar-->
    <div class="w3-row w3-center w3-light-grey w3-padding-16">
      <div class="w3-half w3-section">
        <span class="w3-xlarge">{{nrCaes}}</span><br>
          Cães Para Adotar
      </div>
      <div class="w3-half w3-section">
        <span class="w3-xlarge">{{nrGatos}}</span><br>
          Gatos Para Adotar
      </div>
    </div>
    <!-- Texto Para Adoção -->
    <div class="w3-content w3-container w3-padding-64">
      <h3 class="w3-center">ADOÇÃO</h3>
      <div class="w3-row">
        <div class="w3-col m6 w3-padding-large">
          <p style="text-align: justify;">Welcome to my website. I am lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
        <div class="w3-col m6 w3-padding-large">
          <p style="text-align: justify;">Welcome to my website. I am lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
      </div>
    </div>
    <!-- Texto Para FAT-->
    <div class="w3-content w3-container w3-padding-64">
      <div class="w3-row">
        <div class="w3-col m6 w3-center" style="padding-top: 25px">
        <img src="../../assets/FAT.jpg" class="w3-round w3-image w3-hover-opacity-off">
      </div>
        <div class="w3-col m6 w3-padding-large">
          <h3 class="w3-center">SEJA FAT</h3>
          <p style="text-align: justify;">Welcome to my website. I am lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
      </div>
    </div>
    <!-- Texto Para Perdidos -->
    <div class="w3-content w3-container w3-padding-64">
      <h3 class="w3-center">PERDIDOS</h3>
      <div class="w3-row">
        <div class="w3-col m6 w3-padding-large">
          <p style="text-align: justify;">Welcome to my website. I am lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
          <div class="w3-col m6 w3-center" style="padding-top: 25px">
            <img src="../../assets/FAT.jpg" class="w3-round w3-image w3-hover-opacity-off">
          </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'HomePage',
  data: () => ({
    nrCaes: 0,
    nrGatos: 0
  }),
  mounted: function () {
    axios.defaults.headers['Content-Type'] = 'application/json'
    axios.post('http://localhost:8080/procura4patas/NumeroAnimais', this.credentials)
      .then(response => {
        this.nrCaes = response.data.caes
        this.nrGatos = response.data.gatos
        console.log(this.nrCaes)
        console.log(this.nrGatos)
      }).catch()
  }
}
</script>

<style scoped>
.bgimg-1, .bgimg-2, .bgimg-3 {
  background-attachment: fixed;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* First image (Logo. Full height) */
.bgimg-1 {
  background-image: url('../../assets/homepage.jpg');
  min-height: 100%;
}

.w3-wide {letter-spacing: 10px;}

/* Turn off parallax scrolling for tablets and phones */
@media only screen and (max-device-width: 1600px) {
  .bgimg-1, .bgimg-2, .bgimg-3 {
    background-attachment: scroll;
    min-height: 400px;
  }
}
</style>
