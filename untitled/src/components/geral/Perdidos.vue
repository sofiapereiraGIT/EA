<template>
    <div>
        <div class="w3-row">
            <div class="w3-content w3-container w3-padding-64">
                <h3 class="texto w3-center">Ajude a encontrar estes animais</h3>
            </div>
        </div>
        <div class="w3-row">
            <div class="w3-container w3-col l3 m1 w3-hide-small"></div>
            <div class="w3-col l2 m4">
                <router-link to="/PerdidosCaes">
                    <img border="0" alt="W3Schools" src="../../assets/cao.png" width="350" height="350">
                </router-link>
            </div>
            <div class="w3-col m5">
                <router-link to="/PerdidosGatos">
                    <img border="0" alt="W3Schools" src="../../assets/gato.png" width="780" height="450">
                </router-link>
            </div>
            <div class="w3-container w3-col l3 m1 w3-hide-small"></div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Perdidos'
}
</script>

<style scoped>
    .texto {
        font-size: 48px;
    }
</style>
