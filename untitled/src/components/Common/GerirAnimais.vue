<template>
  <div class="row">
    <div class="LeftMenuWithBlackBG">
      <p style="font-size: 20px">Filtros</p>
      <hr>
      <form>
        <label>
          <select style="width: 100%; height: 30px; background-color: white" v-model="selDiscr">
            <option value="T">Tipo</option>
            <option value="C">Cão</option>
            <option value="G">Gato</option>
          </select>
        </label>
        <br>
        <br>
        <label>
          <select style="width: 100%; height: 30px; background-color: white"  v-model="selEstado">
            <option value="Es">Estado</option>
            <option value="A">Adotado</option>
            <option value="P">Não Adotado</option>
            <option value="E">Encontrado</option>
            <option value="M">Falecido</option>
            <option value="F">Em FAT</option>
            <option value="EF">Em Pedido de FAT</option>
            <option value="SF">Sem Pedido de FAT</option>
          </select>
        </label>
      </form>
    </div>
    <div class="rightMenu">
      <label>
        <input type="text" v-model="selNome" name="search" placeholder="Nome do Animal">
      </label>
      <br>
      <br>
      <div class="animalCol" v-for="g in animaisFilter" :key="g.ID" >
          <!-- mandar para perdido ou adotar-->
          <router-link to="#">
            <img src="../../assets/cat.jpg" style="width:100%" >
          </router-link>
         </div>
    </div>
    <div>
      <button class="button" @click="$router.push('/AddAnimalParaAdocao')">Adicionar Animal</button>
      <button class="button" v-if="tipo===0" @click="$router.push('/ComunicarDesaparecimento')">Comunicar Desaparecimento</button>
      <br>
      <br>
      <br>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'GerirAnimais',
  data: () => ({
    gatosList: {},
    selDiscr: 'T',
    selEstado: 'Es',
    tipo: -1,
    selNome: ''
  }),

  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }

    axios.defaults.headers['Content-Type'] = 'application/json'
    axios.get('http://localhost:8080/procura4patas/TodosAnimaisUser?emailQuemQuero=' + this.$session.get('user')[0] + '&email=' + this.$session.get('user')[0])
      .then(response => {
        console.log(this.$session.get('user')[0])
        this.gatosList = response.data.todos
        this.tipo = this.$session.get('user')[1]
        console.log(this.tipo)
      }).catch()
  },

  computed: {
    animaisFilter: function () {
      var list = []
      var usado = false

      console.log(usado)

      if (this.selDiscr === 'T' && this.selEstado === 'Es' && this.selNome === '') {
        list = this.gatosList
        return list
      }

      for (var g in this.gatosList) {
        var gato = this.gatosList[g]

        if (gato.Nome === this.selNome) {
          usado = true
          list.push(gato)
        } else if (gato.Nome === '') {
          usado = false
        }

        if (usado === false && ((gato.Discriminator === this.selDiscr && this.selEstado === 'Es') || (gato.Estado === this.selEstado && this.selDiscr === 'T') || (gato.Estado === this.selEstado && gato.Discriminator === this.selDiscr))) {
          list.push(gato)
        }
      }
      return list
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
