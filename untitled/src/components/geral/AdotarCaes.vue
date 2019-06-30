<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Title -->
        <h1 style="text-shadow:1px 1px 0 #444"><strong>Cães</strong></h1>

        <!-- Sticky Filters -->
        <div class="w3-row-padding" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar" style="margin-bottom: 25px;">
                <div class="dropdown">
                    <button
                        v-if="selConcelho===''"
                        v-on:click="selConcelho='', page=0"
                        class="dropbtn">
                        Concelho
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <button
                        v-else
                        v-on:click="selConcelho='', page=0"
                        class="dropbtn">
                        {{selConcelho}}
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-for="concelho in concelhos" :key="concelho"
                            v-on:click="selConcelho=concelho, page=0">
                            {{concelho}}
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selConcelho='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button
                        v-if="selCanilNome===''"
                        v-on:click="selCanilEmail='', selCanilNome='', page=0"
                        class="dropbtn">
                        Canil
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <button
                        v-else
                        v-on:click="selCanilEmail='', selCanilNome='', page=0"
                        class="dropbtn">
                        {{selCanilNome}}
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <select class="dropdown-content" size="4">
                        <option
                            style="color: black"
                            v-for="canil in canis" :key="canil.email"
                            v-on:click="selCanilEmail=canil.email, selCanilNome=canil.nome, page=0">
                            {{canil.nome}}
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selCanilEmail=canil.email, selCanilNome=canil.nome, page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selEstado===''" v-on:click="selEstado='', page=0" class="dropbtn"> Estado <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selEstado==='E'" v-on:click="selEstado='', page=0" class="dropbtn"> Encontrado <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selEstado==='C'" v-on:click="selEstado='', page=0" class="dropbtn"> Precisa de FAT <i class="fa fa-caret-down"></i> </button>
                    <select class="dropdown-content" size="3">
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
                        <option
                            style="color: black"
                            v-on:click="selEstado='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selSexo===''" v-on:click="selSexo='', page=0" class="dropbtn"> Sexo <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selSexo==='F'" v-on:click="selSexo='', page=0" class="dropbtn"> Fêmea <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selSexo==='M'" v-on:click="selSexo='', page=0" class="dropbtn"> Macho <i class="fa fa-caret-down"></i> </button>
                    <select class="dropdown-content" size="3">
                        <option
                            style="color: black"
                            v-on:click="selSexo='F', page=0">
                            Fêmea
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selSexo='M', page=0">
                            Macho
                        </option>
                        <option
                            style="color: black"
                            v-on:click="selSexo='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selIdade===''" v-on:click="selIdade='', page=0" class="dropbtn"> Idade <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selIdade==='B'" v-on:click="selIdade='', page=0" class="dropbtn"> Bebé <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selIdade==='J'" v-on:click="selIdade='', page=0" class="dropbtn"> Jovem <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selIdade==='A'" v-on:click="selIdade='', page=0" class="dropbtn"> Adulto <i class="fa fa-caret-down"></i> </button>
                    <select class="dropdown-content" size="4">
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
                        <option
                            style="color: black"
                            v-on:click="selIdade='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selPorte===''" v-on:click="selPorte='', page=0" class="dropbtn"> Porte <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selPorte==='P'" v-on:click="selPorte='', page=0" class="dropbtn"> Pequeno <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selPorte==='M'" v-on:click="selPorte='', page=0" class="dropbtn"> Médio <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selPorte==='G'" v-on:click="selPorte='', page=0" class="dropbtn"> Grande <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selPorte==='I'" v-on:click="selPorte='', page=0" class="dropbtn"> Indefinido <i class="fa fa-caret-down"></i> </button>
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
                        <option
                            style="color: black"
                            v-on:click="selPorte='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selRaca===''" v-on:click="selRaca='', page=0" class="dropbtn"> Raça <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Beagle'" v-on:click="selRaca='', page=0" class="dropbtn"> Beagle <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Buldogue'" v-on:click="selRaca='', page=0" class="dropbtn"> Buldogue <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Golden Retriever'" v-on:click="selRaca='', page=0" class="dropbtn"> Golden Retriever <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Lavrador'" v-on:click="selRaca='', page=0" class="dropbtn"> Lavrador <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Pastor Alemao'" v-on:click="selRaca='', page=0" class="dropbtn"> Pastor Alemão <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Poodle'" v-on:click="selRaca='', page=0" class="dropbtn"> Poodle <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Rottwiller'" v-on:click="selRaca='', page=0" class="dropbtn"> Rottwiller <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Outro'" v-on:click="selRaca='', page=0" class="dropbtn"> Outra raça <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selRaca==='Sem Raça Definida'" v-on:click="selRaca='', page=0" class="dropbtn"> Sem raça definida <i class="fa fa-caret-down"></i> </button>
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
                            v-on:click="selRaca='Pastor Alemao', page=0">
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
                        <option
                            style="color: black"
                            v-on:click="selRaca='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selCompPelo===''" v-on:click="selCompPelo='', page=0"  class="dropbtn"> Comprimento do pêlo <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCompPelo==='S'" v-on:click="selCompPelo='', page=0" class="dropbtn"> Sem pêlo <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCompPelo==='C'" v-on:click="selCompPelo='', page=0" class="dropbtn"> Curto <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCompPelo==='M'" v-on:click="selCompPelo='', page=0" class="dropbtn"> Médio <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCompPelo==='L'" v-on:click="selCompPelo='', page=0" class="dropbtn"> Longo <i class="fa fa-caret-down"></i> </button>
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
                        <option
                            style="color: black"
                            v-on:click="selCompPelo='', page=0">
                            Remover filtro
                        </option>
                    </select>
                </div>
                <div class="dropdown">
                    <button v-if="selCorPelo===''" v-on:click="selCorPelo='', page=0" class="dropbtn"> Cor do pêlo <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Bege'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Bege <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Branco'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Branco <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Castanho'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Castanho <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Cinzento'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Cinzento <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Laranja'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Laranja <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Preto'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Preto <i class="fa fa-caret-down"></i> </button>
                    <button v-if="selCorPelo==='Indefinido'" v-on:click="selCorPelo='', page=0" class="dropbtn"> Indefinido <i class="fa fa-caret-down"></i> </button>
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
                            v-on:click="selCorPelo='Cinzento', page=0">
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
                        <option
                            style="color: black"
                            v-on:click="selCorPelo='', page=0">
                            Remover filtro
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
        <nav class="w3-center" v-if="(caesFilter.length-1)>nrPerPage" style="margin-bottom: 25px;">
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
    utiComuns: [],
    concelhos: ['Amarante', 'Braga', 'Coimbra', 'Faro', 'Lisboa', 'Porto', 'Viana do Castelo'],

    page: 0,
    nrPerPage: 12,

    selAnimal: null,

    selConcelho: '',
    selCanilEmail: '',
    selCanilNome: '',
    selEstado: '',
    selSexo: '',
    selIdade: '',
    selPorte: '',
    selRaca: '',
    selCompPelo: '',
    selCorPelo: ''
  }),

  mounted: function () {
    /* get Animais */
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

    /* get Canis */
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

    /* get utiComuns */
    if (this.$session.has('user')) {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios.get(this.$axiosurl + 'UtilizadoresComuns?email=' + this.$session.get('user')[0])
        .then(response => {
          this.utiComuns = response.data
        })
        .catch(err => {
          console.log(err)
        })
    } else {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios.get(this.$axiosurl + 'UtilizadoresComuns')
        .then(response => {
          this.utiComuns = response.data
        })
        .catch(err => {
          console.log(err)
        })
    }
  },

  computed: {
    caesFilter: function () {
      var utiDoSelConcelho = []
      var selConcelho = this.selConcelho

      this.canis.forEach(function (c) {
        if (selConcelho === '') {
          utiDoSelConcelho.push(c)
        } else if (selConcelho === c.concelho) {
          utiDoSelConcelho.push(c)
        }
      })

      this.utiComuns.forEach(function (c) {
        if (selConcelho === '') {
          utiDoSelConcelho.push(c)
        } else if (selConcelho === c.concelho) {
          utiDoSelConcelho.push(c)
        }
      })

      var caesFilterConcelho = []

      this.caes.forEach(function (cao) {
        utiDoSelConcelho.forEach(function (uti) {
          if (uti.email === cao.UtilizadorEmail) {
            caesFilterConcelho.push(cao)
          }
        })
      })

      var caesFilter = []
      var selCanilEmail = this.selCanilEmail
      var selEstado = this.selEstado
      var selSexo = this.selSexo
      var selIdade = this.selIdade
      var selPorte = this.selPorte
      var selRaca = this.selRaca
      var selCompPelo = this.selCompPelo
      var selCorPelo = this.selCorPelo

      caesFilterConcelho.forEach(function (c) {
        if ((selCanilEmail === '' || selCanilEmail === c.UtilizadorEmail) &&
              (selEstado === '' || selEstado === c.Estado) &&
              (selSexo === '' || selSexo === c.Sexo) &&
              (selIdade === '' || selIdade === c.Idade) &&
              (selPorte === '' || selPorte === c.Porte) &&
              (selRaca === '' || selRaca === c.Raca) &&
              (selCompPelo === '' || selCompPelo === c.CompPelo) &&
              (selCorPelo === '' || selCorPelo === c.CorPelo)) {
          caesFilter.push(c)
        }
      })

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

    .dropdown-content option {
        float: none;
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
        text-align: left;
    }

    .dropdown-content option:hover {
        background-color: #ddd;
    }

    .dropdown:hover .dropdown-content {
        display: block;
    }
</style>
