<template>
    <div>
        <div class="w3-row w3-padding-32 w3-section" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
            <div class="w3-col m6 w3-container">
                <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image"><br>
                <br>
                <router-link to="/AdotarCaes">Veja os cães deste canil</router-link><br>
                <router-link to="/AdotarGatos">Veja os gatos deste canil</router-link>
            </div>
            <div class="w3-col m6 w3-container">
                <div class="w3-row w3-padding-32 w3-section">
                    <div class="w3-col m6 w3-panel">
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com nome<br>
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
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com morada<br>
                            </div>
                        </div>
                    </div>
                    <div class="w3-col m6 w3-panel">
                        <div class="w3-container w3-row-padding" style="margin:0 -200px 8px -16px">
                            <br>
                            <br>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="far fa-clock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com horario<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-internet-explorer fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com site<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-facebook-official fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com facebook<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-instagram fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com instagram<br>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="w3-col m12 w3-panel">
                    <div class="w3-row-padding w3-container" style="clear: both; float: left">
                        <div class="w3-large w3-margin-bottom">
                            <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i> preencher com descrição ............<br>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'CanilPerfil'
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
