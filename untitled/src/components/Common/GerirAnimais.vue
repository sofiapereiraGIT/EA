<template>
    <div>
    <div class="row">
        <div style="position: -webkit-sticky; position: sticky; top: 30px; background-color: white; padding-top: 20px">
            <div class="navbar">
                <label><select style="width: 100%; height: 30px; background-color: white" v-model="selectedState">
                    <option value="Es">Estado</option>
                    <option value="A">Adotado</option>
                    <option value="F">Em FAT</option>
                    <option value="E">Encontrado</option>
                    <option value="M">Falecido</option>
                    <option value="NA">Para Adoção</option>
                    <option value="C">Pedido de FAT</option>
                    <option value="P">Perdido</option>
                </select></label>
            </div>
            <div class="navbar">
                <label><select style="width: 100%; height: 30px; background-color: white" v-model="selectedDiscriminator">
                    <option value="T">Tipo</option>
                    <option value="C">Cão</option>
                    <option value="G">Gato</option>
                </select></label>
            </div>
            <div class="navbar">
                <label><input type="text" style="width: 100%; height: 30px;" v-model="selectedName" name="search" placeholder="Nome do Animal"></label>
            </div>
            <br>
            <button class="button" @click="$router.push('/AddAnimalParaAdocao')">Adicionar Animal</button>
            <button class="button" v-if="utilizadorComum" @click="$router.push('/ComunicarDesaparecimento')">Comunicar Desaparecimento</button>
        </div>
        <br>
        <br>

        <div v-if="selAnimal!==null"> {{this.$session.set('animal', selAnimal)}} </div>

        <div class="animalCol" v-for="g in filteredAnimals" :key="g.ID" >
            <router-link v-if="g.Estado === 'P'" to="/EditAnimalPerdido">
                <img
                    v-if="(g.Fotografia==='' || g.Fotografia===null) && g.Discriminator === 'C'"
                    v-on:click="selAnimal=g"
                    src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                <img
                    v-if="(g.Fotografia==='' || g.Fotografia===null) && g.Discriminator === 'G'"
                    v-on:click="selAnimal=g"
                    src="../../assets/gato.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                <img
                    v-else
                    v-on:click="selAnimal=g"
                    :src="require('../../../img/'+g.Fotografia)" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
            </router-link>
            <router-link v-else to="/EditAnimalAdocao">
                <img
                    v-if="(g.Fotografia==='' || g.Fotografia===null) && g.Discriminator === 'C'"
                    v-on:click="selAnimal=g"
                    src="../../assets/cao.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                <img
                    v-if="(g.Fotografia==='' || g.Fotografia===null) && g.Discriminator === 'G'"
                    v-on:click="selAnimal=g"
                    src="../../assets/gato.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                <img
                    v-else
                    v-on:click="selAnimal=g"
                    :src="require('../../../img/'+g.Fotografia)" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
            </router-link>
            <br/>
            <label v-if="g.Nome!==''">{{ g.Nome }}</label>
        </div>
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
    selectedName: '',
    selectedState: 'Es',
    selectedDiscriminator: 'T',
    selAnimal: null
  }),
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
    axios.defaults.headers['Content-Type'] = 'application/json'
    axios.get(this.$axiosurl + 'TodosAnimaisUser?emailQuemQuero=' + this.$session.get('user')[0] + '&email=' + this.$session.get('user')[0])
      .then(response => {
        this.animais = response.data.todos
        /* this.tipo = this.$session.get('user')[1] */
      }).catch()
  },
  computed: {
    filteredAnimals: function () {
      let nameList = []
      let stateList = []
      let discriminatorList = []
      /* Filtrar Pelo Discriminator Selecionado */
      if (this.selectedDiscriminator !== 'T') {
        const app = this
        this.animais.forEach(function (a) {
          if (a.Discriminator === app.selectedDiscriminator) {
            discriminatorList.push(a)
          }
        })
      } else {
        discriminatorList = this.animais
      }
      /* Filtrar Pelo Estado Selecionado */
      if (this.selectedState !== 'Es') {
        const app = this
        discriminatorList.forEach(function (a) {
          if (app.selectedState === 'NA' && a.Estado !== 'A' && a.Estado !== 'M') {
            stateList.push(a)
          }
          if (app.selectedState !== 'NA') {
            if (app.selectedState === a.Estado) {
              stateList.push(a)
            }
          }
        })
      } else {
        stateList = discriminatorList
      }
      /* Filtrar Pelo Nome Selecionado */
      if (this.selectedName !== '') {
        let selectedLowerCaseName = this.selectedName.toLowerCase()
        stateList.forEach(function (a) {
          let lowerCaseName = a.Nome.toLowerCase()
          if (lowerCaseName.includes(selectedLowerCaseName)) {
            nameList.push(a)
          }
        })
      } else {
        nameList = stateList
      }
      return nameList
    },

    utilizadorComum: function () {
      return this.$session.get('user')[1] === 0
    }
  }
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
.row {
    margin: auto;
}
.animalCol {
    float: left;
    width: 25%;
    padding-bottom: 60px;

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
    color: white;
    float: right;
    cursor: pointer;
    font-size: 15px;
    margin-right: 8px;
    padding: 5px 5px;
    text-align: center;
    display: inline-block;
    text-decoration: none;
    background-color: black;
    transition-duration: 0.4s;
    -webkit-transition-duration: 0.4s;
}
.button:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
    background-color: red;
}

body {
  font-family: "Lato", sans-serif;
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
.navbar a:hover {
    background-color: rgba(0,0,0,0.2);
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
</style>
