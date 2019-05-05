<template>
    <div>
        <form action="/action_page.php" target="_blank">
            <div class="w3-row w3-padding-32 w3-section">
                <div class="w3-col m6 w3-container">
                    <img src="/w3images/map.jpg" class="w3-image w3-round" style="width:100%"><br>
                    <br>
                    <a href="url">Veja os cães desta entidade</a><br>
                    <a href="url">Veja os gatos desta entidade</a>
                </div>
                <div class="w3-col m2 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Nome" required name="Nome">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -840px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Descrição" required name="Descrição">
                        </div>
                    </div>
                </div>
            </div>
            <div class="w3-row w3-padding-32 w3-section">
                <div class="w3-col m6 w3-container">
                </div>
                <div class="w3-col m2 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Horario" required name="Horario">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Contacto" required name="Contacto">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Concelho" required name="Concelho">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Morada" required name="Morada">
                        </div>
                    </div>
                </div>
                <div class="w3-col m2 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Site" required name="Site">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Facebook" required name="Facebook">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-half">
                            <input class="w3-input w3-border" type="text" placeholder="Instagram" required name="Instagram">
                        </div>
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

</style>
