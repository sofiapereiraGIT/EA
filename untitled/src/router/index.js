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
import Registar from '../components/geral/Registar'
import CanilHomePage from '../components/canil/CanilHomePage'
import CanilPerfilEdit from '../components/canil/CanilPerfilEdit'
import UserHomePage from '../components/cidadao/UserHomePage'
import UserPerfilEdit from '../components/cidadao/UserPerfilEdit'
import AddAnimalParaAdocao from '../components/Common/AddAnimalParaAdocao'
import GerirAnimais from '../components/Common/GerirAnimais'
import EditAnimalAdocao from '../components/Common/EditAnimalAdocao'
import EditAnimalPerdido from '../components/cidadao/EditAnimalPerdido'
import VerAnimalAdotarUC from '../components/geral/VerAnimalAdotarUC'
import VerAnimalPerdido from '../components/geral/VerAnimalPerdido'
import Pedidos from '../components/Common/Pedidos'

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
      path: '/Registar',
      name: 'Registar',
      component: Registar
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
      path: '/UserHomePage',
      name: 'UserHomePage',
      component: UserHomePage
    },
    {
      path: '/UserPerfilEdit',
      name: 'UserPerfilEdit',
      component: UserPerfilEdit
    },
    {
      path: '/AddAnimalParaAdocao',
      name: 'AddAnimalParaAdocao',
      component: AddAnimalParaAdocao
    },
    {
      path: '/GerirAnimais',
      name: 'GerirAnimais',
      component: GerirAnimais
    },
    {
      path: '/EditAnimalAdocao',
      name: 'EditAnimalAdocao',
      component: EditAnimalAdocao
    },
    {
      path: '/EditAnimalPerdido',
      name: 'EditAnimalPerdido',
      component: EditAnimalPerdido
    },
    {
      path: '/VerAnimalAdotarUC',
      name: 'VerAnimalAdotarUC',
      component: VerAnimalAdotarUC
    },
    {
      path: '/VerAnimalPerdido',
      name: 'VerAnimalPerdido',
      component: VerAnimalPerdido
    },
    {
      path: '/Pedidos',
      name: 'Pedidos',
      component: Pedidos
    }
  ]
})
