<template>
    <div>
        <div class="w3-row w3-padding-32 w3-section" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
            <div class="w3-col m6 w3-container">
                <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image"><br>
                <br>
                <router-link href="/AdotarCaes">Veja os cães deste utilizador</router-link><br>
                <router-link href="/AdotarGatos">Veja os gatos deste utilizador</router-link>
            </div>
            <div class="w3-col m4 w3-panel">
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>preencher com nome<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com descrição .................<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com email<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com tlm<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com concelho<br>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'UserPerfil'
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
</style>
