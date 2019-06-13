<template>
  <div>
  <div class="login-wrap">
    <div class="login-html">
      <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Utilizador Comum</label>
      <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Canil</label>

      <div class="login-form ">
        <div class="sign-in-htm row">
            <div class="column">
          <div class="group">
            <label for="user" class="label">Nome</label>
            <input id="user" type="text" class="input">
          </div>
          <div class="group">
            <label for="pass" class="label">Email</label>
            <input id="pass1" type="text" class="input">
          </div>
              <div class="group">
                <label for="user" class="label">Concelho</label>
                <input id="user2" type="text" class="input">
              </div>
            </div>
            <div class="column">
          <div class="group">
            <label for="pass" class="label">Password</label>
            <input id="pass2" type="password" class="input" data-type="password">
          </div>
          <div class="group">
            <label for="pass" class="label">Confirme a password</label>
            <input id="pass3" type="password" class="input" data-type="password">
          </div>
              <div class="group">
                <label for="user" class="label">Telemóvel</label>
                <input id="user" type="text" class="input">
              </div>
            </div>
          <div class="group">
            <label for="user" class="label">Insira uma foto sua</label>
            <input type="file">
          </div>
          <div class="group">
            <input id="check" type="checkbox" class="check" checked>
            <label for="check"><span class="icon"></span> Quero que o meu telemóvel seja visivel pelos outros utilizadores</label>
          </div>
          <div class="group">
            <input id="check" type="checkbox" class="check" checked>
            <label for="check"><span class="icon"></span> Aceito os termos e condições</label>
          </div>
          <div class="group">
            <input type="submit" class="button" value="Registar">
          </div>
        </div>
        <div class="sign-up-htm row">
          <div class="column">
          <div class="group">
            <label for="user" class="label">Nome</label>
            <input id="user5" type="text" class="input">
          </div>
          <div class="group">
            <label for="user" class="label">Email</label>
            <input id="user6" type="text" class="input">
          </div>
          <div class="group">
            <label for="pass" class="label">Password</label>
            <input id="pass" type="password" class="input" data-type="password">
          </div>
            <div class="group">
              <label for="pass" class="label">Confirme a password</label>
              <input id="pass100" type="password" class="input" data-type="password">
            </div>
            <div class="group">
              <label for="user" class="label">Telemóvel</label>
              <input id="user8" type="text" class="input">
            </div>
            <div class="group">
              <label for="user" class="label">Concelho</label>
              <input id="user8" type="text" class="input">
            </div>
          </div>
          <div class="column">
          <div class="group">

            <div class="group">
              <label for="user" class="label">Morada</label>
              <input id="user8" type="text" class="input">
            </div>
            <div class="group">
              <label for="user" class="label">Link site oficial</label>
              <input id="user8" type="text" class="input">
            </div>
            <div class="group">
              <label for="user" class="label">Link Facebook </label>
              <input id="user8" type="text" class="input">
            </div>
            <div class="group">
              <label for="user" class="label">Link Instagram</label>
              <input id="user8" type="text" class="input">
            </div>
            <div class="group">
              <label for="user" class="label">Horário</label>
              <input type="text" class="input">
            </div>
          </div>
          <div class="group">
            <label for="pass" class="label">Descrição</label>
            <textarea id="pass" type="text" class="input"></textarea>
          </div>
          </div>
          <div class="group">
            <label for="user" class="label">Insira uma foto que represente o canil </label>
            <input type="file">
          </div>
          <div class="group">
            <input id="check" type="checkbox" class="check" checked>
            <label for="check"><span class="icon"></span> Aceito os termos e condições</label>
          </div>
          <div class="group">
            <input type="submit" class="button" value="Registar"> <!-- mandar para o perfil do user ou canil-->
          </div>
        </div>
        </div>
    </div>
  </div>
  </div>
</template>

<script>
export default {
  name: 'Registar'}
</script>

<style scoped>
  body{
    margin:0;
    color:#6a6f8c;
    background:#c8c8c8;
    font:600 16px/18px 'Open Sans',sans-serif;
  }
  *,:after,:before{box-sizing:border-box}
  .clearfix:after,.clearfix:before{content:'';display:table}
  .clearfix:after{clear:both;display:block}
  a{color:inherit;text-decoration:none}

  .login-wrap{
    width:100%;
    margin:auto;
    max-width:100%;
    min-height:1024px;
    position:relative;
    box-shadow:0 12px 15px 0 rgba(0,0,0,.24),0 17px 50px 0 rgba(0,0,0,.19);
  }
  .login-html{
    width:100%;
    height:100%;
    position:absolute;
    padding:90px 70px 50px 70px;
    background: transparent; /* Mudar a cor do fundo */
  }
  .login-html .sign-in-htm,
  .login-html .sign-up-htm{
    top:0;
    left:0;
    right:0;
    bottom:0;
    position:absolute;
    transform:rotateY(180deg);
    backface-visibility:hidden;
    transition:all .4s linear;
  }
  .login-html .sign-in,
  .login-html .sign-up,
  .login-form .group .check{
    display:none;
  }
  .login-html .tab,
  .login-form .group .label,
  .login-form .group .button{
    text-transform:uppercase;
  }
  .login-html .tab{
    font-size:22px;
    padding-bottom:5px;
    margin: 0 15px 10px 0;
    display:inline-block;
    border-bottom:2px solid transparent;
  }
  .login-html .sign-in:checked + .tab,
  .login-html .sign-up:checked + .tab{
    color: #0031ff; /* Cor das letras da tab */
    border-color:#1161ee; /* Cor da seleção da tab */
  }
  .login-form{
    min-height:345px;
    position:relative;
    perspective:1000px;
    transform-style:preserve-3d;
  }
  .login-form .group{
    margin-bottom:15px;
  }
  .login-form .group .textarea,
  .login-form .group .label,
  .login-form .group .input{
    width:100%;
    color: #000000; /* Cor das letras do botão */
    display:block;
  }

  .login-form .group .button{
    width:20%;
    color: #fffbff; /* Cor das letras do botão */
    float: right ;
    background-color: #f4511e;
    border: none;
    padding: 16px 32px;
    text-align: center;
    font-size: 16px;
    margin: 4px 2px;
    opacity: 0.6;
    transition: 0.3s;
    display: inline-block;
    text-decoration: none;
    cursor: pointer;
  }

  .login-form .group .button:hover {opacity: 1}

  .login-form .group .textarea,
  .login-form .group .input,
  .login-form .group .button{
    border:none;
    padding:15px 20px;
    border-radius:25px;
    background: rgba(24, 105, 138, 0.34); /* Cor das caixinhas */
  }
  .login-form .group input[data-type="password"]{
    text-security:circle;
    -webkit-text-security:circle;
  }
  .login-form .group .label{
    color: #000000; /* Muda a cor das labels */
    font-size:12px;
  }
  .login-form .group .button{
    background:#1161ee;
  }
  .login-form .group label .icon{
    width:15px;
    height:15px;
    border-radius:2px;
    position:relative;
    display:inline-block;
    background:rgba(255,255,255,.1);
  }
  .login-form .group label .icon:before,
  .login-form .group label .icon:after{
    content:'';
    width:10px;
    height:2px;
    background:#fff; /* Cor do visto do checkbox */
    position:absolute;
    transition:all .2s ease-in-out 0s;
  }
  .login-form .group label .icon:before{
    left:3px;
    width:5px;
    bottom:6px;
    transform:scale(0) rotate(0);
  }
  .login-form .group label .icon:after{
    top:6px;
    right:0;
    transform:scale(0) rotate(0);
  }
  .login-form .group .check:checked + label{
    color: #000000; /* Cor das  letras da checkbox */
  }
  .login-form .group .check:checked + label .icon{
    background:#1161ee;
  }
  .login-form .group .check:checked + label .icon:before{
    transform:scale(1) rotate(45deg);
  }
  .login-form .group .check:checked + label .icon:after{
    transform:scale(1) rotate(-45deg);
  }
  .login-html .sign-in:checked + .tab + .sign-up + .tab + .login-form .sign-in-htm{
    transform:rotate(0);
  }
  .login-html .sign-up:checked + .tab + .login-form .sign-up-htm{
    transform:rotate(0);
  }

  /* Create two equal columns that floats next to each other */
  .column {
    float: left;
    width: 50%;
    padding: 10px;
  }

  /* Clear floats after the columns */
  .row:after {
    content: "";
    display: table;
    clear: both;
  }
</style>
