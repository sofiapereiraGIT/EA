<template>
  <div id="app">
    <Header/>
    <PerdidosCaes/>
    <Footer/>
  </div>
</template>

<script>
import Header from '@/components/geral/layout/Header'
import Footer from '@/components/geral/layout/Footer'
import HomePage from './components/geral/HomePage'
import Canis from '@/components/geral/Canis'
import AdotarCaes from './components/geral/AdotarCaes'
import AdotarGatos from './components/geral/AdotarGatos'
import Adotar from './components/geral/Adotar'
import Perdidos from './components/geral/Perdidos'
import AboutUs from './components/geral/AboutUs'
import Login from './components/geral/Login'
import CanilPerfil from './components/geral/CanilPerfil'
import CanilPerfilEdit from './components/canil/CanilPerfilEdit'
import UserPerfil from './components/geral/UserPerfil'
import UserPerfilEdit from './components/cidadao/UserPerfilEdit'
import PerdidosCaes from './components/geral/PerdidosCaes'
import PerdidosGatos from './components/geral/PerdidosGatos'

export default {
  name: 'App',
  components: { PerdidosGatos, PerdidosCaes, UserPerfilEdit, UserPerfil, CanilPerfilEdit, CanilPerfil, Login, AboutUs, Perdidos, Adotar, AdotarCaes, AdotarGatos, HomePage, Header, Footer, Canis }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: black;
  margin-top: 100px;
}
</style>
