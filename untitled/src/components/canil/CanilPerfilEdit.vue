<template>
    <div style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <form action="/action_page.php" target="_blank">
            <div class="w3-row w3-padding-32 w3-section">
                <div class="w3-col m6 w3-container">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image"><br>
                    <br>
                    <button class="w3-button">Mudar imagem</button>
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Nome" required name="nome">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Descrição" required name="descricao">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="far fa-clock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Horário" required name="horario">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="email" placeholder="Email" required name="email">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Contacto" required name="contacto">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Concelho" required name="concelho">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Morada" required name="morada">
                        </div>
                    </div>
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-container w3-row-padding" style="margin:0 -200px 8px -16px">
                        <br>
                        <br>
                        <br>
                        <br>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-internet-explorer fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Site" required name="site">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-facebook-official fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Facebook" required name="facebook">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-instagram fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Instagram" required name="instagram">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="password" placeholder="Password" required name="password">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="password" placeholder="Confirme Password" required name="password2">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <button class="w3-button">Guardar</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</template>

<script>
export default {
  name: 'CanilPerfilEdit'
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
