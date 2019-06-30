<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Title -->
        <h1 style="text-shadow:1px 1px 0 #444"><strong>Cães</strong></h1>

        <!-- Slogan -->
        <h2><strong>Ajude a encontrar estes animais.</strong></h2>

        <!-- Sticky Filters -->
        <div class="w3-row-padding" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar" style="margin-bottom: 25px;">
                <div class="dropdown">
                    <button class="dropbtn">Concelho
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Sexo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Idade
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Porte
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Raça
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Tipo de pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Comprimento do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Cor do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
            </div>
        </div>

        <div v-if="selAnimal!==null"> {{this.$session.set('animal', selAnimal)}} </div>

        <!-- First Photo Grid-->
        <div class="w3-row-padding" style="margin-top: 25px;">
            <div class="w3-quarter w3-container w3-margin-bottom"
                 v-for="cao in caesFilter[page]" :key="cao.ID">
                <router-link to="/VerAnimalPerdido">
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
        <nav class="w3-center" v-if="caesFilter.length>8" style="margin-bottom: 25px;">
            <div class="w3-bar">
                <button class="w3-button" v-bind:disabled="page===0" v-on:click="page -= 1">
                    Anterior
                </button>
                <button class="w3-button"
                        v-if="page<Math.floor(caesFilter.length/nrPerPage) && p+page>=1"
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
                        v-bind:disabled="page===Math.floor(caesFilter.length/nrPerPage)"
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
  name: 'PerdidosCaes',

  data: () => ({
    caes: [],
    page: 0,
    nrPerPage: 12,
    selAnimal: null
  }),

  mounted: function () {
    if (this.$session.has('user')) {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get(this.$axiosurl + 'CaesPerdidos?email=' + this.$session.get('user')[0])
        .then(response => {
          this.caes = response.data.caes
        })
        .catch(err => {
          console.log(err)
        })
    } else {
      axios.defaults.headers['Content-Type'] = 'application/json'
      axios
        .get(this.$axiosurl + 'CaesPerdidos')
        .then(response => {
          this.caes = response.data.caes
        })
        .catch(err => {
          console.log(err)
        })
    }
  },

  computed: {
    caesFilter: function () {
      // todo: aplica filtros
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
    .navbar a {
        float: left;
        font-size: 16px;
        color: white;
        text-align: center;
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

    .navbar a:hover, .dropdown:hover .dropbtn {
        background-color: rgba(0,0,0,0.2);
    }

    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
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
