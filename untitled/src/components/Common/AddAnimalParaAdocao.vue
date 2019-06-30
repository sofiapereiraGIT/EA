<template>
  <div class="background">
    <div class="transbox">
      <br>
      <div v-if="error===1" class="Error">
        <span class="closebtn" @click="closeErrorNotification()">&times;</span>
        <strong>Info!</strong> {{ message }}
      </div>
      <div v-if="success===1" class="Success">
        <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
        <strong>Info!</strong> {{ message }}
      </div>
      <h1>Adicionar Animal</h1>
      <form @submit.prevent="addAnimal">
        <label><input v-model="animal.Nome" type="text" name="animalName" placeholder="Nome" required></label>
        <br>
        <br>
          <button v-if="!mudarFoto" class="login100-form-btn" @click="mudarFoto = true">Escolher foto</button>
          <input v-if="mudarFoto" id="foto" class="w3-input w3-border" type="file" placeholder="Imagem" accept="image/*" v-on:change="uploadFotografia">
        <br>
        <br>
        <label><select v-model="animal.Discriminator" style="width: 25%" required>
          <option value="" disabled>Espécie</option>
          <option value="C">Cão</option>
          <option value="G">Gato</option>
        </select></label>
        <label><select v-model="animal.Sexo" style="width: 25%" required>
          <option value="" disabled>Sexo</option>
            <option value="F">Fêmea</option>
          <option value="M">Macho</option>
        </select></label>
        <br>
        <br>
        <label><select v-model="animal.Idade" style="width: 25%" required>
          <option value="" disabled>Idade</option>
          <option value="B">Bebé (Menos de 6 meses)</option>
          <option value="J">Jovem</option>
          <option value="A">Adulto</option>
        </select></label>
        <label><select v-model="animal.Porte" style="width: 25%" required>
          <option value="" disabled>Porte</option>
          <option value="P">Pequeno</option>
          <option value="M">Médio</option>
          <option value="G">Grande</option>
          <option value="I">Indefinido</option>
        </select></label>
        <br>
        <br>
        <label><select v-model="animal.CorPelo" style="width: 25%" required>
          <option value="" disabled>Cor do pêlo</option>
          <option value="Bege">Bege</option>
          <option value="Branco">Branco</option>
          <option value="Castanho">Castanho</option>
          <option value="Cinzento">Cinzento</option>
          <option value="Laranja">Laranja</option>
          <option value="Preto">Preto</option>
          <option value="Indefinido">Indefinido</option>
        </select></label>
        <label><select v-model="animal.CompPelo" style="width: 25%" required>
          <option value="" disabled>Comprimento de pêlo</option>
          <option value="S">Sem pêlo</option>
          <option value="C">Curto</option>
          <option value="M">Médio</option>
          <option value="L">Longo</option>
        </select></label>
        <br v-if="animal.Discriminator==='C'">
        <br v-if="animal.Discriminator==='C'">
        <label><select v-if="animal.Discriminator==='C'" v-model="animal.Raca" style="width: 50%" required>
          <option value="" disabled>Raça do cão</option>
          <option value="Beagle">Beagle</option>
          <option value="Buldogue">Buldogue</option>
          <option value="Golden Retriever">Golden Retriever</option>
          <option value="Lavrador">Lavrador</option>
          <option value="Pastor Alemao">Pastor Alemão</option>
          <option value="Poodle">Poodle</option>
          <option value="Rottweiler">Rottweiler</option>
          <option value="Outro">Outra raça</option>
          <option value="Sem Raça Definida">Sem raça definida</option>
        </select></label>
        <br v-if="animal.Discriminator==='G'">
        <br v-if="animal.Discriminator==='G'">
        <label><select v-if="animal.Discriminator==='G'" v-model="animal.Raca" style="width: 50%" required>
          <option value="" disabled>Raça do gato</option>
          <option value="Persa">Persa</option>
          <option value="Ragdoll">Ragdoll</option>
          <option value="ScottishFold">Scottish Fold</option>
          <option value="Siames">Siamês</option>
          <option value="Outro">Outra raça</option>
          <option value="Sem Raça Definida">Sem raça definida</option>
        </select></label>
        <br>
        <br>
        <label><input v-model="animal.Descricao" type="text" name="descricao" placeholder="Descrição"></label>
        <br>
        <br>
          <label class="container">Para adoção
              <input type="radio" name="radio" value="A" v-model="animal.Estado">
              <span class="checkmark"></span>
          </label>
          <label class="container">Encontrei este animal na rua
              <input type="radio" name="radio" value="E" v-model="animal.Estado">
              <span class="checkmark"></span>
          </label>
          <label v-if="this.$session.get('user')[1] === 1" class="container">Encontra-se em FAT
              <input type="radio" name="radio" value="F" v-model="animal.Estado">
              <span class="checkmark"></span>
          </label>
          <label v-if="this.$session.get('user')[1] === 1" class="container">Procuro FAT
              <input type="radio" name="radio" value="C" v-model="animal.Estado">
              <span class="checkmark"></span>
          </label>
        <br>
        <br>
        <input type="submit" class="button" placeholder="Registar"/>
        <button @click="$router.push('/GerirAnimais')" class="button">Cancelar</button>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'AddAnimalParaAdocao',
  data: () => ({
    success: 0,
    error: 0,
    message: '',
    animal: {
      email: '',
      Nome: '',
      Fototografia: '',
      Sexo: '',
      Idade: '',
      Raca: '',
      Porte: '',
      CorPelo: '',
      CompPelo: '',
      Estado: '',
      Descricao: '',
      Concelho: this.$session.get('user')[0].concelho,
      Discriminator: ''
    },
    mudarFoto: false
  }),
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
  },
  methods: {
    closeErrorNotification () {
      this.error = 0
    },
    stateChange (newState) {
      setTimeout(function () {
        if (newState === -1) {
          route.push('/GerirAnimais')
        }
      }, 3000)
    },
    addAnimal () {
      this.animal['email'] = this.$session.get('user')[0]
      axios.defaults.headers.post['Content-Type'] = 'application/json'
      axios.post(this.$axiosurl + 'AddAnimal', this.animal)
        .then(response => {
          if (response.data.msg === true) {
            var animais = this.$session.get('userAnimals')
            animais.push(this.animal)
            this.$session.set('userAnimals', animais)
            this.error = 0
            this.success = 1
            this.message = 'O animal foi registado com sucesso. Irá ser redirecionado dentro de 3 segundos.'
            this.stateChange(-1)
          }
        }).catch(e => {
          console.log(e)
          this.success = 0
          this.error = 1
          this.message = 'Não foi possível inserir o animal. Por favor, tente novamente.'
        })
    },
    uploadFotografia () {
      this.animal.Fotografia = this.getElementById('fotoAnimal')
    }
  }
}
</script>

<style scoped>
.Success {
    padding: 20px;
    background-color: green;
    color: white;
}
.Error {
    padding: 20px;
    background-color: #f44336;
    color: white;
}
.background {
    width: auto;
    height: 100%;
    margin-top: 45px;
    border: 1px solid transparent;
    background: url("../../assets/dog4.jpg") no-repeat;
    background-size: cover;
}
.transbox {
    opacity: 0.9;
    margin: 10% 25%;
    text-align: center;
    border-radius: 10px;
    background-color: #fff;
    border: 3px solid black;
}
.transbox p {
    margin: 5%;
    font-weight: bold;
    color: black;
}
input[type=text] {
    width: 50%;
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
    background-color: black;
    transition-duration: 0.4s;
    -webkit-transition-duration: 0.4s;
}
.button:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
.checkmark {
    position: absolute;
    top: 0;
    left: 0;
    height: 25px;
    width: 25px;
    background-color: #eee;
    border-radius: 50%;
}
</style>
