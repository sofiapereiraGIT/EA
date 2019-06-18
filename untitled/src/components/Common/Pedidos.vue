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
            <tr>
                <td>Data</td>
                <td>Sim/Não</td>
                <td>info</td>
                <td>info</td>
                <td>info</td>
            </tr>
            <tr>
                <td>Data</td>
                <td>Sim/Não</td>
                <td>info</td>
                <td>info</td>
                <td>info</td>
            </tr>
            <tr>
                <td>Data</td>
                <td>Sim/Não</td>
                <td>info</td>
                <td>info</td>
                <td>info</td>
            </tr>
        </table>
    </div>
</template>

<script>
import route from '../../router/index'
export default {
  name: 'Pedidos',
  mounted: function () {
    if (this.$session.has('user') === false) {
      route.push('/Login')
    }
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
