<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Title -->
        <h1 style="text-shadow:1px 1px 0 #444"><strong>Gatos</strong></h1>

        <!-- Slogan -->
        <h2><strong>Ajude a encontrar estes animais.</strong></h2>

        <!-- Sticky Filters -->
        <div class="w3-row-padding" style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar" style="margin-bottom: 25px;">
                <div class="dropdown">
                    <button class="dropbtn">Concelho
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Sexo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Idade
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Porte
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Raça
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Tipo de pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Comprimento do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
                <div class="dropdown">
                    <button class="dropbtn">Cor do pêlo
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-content">
                        <a href="#">Link 1</a>
                        <a href="#">Link 2</a>
                        <a href="#">Link 3</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- First Photo Grid-->
        <div class="w3-row-padding" style="margin-top: 25px;">
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/logo.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/homepage.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
        </div>

        <!-- Second Photo Grid-->
        <div class="w3-row-padding">
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
            <div class="w3-quarter w3-container w3-margin-bottom">
                <router-link to="#">
                    <img src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                </router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'PerdidosGatos'
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

    .navbar {
        overflow: hidden;
        background-color: white;
        display: inline-block;
        border: 1px solid #555;
    }
    .navbar a {
        float: left;
        font-size: 16px;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }

    .dropdown {
        float: left;
        overflow: hidden;
    }

    .dropdown .dropbtn {
        font-size: 16px;
        border: none;
        outline: none;
        color: black;
        padding: 14px 16px;
        background-color: inherit;
        font-family: inherit;
        margin: 0;
    }

    .navbar a:hover, .dropdown:hover .dropbtn {
        background-color: rgba(0,0,0,0.2);
    }

    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
    }

    .dropdown-content a {
        float: none;
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
        text-align: left;
    }

    .dropdown-content a:hover {
        background-color: #ddd;
    }

    .dropdown:hover .dropdown-content {
        display: block;
    }
</style>
