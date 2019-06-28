<template>
    <div style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
        <form class="review-form" @submit.prevent="submitUtilizador">
            <div class="w3-row w3-padding-32 w3-section">
                <div class="w3-col m6 w3-container">
                    <img v-if="utilizador.fotografia===null || utilizador.fotografia===''" src="../../assets/user.png" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                    <img v-else :src="require('../../../img/'+utilizador.fotografia)" style="margin-bottom: 10px" class="img w3-image w3-hover-opacity">
                    <br><br>
                    <button v-if="!mudarFoto" class="w3-button" @click="mudarFoto = true">Mudar imagem</button>
                    <input v-if="mudarFoto" id="foto" class="w3-input w3-border" type="file" placeholder="Imagem" accept="image/*" v-on:change="uploadFotografia">
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                           {{this.utilizador.email}}
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.nome" class="w3-input w3-border" type="text" placeholder="Nome" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.telemovel" class="w3-input w3-border" type="text" placeholder="Contacto">
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <label><select v-model="novoUtilizador.concelho" style="width: 25%" required>
                                <option v-bind:value="novoUtilizador.concelho">{{novoUtilizador.concelho}}</option>
                                <option value="Amarante">Amarante</option>
                                <option value="Braga">Braga</option>
                                <option value="Coimbra">Coimbra</option>
                                <option value="Faro">Faro</option>
                                <option value="Lisboa">Lisboa</option>
                                <option value="Porto">Porto</option>
                                <option value="Viana do Castelo">Viana do Castelo</option>
                            </select></label>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.descricao" class="w3-input w3-border" type="text" placeholder="Descrição">
                        </div>
                    </div>
                </div>
                <div class="w3-col m3 w3-panel">
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="novoUtilizador.password" class="w3-input w3-border" type="password" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <div class="w3-col m1">
                            <i class="fa fa-lock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>
                        </div>
                        <div class="w3-half">
                            <input v-model="confirmPass" class="w3-input w3-border" type="password" placeholder="Confirme Password" required>
                        </div>
                    </div>
                    <div class="w3-row-padding" style="margin:0 -200px 8px -16px">
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <input type="submit" value="Guardar">
                    </div>
                </div>
            </div>
        </form>
    </div>
</template>

<script>
import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'UserPerfilEdit',
  data: function () {
    return {
      utilizador: null,
      novoUtilizador: {
        email: null,
        password: null,
        nome: null,
        fotografia: null,
        concelho: null,
        telemovel: null,
        descricao: null
      },
      mudarFoto: false,
      confirmPass: null
    }
  },
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    } else {
      const value = this.$session.get('user')
      if (value[1] === 1) {
        /* Redirecionar para a Página de Acesso Negado */
        route.push(('/AccessDenied'))
      }
    }
    this.FetchData()
  },
  methods: {
    FetchData: function () {
      const value = this.$session.get('user')
      axios.get(this.$axiosurl + 'UtilizadorComum?email=' + value[0] + '&emailPedido=' + value[0]).then(response => {
        this.utilizador = response.data
        this.novoUtilizador.email = this.utilizador.email
        this.novoUtilizador.password = this.utilizador.password
        this.novoUtilizador.nome = this.utilizador.nome
        this.novoUtilizador.fotografia = this.utilizador.fotografia
        this.novoUtilizador.concelho = this.utilizador.concelho
        this.novoUtilizador.telemovel = this.utilizador.telemovel
        this.novoUtilizador.descricao = this.utilizador.descricao
      })
    },

    submitUtilizador () {
      if (this.novoUtilizador.password != null && this.novoUtilizador.nome != null && this.novoUtilizador.concelho != null) {
        if (this.novoUtilizador.password === this.confirmPass) {
          if (this.novoUtilizador.fotografia == null) this.novoUtilizador.fotografia = ''
          if (this.novoUtilizador.telemovel == null) this.novoUtilizador.telemovel = ''
          if (this.novoUtilizador.descricao == null) this.novoUtilizador.descricao = ''

          axios.post(this.$axiosurl + 'UpdateUtilizadorComum', this.novoUtilizador)
            .then(response => {
              route.push('/UserPerfilEdit')
              this.mudarFoto = false
            })
        } else alert('Password não coincide, por favor tente novamente.')
      }
    },

    uploadFotografia () {
      this.novoUtilizador.fotografia = this.getElementById('foto')
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
</style>
