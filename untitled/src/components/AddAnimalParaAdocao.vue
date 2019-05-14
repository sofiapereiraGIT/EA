<template>
  <div class="background">
    <div class="transbox">
      <h1>Adicionar Animal</h1>
      <form>
        <input type="text" name="animalName" value="Nome" required>
        <br>
        <br>
        <input type="file" name="picture" accept="image/*" required>
        <br>
        <br>
        <select style="width: 25%" required>
          <option selected disabled>Tipo</option>
          <option value="1">Cão</option>
          <option value="2">Gato</option>
        </select>
        <select style="width: 25%" required>
          <option selected disabled>Sexo</option>
          <option value="1">Macho</option>
          <option value="2">Fêmea</option>
        </select>
        <br>
        <br>
        <select style="width: 25%" required>
          <option selected disabled>Cor do Pêlo</option>
          <option value="1">Amarelo</option>
          <option value="2">Bege</option>
          <option value="3">Branco</option>
          <option value="4">Castanho</option>
          <option value="5">Cinzento</option>
          <option value="6">Preto</option>
          <option value="7">Indefinido</option>
        </select>
        <select style="width: 25%" required>
          <option selected disabled>Idade</option>
          <option value="1">Bebé (Menos de 6 Meses)</option>
          <option value="2">Jovem</option>
          <option value="3">Adulto</option>
        </select>
        <br>
        <br>
        <select style="width: 25%" required>
          <option selected disabled>Tipo de Pêlo</option>
        </select>
        <select style="width: 25%" required>
          <option selected disabled>Porte</option>
          <option value="1">Pequeno</option>
          <option value="2">Médio</option>
          <option value="3">Grande</option>
        </select>
        <br>
        <br>
        <select style="width: 25%" required>
          <option selected disabled>Comprimento de Pêlo</option>
          <option value="1">Sem Pêlo</option>
          <option value="2">Curto</option>
          <option value="3">Médio</option>
          <option value="4">Longo</option>
        </select>
        <select style="width: 25%" required>
          <option selected disabled>Raça Cão</option>
          <option value="1">Pastor Alem̃ao</option>
          <option value="2">Lavrador</option>
          <option value="3">Buldogue</option>
          <option value="4">Beagle</option>
          <option value="5">Poodle</option>
          <option value="6">Rottwiller</option>
          <option value="7">Golden Retriever</option>
          <option value="8">Outro</option>
        </select>
        <br>
        <br>
        <select style="width: 50%" required>
          <option selected disabled>Raça Gato</option>
          <option value="1">Persa</option>
          <option value="2">Siamês</option>
          <option value="3">Ragdoll</option>
          <option value="4">Scottish Fold</option>
          <option value="5">Outro</option>
        </select>
        <br>
        <br>
        <input type="text" name="descricao" value="Descrição">
        <br>
        <br>
        <select style="width: 50%" required>
          <option selected disabled>Estado</option>
          <option value="1">Pedido FAT</option>
          <option value="2">Em FAT</option>
          <option value="3">Encontrado</option>
          <option value="4">Adotado</option>
        </select>
        <br>
        <br>
        <button class="button">Registar</button>
        <button class="button">Cancelar</button>
      </form>
    </div>
  </div>
</template>

<script>
</script>

<style scoped>
  .background {
    width: 100%;
    height: 100vh;
    margin-top: 38px;
    border: 1px solid black;
    background: url("../assets/cao2.jpg");
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
