import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/geral/HelloWorld'
import AboutUs from '@/components/geral/AboutUs'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/AboutUs',
      name: 'AboutUs',
      component: AboutUs
    }
  ]
})
