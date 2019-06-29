<template>
    <div>
        <div class="w3-row w3-padding-32 w3-section" style="padding-bottom:50px; padding-left: 50px; padding-right: 50px;">
            <div class="w3-col m6 w3-container">
                <img v-if="utilizador.fotografia===null || utilizador.fotografia===''" src="../../../img/userCanis.png" style="margin-bottom: 10px" class="img w3-image">
                <img v-else :src="require('../../../img/'+utilizador.fotografia)" style="margin-bottom: 10px" class="img w3-image">
                <br>
                <router-link to="/AdotarCaes">Veja os cães deste canil</router-link><br>
                <router-link to="/AdotarGatos">Veja os gatos deste canil</router-link>
            </div>
            <div class="w3-col m6 w3-container">
                <div class="w3-row w3-padding-32 w3-section">
                    <div class="w3-col m6 w3-panel">
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fas fa-user fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.nome}}<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-envelope fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.email}}<br>
                            </div>
                        </div>
                        <div v-if="temTelemovel()" class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-phone fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.telemovel}}<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.concelho}}<br>
                            </div>
                        </div>
                        <div class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-map-marker fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.morada}}<br>
                            </div>
                        </div>
                    </div>
                    <div class="w3-col m6 w3-panel">
                        <div class="w3-container w3-row-padding" style="margin:0 -200px 8px -16px">
                            <br>
                            <br>
                        </div>
                        <div v-if="temHorario()" class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="far fa-clock fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.horario}}<br>
                            </div>
                        </div>
                        <div v-if="temSite()" class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-internet-explorer fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.site}}<br>
                            </div>
                        </div>
                        <div v-if="temFacebook()" class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-facebook-official fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.facebook}}<br>
                            </div>
                        </div>
                        <div v-if="temInstagram()" class="w3-row-padding w3-container" style="clear: both; float: left">
                            <div class="w3-large w3-margin-bottom">
                                <i class="fa fa-instagram fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.instagram}}<br>
                            </div>
                        </div>
                    </div>
                </div>
                <div v-if="temDescricao()" class="w3-col m12 w3-panel">
                    <div class="w3-row-padding w3-container" style="clear: both; float: left">
                        <div class="w3-large w3-margin-bottom">
                            <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-xlarge w3-margin-right"></i>{{utilizador.descricao}}<br>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'CanilPerfil',
  data: function () {
    return {
      utilizador: null
    }
  },
  mounted: function () {
    this.FetchData()
  },
  methods: {
    FetchData: function () {
      if (this.$session.has('user')) {
        axios.get('http://localhost:8080/procura4patas/Canil?email=' + this.$session.get('user')[0] + '&emailPedido=' + this.$session.get('email')).then(response => {
          this.utilizador = response.data
        })
      } else {
        axios.get('http://localhost:8080/procura4patas/Canil?emailPedido=' + this.$session.get('email')).then(response => {
          this.utilizador = response.data
        })
      }
    },
    temTelemovel () {
      return this.utilizador.telemovel != null && this.utilizador.telemovel !== ''
    },
    temDescricao () {
      return this.utilizador.descricao != null && this.utilizador.descricao !== ''
    },
    temHorario () {
      return this.utilizador.horario != null && this.utilizador.horario !== ''
    },
    temSite () {
      return this.utilizador.site != null && this.utilizador.site !== ''
    },
    temFacebook () {
      return this.utilizador.facebook != null && this.utilizador.facebook !== ''
    },
    temInstagram () {
      return this.utilizador.instagram != null && this.utilizador.instagram !== ''
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
