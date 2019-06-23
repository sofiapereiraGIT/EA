<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <div v-if="selCanilEmail!==''"> {{this.$session.set('email', selCanilEmail)}} </div>

        <!-- Sticky Filter Concelho -->
        <div class="w3-container" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="w3-dropdown-hover" style="margin-bottom: 25px;">
                <button class="w3-button w3-black fixed-top" style="padding: 10px; width: 200px;" v-if="selConcelho===''">Concelho</button>
                <button class="w3-button w3-black fixed-top" style="padding: 10px; width: 200px;" v-else>{{selConcelho}}</button>
                <div class="w3-dropdown-content w3-bar-block w3-border" style="width: 200px;">
                    <option class="w3-bar-item w3-button"
                            v-for="concelho in concelhos" :key="concelho"
                            v-on:click="selConcelho=concelho">
                        {{concelho}}
                    </option>
                    <option class="w3-bar-item w3-button" v-on:click="selConcelho=''">
                        Remover filtro
                    </option>
                </div>
            </div>
        </div>

        <!-- First Photo Grid-->
        <div class="w3-row-padding" style="margin-top: 25px;">
            <div class="w3-quarter w3-container w3-margin-bottom"
                 v-for="canil in canisDoSelconcelho" :key="canil.email">
                <router-link to="/CanilPerfil">
                    <img
                        v-if="canil.fotografia==='' || canil.fotografia===null"
                        v-on:click="selCanilEmail=canil.email; this.$session.set('email', selCanilEmail)"
                        src="../../assets/user.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                    <img
                        v-else
                        v-on:click="selCanilEmail=canil.email; this.$session.set('email', selCanilEmail)"
                        v-bind:src="canil.fotografia" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
                <div class="w3-container w3-white">
                    <router-link to="/CanilPerfil"
                         v-on:click="selCanilEmail=canil.email; this.$session.set('email', selCanilEmail)"
                         style="text-decoration: none; color: black">
                        <strong>{{canil.nome}}</strong>
                    </router-link>
                    <p style=" line-height: 0.1;">{{canil.concelho}}</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Canis',

  data: () => ({
    canis: [],
    selCanilEmail: '',
    selConcelho: ''
  }),

  mounted: function () {
    if (this.$session.has('user')) {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get('http://localhost:8080/procura4patas/Canis?email=' + this.$session.get('user')[0])
        .then(response => {
          this.canis = response.data
        })
        .catch(err => {
          console.log(err)
        })
    } else {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get('http://localhost:8080/procura4patas/Canis')
        .then(response => {
          this.canis = response.data

          function compare (a, b) {
            if (a.nome < b.nome) { return -1 }
            if (a.nome > b.nome) { return 1 }
            return 0
          }

          this.canis.sort(compare)
        })
        .catch(err => {
          console.log(err)
        })
    }
  },

  computed: {
    concelhos: function () {
      var concelhos = []

      this.canis.forEach(function (c) {
        if (!(concelhos.includes(c.concelho))) {
          concelhos.push(c.concelho)
        }
      })

      return concelhos.sort()
    },

    canisDoSelconcelho: function () {
      var canisDoSelconcelho = []
      var selConcelho = this.selConcelho

      this.canis.forEach(function (c) {
        if (selConcelho === '') {
          canisDoSelconcelho.push(c)
        } else if (selConcelho === c.concelho) {
          canisDoSelconcelho.push(c)
        }
      })

      return canisDoSelconcelho
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
</style>
