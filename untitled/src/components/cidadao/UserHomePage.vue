<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <div class="w3-row" style="font-size: 150%;">
            <div class="w3-third">
                <button @click="$router.push('/GerirAnimais')" class="w3-button w3-black" style="margin: 15px; padding: 25%; padding-left: 23%; padding-right: 23%">Gerir Animais</button>
            </div>
            <div class="w3-third">
                <button @click="$router.push('/Pedidos')" class="w3-button w3-black" style="margin: 15px; padding: 25%; padding-left: 23%; padding-right: 23%">Gerir Pedidos</button>
            </div>
            <div class="w3-third">
                <button @click="$router.push('/UserPerfilEdit')" class="w3-button w3-black" style="margin: 15px; padding: 25%;">Editar Perfil</button>
            </div>
        </div>
    </div>
</template>

<script>
import route from '../../router/index'

export default {
  name: 'UserHomePage',
  mounted: function () {
    if (localStorage.getItem('reloaded')) {
      // localStorage.removeItem('reloaded') // Se quiserem que a recarga aconteca apenas uma vez é só comentar esta linha
    } else {
      localStorage.setItem('reloaded', '1')
      location.reload()
    }

    if (this.$session.has('user') === false) {
      route.push('/Login')
    } else {
      const value = this.$session.get('user')
      if (value[1] === 1) {
        /* Redirecionar para a Página de Acesso Negado */
        route.push(('/AccessDenied'))
      }
    }
  }
}
</script>

<style scoped>

</style>
