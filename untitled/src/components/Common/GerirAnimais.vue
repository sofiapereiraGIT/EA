<template>
  <div class="row">
    <div class="LeftMenuWithBlackBG">
      <p style="font-size: 20px">Filtros</p>
      <hr>
      <form>
        <label>
          <select style="width: 100%; height: 30px; background-color: white">
            <option value="0">Tipo</option>
            <option value="1">Cão</option>
            <option value="2">Gato</option>
          </select>
        </label>
        <br>
        <br>
        <label>
          <select style="width: 100%; height: 30px; background-color: white">
            <option value="0">Estado</option>
            <option value="1">Adotado</option>
            <option value="2">Não Adotado</option>
            <option value="3">Encontrado</option>
            <option value="4">Falecido</option>
            <option value="5">Em FAT</option>
            <option value="6">Em Pedido de FAT</option>
            <option value="7">Sem Pedido de FAT</option>
          </select>
        </label>
      </form>
    </div>
    <div class="rightMenu">
      <label>
        <input type="text" name="search" placeholder="Nome do Animal">
      </label>
      <br>
      <br>
      <div class="animalCol">
          <!-- mandar para perdido ou adotar-->
          <router-link to="#">
            <img src="../../assets/cat2.jpg" alt="Snow" style="width:100%">
          </router-link>
      </div>
      <div class="animalCol">
          <!-- mandar para perdido ou adotar-->
          <router-link to="#">
            <img src="../../assets/cat2.jpg" alt="Forest" style="width:100%">
          </router-link>
      </div>
      <div class="animalCol">
          <!-- mandar para perdido ou adotar-->
          <router-link to="#">
            <img src="../../assets/cat2.jpg" alt="Mountains" style="width:100%">
          </router-link>
      </div>
      <div class="animalCol">
          <!-- mandar para perdido ou adotar-->
          <router-link to="#">
            <img src="../../assets/cat2.jpg" alt="Mountains" style="width:100%">
          </router-link>
      </div>
    </div>
    <button class="button" @click="$router.push('/AddAnimalParaAdocao')">Adicionar Animal</button>
    <button class="button" @click="$router.push('#')">Comunicar Desaparecimento</button>
  </div>
</template>

<script>
import route from '../../router/index'
export default {
  name: 'GerirAnimais',
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
  }
}
</script>

<style scoped>
  .row {
    margin-top: 38px;
  }
  .LeftMenuWithBlackBG {
    width: 20%;
    float: left;
    color: white;
    height: 100vh;
    background-color: black;
    text-align: center;
  }
  .rightMenu {
    float: left;
    width: 80%;
    padding: 5px;
    text-align: center;
  }
  .animalCol {
    float: left;
    width: 25%;
    padding: 10px;
  }
  input[type=text] {
    width: 20%;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 12px;
    background-color: white;
    padding: 10px;
  }
  .button {
    border: none;
    color: white;
    float: right;
    cursor: pointer;
    font-size: 16px;
    margin-right: 1%;
    border-radius: 10%;
    padding: 15px 25px;
    text-align: center;
    display: inline-block;
    text-decoration: none;
    background-color: black;
    transition-duration: 0.4s;
    -webkit-transition-duration: 0.4s;
  }
  .button:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
  }
</style>
