<template>
    <div class="w3-top">
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="w3-bar" id="myNavbar">
            <a class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-right" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
            <a href="#home" class="w3-bar-item w3-button" style="float:left"><i class="fa fa-home"></i> PROCURA4PATAS</a>
            <a href="/login" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fa fa-user"></i> LOGIN</a>
            <a href="#aboutus" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fa fa-drivers-license-o"></i> SOBRE NÓS</a>
            <a href="#perdidos" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fa fa-paw"></i> PERDIDOS</a>
            <a href="#adocao" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fas fa-hand-holding-heart"></i> ADOÇÃO</a>
            <a href="#canis" class="w3-bar-item w3-button w3-hide-small" style="float:right"><i class="fas fa-globe"></i> CANIS</a>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Header'
}
// Change style of navbar on scroll
window.onscroll = function () { myFunction() }

function myFunction () {
  const navbar = document.getElementById('myNavbar')
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    navbar.className = 'w3-bar' + ' w3-card' + ' w3-animate-top' + ' w3-white'
  } else {
    navbar.className = navbar.className.replace(' w3-card w3-animate-top w3-white', '')
  }
}
</script>

<style scoped>
</style>
