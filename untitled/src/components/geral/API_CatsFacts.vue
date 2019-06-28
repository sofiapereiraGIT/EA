<template>
    <div style="padding: 0px 50px 50px 50px">
        <h1 style="padding-bottom: 20px"><strong>Factos sobre gatos</strong></h1>
        <table class="w3-table" id="customers">
            <tr>
                <th>Publicado por</th>
                <th>Facto</th>
            </tr>
            <tr v-for="f in factsList" :key="f._id">
                <td>{{f.text}}</td>
                <td>{{f.user.name}}</td>
            </tr>
        </table>
    </div>
</template>

<script>

import axios from 'axios'

export default {
  name: 'API_CatsFacts',
  data: () => ({
    factsList: {}
  }),

  mounted: function () {
    if (!this.$session.has('catFacts') || this.$session.get('catFacts')[1] >= 1) {
      console.log('getCatFacts')

      if (this.$session.has('user')) {
        axios.defaults.headers['Content-Type'] = 'Accept: application/json'
        axios.get('https://catfact.ninja/fact')
          .then(response => {
            this.factsList = response.data
            this.$session.set('catFacts', [this.factsList, 1])
            console.log(response.data)
          })
          .catch(err => {
            console.log(err)
          })
      } else {
        axios.defaults.headers['Content-Type'] = 'Accept: application/json'
        axios.get('https://catfact.ninja/fact')
          .then(response => {
            this.factsList = response.data.all
            this.$session.set('catFacts', [this.factsList, 1])
            console.log(response.data)
          })
          .catch(err => {
            console.log(err)
          })
      }
    } else {
      this.factsList = this.$session.get('catFacts')[0]
      var times = this.$session.get('catFacts')[1] + 1
      this.$session.set('catFacts', [this.factsList, times])
      console.log('reutilizar catsFacts da sessão pela ' + times + ' vez')
      console.log(this.factsList)
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
