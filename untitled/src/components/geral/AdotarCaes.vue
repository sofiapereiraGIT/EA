<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Title -->
        <h1 style="text-shadow:1px 1px 0 #444"><strong>Cães</strong></h1>

        <!-- Sticky Filters -->
        <div class="w3-row-padding" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar" style="margin-bottom: 25px;">
                <div class="dropdown">
                    <button class="dropbtn">Concelho
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-for="concelho in concelhos" :key="concelho"
                            v-on:click="selConcelho=concelho, page=0">
                            {{concelho}}
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Canil
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-for="canil in canis" :key="canil.email"
                            v-on:click="selCanil=canil.email, page=0">
                            {{canil.nome}}
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Estado
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="2">
                        <option
                            style="color: black"
                            v-on:click="selEstado='E', page=0">
                            Encontrado
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selEstado='C', page=0">
                            Precisa de FAT
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Sexo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="2">
                        <option
                            style="color: black"
                            v-on:click="selSexo='F', page=0">
                            Feminino
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selSexo='M', page=0">
                            Masculino
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Idade
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="3">
                        <option
                            style="color: black"
                            v-on:click="selIdade='B', page=0">
                            Bebé
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selIdade='J', page=0">
                            Jovem
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selIdade='A', page=0">
                            Adulto
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Porte
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-on:click="selPorte='P', page=0">
                            Pequeno
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selPorte='M', page=0">
                            Médio
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selPorte='G', page=0">
                            Grande
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selPorte='I', page=0">
                            Indefinido
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Raça
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-on:click="selRaca='Beagle', page=0">
                            Beagle
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Buldogue', page=0">
                            Buldogue
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Golden Retriever', page=0">
                            Golden Retriever
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Lavrador', page=0">
                            Lavrador
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Pastor Alemão', page=0">
                            Pastor Alemão
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Poodle', page=0">
                            Poodle
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Rottwiller', page=0">
                            Rottwiller
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Outro', page=0">
                            Outra raça
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selRaca='Sem Raça Definida', page=0">
                            Sem raça definida
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Comprimento do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-on:click="selCompPelo='S', page=0">
                            Sem pêlo
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCompPelo='C', page=0">
                            Curto
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCompPelo='M', page=0">
                            Médio
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCompPelo='L', page=0">
                            Longo
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Cor do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Bege', page=0">
                            Bege
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Branco', page=0">
                            Branco
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Castanho', page=0">
                            Castanho
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Cizento', page=0">
                            Cinzento
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Laranja', page=0">
                            Laranja
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Preto', page=0">
                            Preto
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='Indefinido', page=0">
                            Indefinido
                        </option>
                    </select>
                </div>
            </div>
        </div>

        <div v-if="selAnimal!==null"> {{this.$session.set('animal', selAnimal)}} </div>

        <!-- First Photo Grid-->
        <div class="w3-row-padding" style="margin-top: 25px;">
            <div class="w3-quarter w3-container w3-margin-bottom"
                 v-for="cao in caesFilter[page]" :key="cao.ID">
                <router-link to="/VerAnimalAdotarUC">
                    <img
                        v-if="cao.Fotografia==='' || cao.Fotografia===null"
                        v-on:click="selAnimal=cao"
                        src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                    <img
                        v-else
                        v-on:click="selAnimal=cao"
                        :src="require('../../../img/'+cao.Fotografia)" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
                <div class="w3-container w3-white">
                    <router-link to="/VerAnimalAdotarUC"
                                 v-if="cao.Nome==='' || cao.Nome===null"
                                 v-on:click="selAnimal=cao"
                                 style="text-decoration: none; color: black">
                        <strong>Sem nome</strong>
                    </router-link>
                    <router-link to="/VerAnimalAdotarUC"
                                 v-else
                                 v-on:click="selAnimal=cao"
                                 style="text-decoration: none; color: black">
                        <strong>{{cao.Nome}}</strong>
                    </router-link>
                </div>
            </div>
        </div>

        <!-- Pagination -->
        <nav class="w3-center" v-if="(caesFilter.length-1)>8" style="margin-bottom: 25px;">
            <div class="w3-bar">
                <button class="w3-button" v-bind:disabled="page===0" v-on:click="page -= 1">
                    Anterior
                </button>
                <button class="w3-button"
                        v-if="page<Math.floor((caesFilter.length-1)/nrPerPage) && p+page>=1"
                        v-bind:class="{ 'w3-green':  page  === p+page-1 }"
                        v-for="p in [0,1,2]" :key="p+page"
                        v-on:click="page = p+page-1">
                    {{p+page}}
                </button>
                <button class="w3-button"
                        v-if="page===Math.floor((caesFilter.length-1)/nrPerPage)"
                        v-bind:class="{ 'w3-green':  page  === Math.floor((caesFilter.length-1)/nrPerPage)+p-1 }"
                        v-for="p in [-1,0,1]" :key="Math.floor((caesFilter.length-1)/nrPerPage)+p"
                        v-on:click="page = Math.floor((caesFilter.length-1)/nrPerPage)+p-1">
                    {{Math.floor((caesFilter.length-1)/nrPerPage)+p}}
                </button>
                <button class="w3-button"
                        v-bind:disabled="page===Math.floor((caesFilter.length-1)/nrPerPage)"
                        v-on:click="page += 1">
                    Próximo
                </button>
            </div>
        </nav>
    </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'AdotarCaes',

  data: () => ({
    caes: [],
    canis: [],
    page: 0,
    nrPerPage: 12,
    selAnimal: null,

    selConcelho: '',
    selCanil: '',
    selEstado: '',
    selSexo: '',
    selIdade: '',
    selPorte: '',
    selRaca: '',
    selCompPelo: '',
    selCorPelo: ''
  }),

  mounted: function () {
    if (this.$session.has('user')) {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get(this.$axiosurl + 'CaesAdotar?email=' + this.$session.get('user')[0])
        .then(response => {
          this.caes = response.data.caes
        })
        .catch(err => {
          console.log(err)
        })
    } else {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get(this.$axiosurl + 'CaesAdotar')
        .then(response => {
          this.caes = response.data.caes
        })
        .catch(err => {
          console.log(err)
        })
    }

    if (!this.$session.has('canis') || this.$session.get('canis')[1] > 15) {
      if (this.$session.has('user')) {
        axios.defaults.headers['Content-Type'] = 'application/json'
        axios.get(this.$axiosurl + 'Canis?email=' + this.$session.get('user')[0])
          .then(response => {
            this.canis = response.data

            function compare (a, b) {
              if (a.nome < b.nome) { return -1 }
              if (a.nome > b.nome) { return 1 }
              return 0
            }

            this.canis.sort(compare)
            this.$session.set('canis', [this.canis, 1])
          })
          .catch(err => {
            console.log(err)
          })
      } else {
        axios.defaults.headers['Content-Type'] = 'application/json'
        axios.get(this.$axiosurl + 'Canis')
          .then(response => {
            this.canis = response.data

            function compare (a, b) {
              if (a.nome < b.nome) { return -1 }
              if (a.nome > b.nome) { return 1 }
              return 0
            }

            this.canis.sort(compare)
            this.$session.set('canis', [this.canis, 1])
          })
          .catch(err => {
            console.log(err)
          })
      }
    } else {
      this.canis = this.$session.get('canis')[0]
      var timesC = this.$session.get('canis')[1] + 1
      this.$session.set('canis', [this.canis, timesC])
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

    caesFilter: function () {
      /* var canisDoSelconcelho = []
      var selConcelho = this.selConcelho

      this.canis.forEach(function (c) {
        if (selConcelho === '') {
          canisDoSelconcelho.push(c)
        } else if (selConcelho === c.concelho) {
          canisDoSelconcelho.push(c)
        }
      })

      // todo canisDoSelconcelho + selCanis email

      var caesFilter = []
      var selEstado = this.selEstado
      var selSexo = this.selSexo
      var selIdade = this.selIdade
      var selPorte = this.selPorte
      var selRaca = this.selRaca
      var selCompPelo = this.selCompPelo
      var selCorPelo = this.selCorPelo

      this.caes.forEach(function (c) {
        if ((selEstado === '' || selEstado === c.Estado) &&
            (selSexo === '' || selSexo === c.Sexo) &&
            (selIdade === '' || selIdade === c.Idade) &&
            (selPorte === '' || selPorte === c.Porte) &&
            (selRaca === '' || selRaca === c.Raca) &&
            (selCompPelo === '' || selCompPelo === c.CompPelo) &&
            (selCorPelo === '' || selCorPelo === c.CorPelo)) {
          caesFilter.push(c)
        }
      }) */

      var caesFilter = this.caes

      var i = 0
      var p = 0
      var page = []
      page[p] = []
      var nrPerPage = this.nrPerPage

      caesFilter.forEach(function (c) {
        if (i < nrPerPage) {
          page[p].push(c)
          page.push(c)
          i++
        } else {
          p++
          page[p] = []
          i = 0
          i++
          page[p].push(c)
          page.push(c)
        }
      })

      return page
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

    .navbar {
        overflow: hidden;
        background-color: white;
        display: inline-block;
        border: 1px solid #555;
    }
    .navbar option {
        float: left;
        font-size: 16px;
        color: white;
        text-align: left;
        padding: 14px 16px;
        text-decoration: none;
    }

    .dropdown {
        float: left;
        overflow: hidden;
    }

    .dropdown .dropbtn {
        font-size: 16px;
        border: none;
        outline: none;
        color: black;
        padding: 14px 16px;
        background-color: inherit;
        font-family: inherit;
        margin: 0;
    }

    .navbar option:hover, .dropdown:hover .dropbtn {
        background-color: rgba(0,0,0,0.2);
    }

    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
        size: 3;
    }

    .dropdown-content a {
        float: none;
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
        text-align: left;
    }

    .dropdown-content a:hover {
        background-color: #ddd;
    }

    .dropdown:hover .dropdown-content {
        display: block;
    }
</style>
