import Vue from 'vue'
import Router from 'vue-router'
import HomePage from '../components/geral/HomePage'
import Canis from '../components/geral/Canis'
import CanilPerfil from '../components/geral/CanilPerfil'
import Adotar from '../components/geral/Adotar'
import AdotarCaes from '../components/geral/AdotarCaes'
import AdotarGatos from '../components/geral/AdotarGatos'
import Perdidos from '../components/geral/Perdidos'
import PerdidosCaes from '../components/geral/PerdidosCaes'
import PerdidosGatos from '../components/geral/PerdidosGatos'
import UserPerfil from '../components/geral/UserPerfil'
import AboutUs from '../components/geral/AboutUs'
import Login from '../components/geral/Login'
import CanilHomePage from '../components/canil/CanilHomePage'
import CanilPerfilEdit from '../components/canil/CanilPerfilEdit'
import UserHomePage from '../components/cidadao/UserHomePage'
import UserPerfilEdit from '../components/cidadao/UserPerfilEdit'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HomePage',
      component: HomePage
    },
    {
      path: '/Canis',
      name: 'Canis',
      component: Canis
    },
    {
      path: '/CanilPerfil',
      name: 'CanilPerfil',
      component: CanilPerfil
    },
    {
      path: '/Adotar',
      name: 'Adotar',
      component: Adotar
    },
    {
      path: '/AdotarCaes',
      name: 'AdotarCaes',
      component: AdotarCaes
    },
    {
      path: '/AdotarGatos',
      name: 'AdotarGatos',
      component: AdotarGatos
    },
    {
      path: '/Perdidos',
      name: 'Perdidos',
      component: Perdidos
    },
    {
      path: '/PerdidosCaes',
      name: 'PerdidosCaes',
      component: PerdidosCaes
    },
    {
      path: '/PerdidosGatos',
      name: 'PerdidosGatos',
      component: PerdidosGatos
    },
    {
      path: '/UserPerfil',
      name: 'UserPerfil',
      component: UserPerfil
    },
    {
      path: '/AboutUs',
      name: 'AboutUs',
      component: AboutUs
    },
    {
      path: '/Login',
      name: 'Login',
      component: Login
    },
    {
      path: '/CanilHomePage',
      name: 'CanilHomePage',
      component: CanilHomePage
    },
    {
      path: '/CanilPerfilEdit',
      name: 'CanilPerfilEdit',
      component: CanilPerfilEdit
    },
    {
      path: '/CanilPerfilEdit',
      name: 'CanilPerfilEdit',
      component: CanilPerfilEdit
    },
    {
      path: '/UserHomePage',
      name: 'UserHomePage',
      component: UserHomePage
    },
    {
      path: '/UserPerfilEdit',
      name: 'UserPerfilEdit',
      component: UserPerfilEdit
    }
  ]
})
