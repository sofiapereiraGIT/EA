<template>
    <div style="padding: 0px 50px 50px 50px">
        <h1 style="padding-bottom: 20px"><strong>Pedidos</strong></h1>
        <table class="w3-table" id="customers">
            <tr>
                <th>Data do pedido</th>
                <th>Adotado</th>
                <th>Nome do animal</th>
                <th>Nome do candidato</th>
                <th>E-mail do candidato</th>
            </tr>
            <tr v-for="p in pedidosList" :key="p.ID">
                <td>{{p.Data}}</td>
                <td>{{p.Adotado}}</td>
                <td>{{p.AnimalNome}}</td>
                <td>{{p.PessoaNome}}</td>
                <td>{{p.UtilizadorComumUtilizadorEmail}}</td>
            </tr>
        </table>
    </div>
</template>

<script>

import axios from 'axios'
import route from '../../router/index'

export default {
  name: 'Pedidos',
  data: () => ({
    pedidosList: {}
  }),

  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }

    axios.defaults.headers['Content-Type'] = 'application/json'
    axios.get('http://localhost:8080/procura4patas/PedidosUser?emailQuemQuero=' + this.$session.get('user')[0] + '&email=' + this.$session.get('user')[0])
      .then(response => {
        this.pedidosList = response.data.pedidos
        console.log(this.pedidosList)
      }).catch()
  }
}
</script>

<style scoped>
    #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #customers tr:nth-child(even){background-color: #f2f2f2;}

    #customers tr:hover {background-color: #ddd;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: cornflowerblue;
        color: white;
    }
</style>
