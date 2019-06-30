<template>
    <div class="w3-top">
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="w3-bar" id="myNavbar">
            <a class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-right" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
            <router-link v-if="!userLogin()" to="/" class="w3-bar-item w3-button" style="float:left"><i class="fa fa-home"></i> PROCURA4PATAS</router-link>
            <router-link v-if="userLogin() && utilizadorC()" to="/UserHomePage" class="w3-bar-item w3-button" style="float:left"><i class="fa fa-home"></i> PROCURA4PATAS</router-link>
            <router-link v-if="userLogin() && !utilizadorC()" to="/CanilHomePage" class="w3-bar-item w3-button" style="float:left"><i class="fa fa-home"></i> PROCURA4PATAS</router-link>
            <router-link to="/Login" class="w3-bar-item w3-button w3-hide-small" style="float:right" v-if="user === null"><i class="fa fa-user"></i> LOGIN</router-link>
            <button class="w3-bar-item w3-button w3-hide-small" style="float:right" v-if="user !== null" v-on:click="logout()"><i class="fa fa-user"></i> LOGOUT</button>
            <router-link to="/AboutUs" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fa fa-drivers-license-o"></i> SOBRE NÓS</router-link>
            <router-link to="/Perdidos" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fa fa-paw"></i> PERDIDOS</router-link>
            <router-link to="/Adotar" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fas fa-hand-holding-heart"></i> ADOÇÃO</router-link>
            <router-link to="/Canis" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fas fa-globe"></i> CANIS</router-link>
        </div>
    </div>
</template>

<script>
import router from '../../../router/index'

export default {
  name: 'Header',
  data () {
    return {
      user: null
    }
  },
  mounted: function () {
    if (this.$session.has('user')) {
      this.user = this.$session.get('user')
    }
  },
  methods: {
    logout () {
      if (this.$session.exists()) {
        console.log('Session Destroyed')
        this.$session.destroy()
        this.user = null
        router.push('/')
      }
    },
    userLogin () {
      return this.$session.has('user')
    },
    utilizadorC () {
      return this.$session.get('user')[1] === 0
    }
  }
}
// Change style of navbar on scroll
window.onscroll = function () { myFunction() }

function myFunction () {
  const navbar = document.getElementById('myNavbar')
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    navbar.className = 'w3-bar' + ' w3-card' + ' w3-animate-top' + ' w3-white'
  } else {
    navbar.className = navbar.className.replace('w3-card w3-animate-top w3-white', 'w3-white')
  }
}
</script>

<style scoped>
</style>
