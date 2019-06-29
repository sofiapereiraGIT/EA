<template>
    <div class="w3-main" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

        <!-- Buttons -->
        <div id="wrapper" class="w3-row">
                <a href="#" @click="$router.push('/GerirAnimais')" class="my-super-cool-btn">
                    <div class="dots-container">
                        <div class="dot"></div>
                        <div class="dot"></div>
                        <div class="dot"></div>
                        <div class="dot"></div>
                    </div>
                    <span>Gerir Animais</span>
                </a>
            <a href="#" @click="$router.push('/Pedidos')" class="my-super-cool-btn">
                <div class="dots-container">
                    <div class="dot"></div>
                    <div class="dot"></div>
                    <div class="dot"></div>
                    <div class="dot"></div>
                </div>
                <span>Pedidos</span>
            </a>
            <a href="#" @click="$router.push('/CanilPerfilEdit')" class="my-super-cool-btn">
                <div class="dots-container">
                    <div class="dot"></div>
                    <div class="dot"></div>
                    <div class="dot"></div>
                    <div class="dot"></div>
                </div>
                <span>Editar Perfil</span>
            </a>
        </div>
    </div>
</template>

<script>
import route from '../../router/index'
export default {
  name: 'CanilHomePage',
  mounted: function () {
    if (localStorage.getItem('reloaded')) {
      localStorage.removeItem('reloaded') // Se quiserem que a recarga aconteca apenas uma vez é só comentar esta linha
    } else {
      localStorage.setItem('reloaded', '1')
      location.reload()
    }

    if (this.$session.has('user') === false) {
      route.push('/Login')
    } else {
      var value = this.$session.get('user')
      if (value[1] === 0) {
        /* Redirecionar para a Página de Acesso Negado */
        route.push(('/AccessDenied'))
      }
    }
  }
}
</script>

<style scoped>
    @import url('https://fonts.googleapis.com/css?family=Montserrat:900');

    body{
        margin:0;
        padding:0;
        background-color:#292929;
        font-family: 'Montserrat', sans-serif;
    }
    #wrapper{
        width:100vw;
        height:80vh;
        box-sizing:border-box;
        display:flex;
        align-items:center;
        justify-content:center;
    }
    .my-super-cool-btn{
        position:relative;
        text-decoration:none;
        color: #000000;
        letter-spacing:1px;
        font-size:2rem;
        box-sizing:border-box;
    }
    .my-super-cool-btn span{
        position:relative;
        box-sizing:border-box;
        display:flex;
        align-items:center;
        justify-content:center;
        width:300px;
        height:300px;
    }
    .my-super-cool-btn span:before{
        content:'';
        width:100%;
        height:100%;
        display:block;
        position:absolute;
        border-radius:200%;
        border:7px solid #F3CF14;
        box-sizing:border-box;
        transition: all .85s cubic-bezier(0.25, 1, 0.33, 1);
        box-shadow: 0 30px 85px rgba(0,0,0,0.14), 0 15px 35px rgba(0,0,0,0.14);
    }
    .my-super-cool-btn:hover span:before{
        transform:scale(0.8);
        box-shadow: 0 20px 55px rgba(0,0,0,0.14), 0 15px 35px rgba(0,0,0,0.14);
    }
    .my-super-cool-btn .dots-container{
        opacity:0;
        animation: intro 1.6s;
        animation-fill-mode: forwards;
    }
    .my-super-cool-btn .dot{
        width:8px;
        height:8px;
        display:block;
        background-color:#F3CF14;
        border-radius:100%;
        position:absolute;
        transition: all .85s cubic-bezier(0.25, 1, 0.33, 1);
    }
    .my-super-cool-btn .dot:nth-child(1){
        top:50px;
        left:50px;
        transform:rotate(-140deg);
        animation: swag1-out 0.3s;
        animation-fill-mode: forwards;
        opacity:0;
    }
    .my-super-cool-btn .dot:nth-child(2){
        top:50px;
        right:50px;
        transform:rotate(140deg);
        animation: swag2-out 0.3s;
        animation-fill-mode: forwards;
        opacity:0;
    }
    .my-super-cool-btn .dot:nth-child(3){
        bottom:50px;
        left:50px;
        transform:rotate(140deg);
        animation: swag3-out 0.3s;
        animation-fill-mode: forwards;
        opacity:0;
    }
    .my-super-cool-btn .dot:nth-child(4){
        bottom:50px;
        right:50px;
        transform:rotate(-140deg);
        animation: swag4-out 0.3s;
        animation-fill-mode: forwards;
        opacity:0;
    }
    .my-super-cool-btn:hover .dot:nth-child(1){
        animation: swag1 0.3s;
        animation-fill-mode: forwards;
    }
    .my-super-cool-btn:hover .dot:nth-child(2){
        animation: swag2 0.3s;
        animation-fill-mode: forwards;
    }
    .my-super-cool-btn:hover .dot:nth-child(3){
        animation: swag3 0.3s;
        animation-fill-mode: forwards;
    }
    .my-super-cool-btn:hover .dot:nth-child(4){
        animation: swag4 0.3s;
        animation-fill-mode: forwards;
    }
    @keyframes intro {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    @keyframes swag1 {
        0% {
            top:50px;
            left:50px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            top:20px;
            left:20px;
            width:8px;
            opacity:1;
        }
    }
    @keyframes swag1-out {
        0% {
            top:20px;
            left:20px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            top:50px;
            left:50px;
            width:8px;
            opacity:0;
        }
    }
    @keyframes swag2 {
        0% {
            top:50px;
            right:50px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            top:20px;
            right:20px;
            width:8px;
            opacity:1;
        }
    }
    @keyframes swag2-out {
        0% {
            top:20px;
            right:20px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            top:50px;
            right:50px;
            width:8px;
            opacity:0;
        }
    }
    @keyframes swag3 {
        0% {
            bottom:50px;
            left:50px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            bottom:20px;
            left:20px;
            width:8px;
            opacity:1;
        }
    }
    @keyframes swag3-out {
        0% {
            bottom:20px;
            left:20px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            bottom:50px;
            left:50px;
            width:8px;
            opacity:0;
        }
    }
    @keyframes swag4 {
        0% {
            bottom:50px;
            right:50px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            bottom:20px;
            right:20px;
            width:8px;
            opacity:1;
        }
    }
    @keyframes swag4-out {
        0% {
            bottom:20px;
            right:20px;
            width:8px;
        }
        50% {
            width:30px;
            opacity:1;
        }
        100% {
            bottom:50px;
            right:50px;
            width:8px;
            opacity:0;
        }
    }
</style>
