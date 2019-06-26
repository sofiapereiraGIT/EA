<template>
  <div class="row">
        <div style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar">
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
            </div>
            <div class="navbar">
                <select style="width: 100%; height: 30px; background-color: white" v-model="selDiscr">
                    <option value="T">Tipo</option>
                    <option value="C">Cão</option>
                    <option value="G">Gato</option>
                </select>
            </div>
            <div class="navbar">
                <input type="text" style="width: 100%; height: 30px;" v-model="selNome" name="search" placeholder="Nome do Animal">
            </div>
        </div>
      <label>
      </label>
      <br>
      <br>
      <div class="animalCol" v-for="g in animaisFilter" :key="g.ID" >
          <!-- mandar para perdido ou adotar? Como assim? Não é melhor mandar para o perfil do animal-->
          <router-link
              to="#">
               <img  v-on:click="selAnimal=g.Estado" src="../../assets/cat.jpg" style="width:100%" >
          </router-link>
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
    animais: {},
    selDiscr: 'T',
    selEstado: 'Es',
    tipo: -1,
    selNome: '',
    selAnimal: ''
  }),

  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }

    axios.defaults.headers['Content-Type'] = 'application/json'
    axios.get('http://localhost:8080/procura4patas/TodosAnimaisUser?emailQuemQuero=' + this.$session.get('user')[0] + '&email=' + this.$session.get('user')[0])
      .then(response => {
        console.log(this.$session.get('user')[0])
        this.animais = response.data.todos
        this.tipo = this.$session.get('user')[1]
        console.log(this.tipo)
      }).catch()
  },

  computed: {
    animaisFilter: function () {
      let list = []
      let usado = false

      console.log(usado)

      if (this.selDiscr === 'T' && this.selEstado === 'Es' && this.selNome === '') {
        list = this.animais
        return list
      }

      for (const a in this.animais) {
        const anim = this.animais[a]

        if (anim.Nome === this.selNome) {
          usado = true
          list.push(anim)
        } else if (anim.Nome === '') {
          usado = false
        }

        if (usado === false && ((anim.Discriminator === this.selDiscr && this.selEstado === 'Es') || (anim.Estado === this.selEstado && this.selDiscr === 'T') || (anim.Estado === this.selEstado && anim.Discriminator === this.selDiscr))) {
          list.push(anim)
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

  body {
      font-family: "Lato", sans-serif;
  }

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
