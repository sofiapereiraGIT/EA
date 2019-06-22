<template>
    <div class="background">
        <div class="transbox">
            <h1>Comunicar Desaparecimento</h1>
            <form class="review-form" @submit.prevent="submitAnimal">
                <input v-model="animal.Nome" class="w3-input w3-border" type="text" placeholder="Nome">
                <br>
                <br>
                <input id="fotoAnimal" class="w3-input w3-border" type="file" placeholder="Imagem" accept="image/*" v-on:change="uploadFotografia">
                <br>
                <br>
                <multiselect v-model="animal.Discriminator" style="width: 25%" placeholder="Selecione espécie" :options="tipoOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <multiselect v-model="animal.Sexo" style="width: 25%" placeholder="Selecione sexo" :options="sexoOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <br>
                <br>
                <multiselect v-model="animal.Idade" style="width: 25%" placeholder="Selecione idade" :options="idadeOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <multiselect v-model="animal.Porte" style="width: 25%" placeholder="Selecione porte" :options="porteOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <br>
                <br>
                <multiselect v-model="animal.CorPelo" style="width: 25%" placeholder="Selecione cor do pèlo" :options="corPeloOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <multiselect v-model="animal.CompPelo" style="width: 25%" placeholder="Selecione comprimento do pèlo" :options="comprimentoPeloOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                </multiselect>
                <br>
                <br>
                <div v-if="animal.Discriminator != null && animal.Discriminator === 'Cão'">
                    <multiselect v-model="animal.Raca" style="width: 25%" placeholder="Selecione raça" :options="racaCaoOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                    </multiselect>
                </div>
                <div v-if="animal.Discriminator != null && animal.Discriminator === 'Gato'">
                    <multiselect v-model="animal.Raca" style="width: 25%" placeholder="Selecione raça" :options="racaGatoOptions" :searchable="false" :close-on-select="true" :show-labels="false">
                    </multiselect>
                </div>
                <br>
                <br>
                <input v-model="animal.Concelho" class="w3-input w3-border" type="text" placeholder="Concelho onde o animal desapareceu" required>
                <br>
                <br>
                <input v-model="animal.Descricao" class="w3-input w3-border" type="text" placeholder="Descrição">
                <br>
                <br>
                <button class="button">Registar</button>
                <button @click="$router.push('#')" class="button">Cancelar</button> <!-- mandar para o perfil do cidadao ou canil-->
            </form>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'ComunicarDesaparecimento',
  data: function () {
    return {
      tipoOptions: ['Cão', 'Gato'],
      sexoOptions: ['Macho', 'Fêmea'],
      corPeloOptions: ['Bege', 'Branco', 'Castanho', 'Cinzento', 'Laranja', 'Preto', 'Indefinido'],
      idadeOptions: ['Bebé (menos de 6 meses)', 'Jovem', 'Adulto'],
      porteOptions: ['Pequeno', 'Médio', 'Grande'],
      comprimentoPeloOptions: ['Sem Pélo', 'Curto', 'Médio', 'Longo'],
      racaCaoOptions: ['Sem Raça Definida', 'Beagle', 'Buldogue', 'Golden Retriever', 'Lavrador', 'Pastor Alemão', 'Poodle', 'Rottwiller'],
      racaGatoOptions: ['Sem Raça Definida', 'Persa', 'Ragdoll', 'Siamês', 'Scottish Fold'],

      animal: {
        email: null,
        Nome: null,
        Fotografia: null,
        Sexo: null,
        Idade: null,
        Raca: null,
        Porte: null,
        CorPelo: null,
        CompPelo: null,
        Estado: null,
        Descricao: null,
        Concelho: null,
        Discriminator: null
      }
    }
  },
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
  },
  methods: {
    submitAnimal () {
      if (this.animal.Sexo != null && this.animal.Idade != null && this.animal.Raca != null && this.animal.Porte != null && this.animal.CorPelo != null && this.animal.CompPelo != null && this.animal.Discriminator != null) {
        this.animal.email = this.$session.get('user')[0]

        if (this.animal.Descricao == null) this.animal.Descricao = ''
        if (this.animal.Fotografia == null) this.animal.Fotografia = ''
        if (this.animal.Nome == null) this.animal.Nome = ''

        axios.post('http://localhost:8080/procura4patas/AddAnimal', this.animal).then(response => {
          this.$router.push('#')
        })
      }
    },

    uploadFotografia () {
      this.animal.Fotografia = this.getElementById('fotoAnimal')
    }
  }
}

</script>

<style scoped>
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
