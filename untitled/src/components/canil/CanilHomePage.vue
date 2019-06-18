<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Buttons -->
        <div class="w3-row" style="font-size: 150%;">
            <div class="w3-third">
                <button @click="$router.push('/GerirAnimais')" class="w3-button w3-black" style="margin: 15px; padding: 25%; padding-left: 23%; padding-right: 23%">Gerir animais</button>
            </div>
            <div class="w3-third">
                <button @click="$router.push('/Pedidos')" class="w3-button w3-black" style="margin: 15px; padding: 25%; padding-left: 23%; padding-right: 23%">Gerir pedidos</button>
            </div>
            <div class="w3-third">
                <button @click="$router.push('/CanilPerfilEdit')" class="w3-button w3-black" style="margin: 15px; padding: 25%;">Editar perfil</button>
            </div>
        </div>
    </div>
</template>

<script>
import route from '../../router/index'
export default {
  name: 'CanilHomePage',
  mounted: function () {
    console.log()
    if (this.$session.has('user') === false) {
      route.push('/Login')
    } else {
      var value = this.$session.get('user')
      
    }
  }
}
</script>

<style scoped>

</style>
