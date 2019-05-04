<template>
    <div class="w3-main" style="padding:50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Sticky Filter Concelho -->
        <div class="w3-container" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="w3-dropdown-hover" style="margin-bottom: 25px;">
                <button class="w3-button w3-black fixed-top" style="padding: 10px; width: 200px;">Concelho</button>
                <div class="w3-dropdown-content w3-bar-block w3-border" style="width: 200px;">
                    <a href="#" class="w3-bar-item w3-button">Link 1</a>
                    <a href="#" class="w3-bar-item w3-button">Link 2</a>
                    <a href="#" class="w3-bar-item w3-button">Link 3</a>
                </div>
            </div>
        </div>

        <!-- First Photo Grid-->
        <!-- TODO: organizar canis pelo nome do concelho e dentro disso, pelo nome do canil -->
        <div class="w3-row-padding">
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/logo.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/homepage.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
        </div>

        <!-- Second Photo Grid-->
        <div class="w3-row-padding">
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <a href="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </a>
                <div class="w3-container w3-white">
                    <a href="#" style="text-decoration: none; color: black"><strong>Nome</strong></a>
                    <p style=" line-height: 0.1;">Concelho</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Canis'
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
