<template>
    <div>
        <div class="w3-row w3-padding-32 w3-section">
            <div class="w3-col m6 w3-container">
                <img src="/w3images/map.jpg" class="w3-image w3-round" style="width:100%"><br>
                <br>
                <a href="url">Veja os cães deste utilizador</a><br>
                <a href="url">Veja os gatos deste utilizador</a>
            </div>
            <div class="w3-col m4 w3-panel">
                <form action="/action_page.php" target="_blank">
                    <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Nome" required name="Nome">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -600px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Descrição" required name="Descrição">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Contacto" required name="Contacto">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Concelho" required name="Concelho">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'UserPerfilEdit'
}
</script>

<style scoped>

</style>
