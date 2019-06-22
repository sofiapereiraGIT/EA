<template>
  <div class="background">
    <div class="transbox">
      <br>
      <div v-if="error===1" class="Error">
        <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
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
        <input type="file" name="picture" accept="image/*">
        <br>
        <br>
        <label><select v-model="animal.Discriminator" style="width: 25%" required>
          <option value="" disabled>Raça</option>
          <option value="C">Cão</option>
          <option value="G">Gato</option>
        </select></label>
        <label><select v-model="animal.Sexo" style="width: 25%" required>
          <option value="" disabled>Sexo</option>
          <option value="M">Macho</option>
          <option value="F">Fêmea</option>
        </select></label>
        <br>
        <br>
        <label><select v-model="animal.CorPelo" style="width: 25%" required>
          <option value="" disabled>Cor do Pêlo</option>
          <option value="Amarelo">Amarelo</option>
          <option value="Bege">Bege</option>
          <option value="Branco">Branco</option>
          <option value="Castanho">Castanho</option>
          <option value="Cinzento">Cinzento</option>
          <option value="Preto">Preto</option>
          <option value="Indefinido">Indefinido</option>
        </select></label>
        <label><select v-model="animal.Idade" style="width: 25%" required>
          <option value="" disabled>Idade</option>
          <option value="B">Bebé (Menos de 6 Meses)</option>
          <option value="J">Jovem</option>
          <option value="A">Adulto</option>
        </select></label>
        <br>
        <br>
        <label><select v-model="animal.Porte" style="width: 25%" required>
          <option value="" disabled>Porte</option>
          <option value="P">Pequeno</option>
          <option value="M">Médio</option>
          <option value="G">Grande</option>
          <option value="I">Indefinido</option>
        </select></label>
        <label><select v-model="animal.CompPelo" style="width: 25%" required>
          <option value="" disabled>Comprimento de Pêlo</option>
          <option value="S">Sem Pêlo</option>
          <option value="C">Curto</option>
          <option value="M">Médio</option>
          <option value="L">Longo</option>
        </select></label>
        <br v-if="animal.Discriminator==='C'">
        <br v-if="animal.Discriminator==='C'">
        <label><select v-if="animal.Discriminator==='C'" v-model="animal.Raca" style="width: 50%" required>
          <option value="" disabled>Raça Cão</option>
          <option value="Pastor Alemao">Pastor Alemão</option>
          <option value="Lavrador">Lavrador</option>
          <option value="Buldogue">Buldogue</option>
          <option value="Beagle">Beagle</option>
          <option value="Poodle">Poodle</option>
          <option value="Rottwiller">Rottwiller</option>
          <option value="Golden Retriever">Golden Retriever</option>
          <option value="Outro">Outro</option>
        </select></label>
        <br v-if="animal.Discriminator==='G'">
        <br v-if="animal.Discriminator==='G'">
        <label><select v-if="animal.Discriminator==='G'" v-model="animal.Raca" style="width: 50%" required>
          <option value="" disabled>Raça Gato</option>
          <option value="Persa">Persa</option>
          <option value="Siamês">Siamês</option>
          <option value="Ragdoll">Ragdoll</option>
          <option value="Scottish Fold">Scottish Fold</option>
          <option value="Outro">Outro</option>
        </select></label>
        <br>
        <br>
        <label><input v-model="animal.Descricao" type="text" name="descricao" placeholder="Descrição"></label>
        <br>
        <br>
        <label><select v-model="animal.Estado" style="width: 50%" required>
          <option value="" disabled>Estado</option>
          <option v-if="this.$session.get('user')[1]===1" value="A">Adotado</option>
          <option value="E">Encontrado</option>
          <option v-if="this.$session.get('user')[1]===1" value="F">Pedido FAT</option>
          <!-- <option v-if="this.$session.get('user')[1]===1" value="">Em FAT</option> -->
        </select></label>
        <br>
        <br>
        <input type="submit" class="button" placeholder="Registar"/>
        <button v-if="this.$session.get('user')[1]===0" @click="$router.push('/UserHomePage')" class="button">Cancelar</button>
        <button v-if="this.$session.get('user')[1]===1" @click="$router.push('/CanilHomePage')" class="button">Cancelar</button>
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
      Concelho: '',
      Discriminator: ''
    }
  }),
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
  },
  methods: {
    stateChange (newState, userType) {
      setTimeout(function () {
        if (newState === -1) {
          if (userType === 0) {
            route.push('/UserHomePage')
          } else if (userType === 1) {
            route.push('/CanilHomePage')
          }
        }
      }, 3000)
    },
    addAnimal () {
      this.animal['email'] = this.$session.get('user')[0]
      axios.defaults.headers.post['Content-Type'] = 'application/json'
      axios.post('http://localhost:8080/procura4patas/AddAnimal', this.animal)
        .then(response => {
          if (response.data.msg === true) {
            this.error = 0
            this.success = 1
            this.message = 'O Animal Foi Registado Com Sucesso. Irá Ser Redirecionado Dentro de 3 Segundos'
            this.stateChange(-1, this.$session.get('user')[1])
          }
        }).catch(e => {
          this.success = 0
          this.error = 1
          this.message = 'Não Foi Possível Inserir o Animal.'
        })
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
    width: 100%;
    height: 100vh;
    margin-top: 38px;
    border: 1px solid black;
    background: url("../../assets/cao2.jpg");
}
.transbox {
    opacity: 0.7;
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
</style>
