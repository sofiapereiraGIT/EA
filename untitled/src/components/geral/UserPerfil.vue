<template>
    <div>
        <div class="w3-row w3-padding-32 w3-section" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
            <div class="w3-col m6 w3-container">
                <img v-if="temFotografia()" src="../../assets/FAT.jpg" style="margin-bottom: 10px" class="img w3-image"><br>
                <br>
                <router-link to="/AdotarCaes">Veja os cães deste utilizador</router-link><br>
                <router-link to="/AdotarGatos">Veja os gatos deste utilizador</router-link>
            </div>
            <div class="w3-col m4 w3-panel">
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{UserInfo.nome}}<br>
                    </div>
                </div>
                <div v-if="temDescricao()" class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{UserInfo.descricao}}<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{UserInfo.email}}<br>
                    </div>
                </div>
                <div v-if="temTelemovel()" class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{UserInfo.telemovel}}<br>
                    </div>
                </div>
                <div class="w3-row-padding w3-container" style="clear: both; float: left">
                    <div class="w3-large w3-margin-bottom">
                        <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{UserInfo.concelho}}<br>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>

import axios from 'axios'

export default {
  name: 'UserPerfil',
  data: () => ({
    UserInfo: {}
  }),

  mounted: function () {
    axios.defaults.headers['Content-Type'] = 'application/json'
    this.FetchData()
  },

  methods: {
    FetchData: function () {
      if (this.$session.has('user')) {
        axios.get('http://localhost:8080/procura4patas//UtilizadorComum?emailPedido=' + this.$session.get('email') + '&email=' + this.$session.get('user')[0]).then(response => {
          this.UserInfo = response.data
          console.log(this.UserInfo)
        })
      } else {
        axios.get('http://localhost:8080/procura4patas//UtilizadorComum?emailPedido=' + this.$session.get('email')).then(response => {
          this.UserInfo = response.data
          console.log(this.UserInfo)
        })
      }
    },

    temFotografia () {
      return this.UserInfo.fotografia != null && this.UserInfo.fotografia !== ''
    },

    temTelemovel () {
      return this.UserInfo.telemovel != null && this.UserInfo.telemovel !== ''
    },

    temDescricao () {
      return this.UserInfo.descricao != null && this.UserInfo.descricao !== ''
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
