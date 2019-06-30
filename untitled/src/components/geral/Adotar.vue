<template>
    <div>
        <div class="w3-row">
            <div class="w3-content w3-container w3-padding-64">
                <h3 class="texto w3-center">Antes de adotar informe-se...</h3>
                <h6 class="w3-center">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
                    dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor
                    incididunt ut labore et dolore magna aliqua.
                </h6>
            </div>
        </div>
        <br>
        <div class="w3-row">
            <div class="w3-container w3-col l3 m1 w3-hide-small"></div>
            <div class="w3-col l2 m4">
                <router-link to="/AdotarCaes">
                    <img border="0" alt="W3Schools" src="../../assets/cao.png">
                </router-link>
            </div>
            <div class="w3-col m5">
                <router-link to="/AdotarGatos">
                    <img border="0" alt="W3Schools" src="../../assets/gato.png">
                </router-link>
            </div>
            <div class="w3-container w3-col l3 m1 w3-hide-small"></div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Adotar'
}
</script>

<style scoped>
    img {
        height: 100%;
        width: 100%;
        overflow-y: hidden;
        overflow-x: hidden;
        object-fit: cover;
    }

    .texto {
        font-size: 48px;
    }
</style>
