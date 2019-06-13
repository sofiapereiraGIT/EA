<template>
    <div>
        <div class="limiter ">
            <div class="container-login100">
                <div class="wrap-login100 p-t-190 p-b-30 row">
                    <form class="login100-form validate-form">
                        <div class="columnAlign">
                            <div class="login100-form-avatar">
                                <img src="../../assets/cat.jpg" class="center">
                            </div>
                            <br>
                            <div>
                                <router-link class="txt1" to="/UserPerfil">
                                    Inserir nome da pessoa ou canil
                                </router-link>
                            </div>
                        </div>
                        <div class="column">
                            <br>
                            <div class="w3-large w3-margin-bottom">
                                <i class="fas fa-building fa-fw w3-hover-text-black w3-margin-right"></i> Concelho<br>
                            </div>
                            <div class="w3-large w3-margin-bottom">
                                <i class="fas fa-user fa-fw w3-hover-text-black w3-margin-right"></i> Nome<br>
                            </div>
                            <div class="w3-large w3-margin-bottom">
                                <i class="fas fa-info-circle fa-fw w3-hover-text-black w3-margin-right"></i> Descrição<br>
                            </div>
                            <div class="column2">
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-paw fa-fw w3-hover-text-black w3-margin-right"></i> Tipo<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-venus-mars fa-fw w3-hover-text-black w3-margin-right"></i> Sexo<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-hourglass-half fa-fw w3-hover-text-black w3-margin-right"></i> Idade<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-id-card-alt fa-fw w3-hover-text-black w3-margin-right"></i> Raça<br>
                                </div>
                            </div>
                            <div class="column2">
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-palette fa-fw w3-hover-text-black w3-margin-right"></i> Cor do pelo<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-cut fa-fw w3-hover-text-black w3-margin-right"></i> Tipo do pelo<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-ruler-horizontal fa-fw w3-hover-text-black w3-margin-right"></i> Comprimento do pelo<br>
                                </div>
                                <div class="w3-large w3-margin-bottom">
                                    <i class="fas fa-ruler-combined fa-fw w3-hover-text-black w3-margin-right"></i> Porte<br>
                                </div>
                            </div>
                            <div>
                                <br>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'VerAnimalPerdidos'
}
</script>

<style scoped>
    /* The container */
    .container {
        display: inline-block;
        position: relative;
        padding-left: 35px;
        margin-bottom: 12px;
        cursor: pointer;
        font-size: 15px;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
    }

    /* Hide the browser's default checkbox */
    .container input {
        position: absolute;
        opacity: 0;
        cursor: pointer;
        height: 0;
        width: 0;
    }

    /* Create a custom checkbox */
    .checkmark {
        position: absolute;
        top: 0;
        left: 0;
        height: 25px;
        width: 25px;
        background-color: #eee;
    }

    /* On mouse-over, add a grey background color */
    .container:hover input ~ .checkmark {
        background-color: #ccc;
    }

    /* When the checkbox is checked, add a blue background */
    .container input:checked ~ .checkmark {
        background-color: #2196F3;
    }

    /* Create the checkmark/indicator (hidden when not checked) */
    .checkmark:after {
        content: "";
        position: absolute;
        display: none;
    }

    /* Show the checkmark when checked */
    .container input:checked ~ .checkmark:after {
        display: inline-block;
    }

    /* Style the checkmark/indicator */
    .container .checkmark:after {
        left: 9px;
        top: 5px;
        width: 5px;
        height: 10px;
        border: solid white;
        border-width: 0 3px 3px 0;
        -webkit-transform: rotate(45deg);
        -ms-transform: rotate(45deg);
        transform: rotate(45deg);
    }

    .center {
        margin-left: auto;
        margin-right: auto;
        width: 250px;
        height: 250px;
        background-size: cover;
    }

    /* Create two equal columns that floats next to each other */
    .columnAlign {
        float: left;
        width: 50%;
        padding: 100px 0;
        text-align: center;

    }

    .column {
        float: left;
        width: 50%;
        padding: 70px 0;
    }

    .columnBtn {
        float: right;
        width: 50%;
        padding: 70px 0;
    }

    .column2 {
        float: left;
        width: 50%;
        padding: 0px;
        display:inline-block;
    }

    /* Clear floats after the columns */
    .row:after {
        content: "";
        display: table;
        clear: both;
    }
    .login100-form-btn {
        font-family: Montserrat-Bold, serif;
        font-size: 15px;
        line-height: 1.5;
        color: #fff;
        text-transform: uppercase;

        width: 25%;
        height: 50px;
        border-radius: 25px;
        background: gray;
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: inline-block;
        justify-content: right;
        align-items: center;
        padding: 0 25px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }
    .login100-form-btn:hover {
        background: black;
    }
    @font-face {
        font-family: Poppins-Regular;
        src: url('../../fonts/poppins/Poppins-Regular.ttf');
    }

    @font-face {
        font-family: Poppins-Medium;
        src: url('../../fonts/poppins/Poppins-Medium.ttf');
    }

    @font-face {
        font-family: Poppins-Bold;
        src: url('../../fonts/poppins/Poppins-Bold.ttf');
    }

    @font-face {
        font-family: Poppins-SemiBold;
        src: url('../../fonts/poppins/Poppins-SemiBold.ttf');
    }
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body, html {
        height: 100%;
        font-family: Poppins-Regular, sans-serif;
    }

    a {
        font-family: Poppins-Regular, serif;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0;
        transition: all 0.4s;
        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
    }

    h1,h2,h3,h4,h5,h6 {
        margin: 0;
    }

    p {
        font-family: Poppins-Regular, serif;
        font-size: 14px;
        line-height: 1.7;
        color: #666666;
        margin: 0;
    }

    ul, li {
        margin: 0;
        list-style-type: none;
    }

    input {
        outline: none;
        border: none;
    }

    textarea {
        outline: none;
        border: none;
    }

    textarea:focus, input:focus {
        border-color: transparent !important;
    }

    input:focus::-webkit-input-placeholder { color:transparent; }
    input:focus:-moz-placeholder { color:transparent; }
    input:focus::-moz-placeholder { color:transparent; }
    input:focus:-ms-input-placeholder { color:transparent; }

    textarea:focus::-webkit-input-placeholder { color:transparent; }
    textarea:focus:-moz-placeholder { color:transparent; }
    textarea:focus::-moz-placeholder { color:transparent; }
    textarea:focus:-ms-input-placeholder { color:transparent; }

    input::-webkit-input-placeholder { color: #adadad;}
    input:-moz-placeholder { color: #adadad;}
    input::-moz-placeholder { color: #adadad;}
    input:-ms-input-placeholder { color: #adadad;}

    textarea::-webkit-input-placeholder { color: #adadad;}
    textarea:-moz-placeholder { color: #adadad;}
    textarea::-moz-placeholder { color: #adadad;}
    textarea:-ms-input-placeholder { color: #adadad;}

    button {
        outline: none !important;
        border: none;
        background: transparent;
        display: inline-block;
    }

    button:hover {
        cursor: pointer;
    }

    iframe {
        border: none !important;
    }

    .txt1 {
        text-align: center;
        font-family: Poppins-Regular, serif;
        font-size: 13px;
        color: #666666;
        line-height: 1.5;
    }

    .limiter {
        width: 100%;
        margin: 0 auto;
    }

    .container-login100 {
        width: 100%;
        min-height: 100vh;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        align-items: center;
        padding: 15px;
        background: url('../../assets/CaoEGato.jpg');
    }

    .wrap-login100 {
        width: 1100px;
        height: 500px;
        background: #fff;
        border-radius: 10px;
        overflow: scroll;
        padding: 0px 0px 0px 0px;

        box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -moz-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -webkit-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -o-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
        -ms-box-shadow: 0 5px 10px 0px rgba(0, 0, 0, 0.1);
    }

    .login100-form {
        width: 100%;
    }

    .login100-form-title {
        display: block;
        font-family: Poppins-Bold,serif;
        font-size: 30px;
        color: #333333;
        line-height: 1.2;
        text-align: center;
    }
    .login100-form-title i {
        font-size: 60px;
    }

    .wrap-input100 {
        width: 100%;
        position: relative;
        border-bottom: 2px solid #adadad;
        margin-bottom: 37px;
    }

    .input100 {
        font-family: Poppins-Regular, serif;
        font-size: 15px;
        color: #555555;
        line-height: 1.2;

        display: block;
        width: 100%;
        height: 45px;
        background: transparent;
        padding: 0 5px;
    }

    .focus-input100 {
        position: absolute;
        display: block;
        width: 100%;
        height: 100%;
        top: 0;
        left: 0;
        pointer-events: none;
    }

    .focus-input100::before {
        content: "";
        display: block;
        position: absolute;
        bottom: -2px;
        left: 0;
        width: 0;
        height: 2px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;

        background: #6a7dfe;
        background: -webkit-linear-gradient(left, #21d4fd, #b721ff);
        background: -o-linear-gradient(left, #21d4fd, #b721ff);
        background: -moz-linear-gradient(left, #21d4fd, #b721ff);
        background: linear-gradient(left, #21d4fd, #b721ff);
    }

    .focus-input100::after {
        font-family: Poppins-Regular, serif;
        font-size: 15px;
        color: #999999;
        line-height: 1.2;

        content: attr(data-placeholder);
        display: block;
        width: 100%;
        position: absolute;
        top: 16px;
        left: 0px;
        padding-left: 5px;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }

    .input100:focus + .focus-input100::after {
        top: -15px;
    }

    .input100:focus + .focus-input100::before {
        width: 100%;
    }

    .has-val.input100 + .focus-input100::after {
        top: -15px;
    }

    .has-val.input100 + .focus-input100::before {
        width: 100%;
    }

    .btn-show-pass {
        font-size: 15px;
        color: #999999;

        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        align-items: center;
        position: absolute;
        height: 100%;
        top: 0;
        right: 0;
        padding-right: 5px;
        cursor: pointer;
        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }

    .container-login100-form-btn {
        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        padding-top: 13px;
    }

    .wrap-login100-form-btn {
        width: 100%;
        display: block;
        position: relative;
        z-index: 1;
        border-radius: 25px;
        overflow: hidden;
        margin: 0 auto;
    }

    .login100-form-bgbtn {
        position: absolute;
        z-index: -1;
        width: 300%;
        height: 100%;
        background: #a64bf4;
        background: -webkit-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: -o-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: -moz-linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        background: linear-gradient(right, #21d4fd, #b721ff, #21d4fd, #b721ff);
        top: 0;
        left: -100%;

        -webkit-transition: all 0.4s;
        -o-transition: all 0.4s;
        -moz-transition: all 0.4s;
        transition: all 0.4s;
    }

    .login100-form-btn {
        font-family: Poppins-Medium, serif;
        font-size: 15px;
        color: #fff;
        line-height: 1.2;
        text-transform: uppercase;

        display: -webkit-box;
        display: -webkit-flex;
        display: -moz-box;
        display: -ms-flexbox;
        display: inline-block;
        justify-content: right;
        align-items: right;
        padding: 0 20px;
        width: 40%;
        height: 50px;
    }

    .wrap-login100-form-btn:hover .login100-form-bgbtn {
        left: 0;
    }

    @media (max-width: 576px) {
        .wrap-login100 {
            padding: 77px 15px 33px 15px;
        }
    }

    .validate-input {
        position: relative;
    }

    .alert-validate::before {
        content: attr(data-validate);
        position: absolute;
        max-width: 70%;
        background-color: #fff;
        border: 1px solid #c80000;
        border-radius: 2px;
        padding: 4px 25px 4px 10px;
        top: 50%;
        -webkit-transform: translateY(-50%);
        -moz-transform: translateY(-50%);
        -ms-transform: translateY(-50%);
        -o-transform: translateY(-50%);
        transform: translateY(-50%);
        right: 0;
        pointer-events: none;

        font-family: Poppins-Regular, serif;
        color: #c80000;
        font-size: 13px;
        line-height: 1.4;
        text-align: left;

        visibility: hidden;
        opacity: 0;

        -webkit-transition: opacity 0.4s;
        -o-transition: opacity 0.4s;
        -moz-transition: opacity 0.4s;
        transition: opacity 0.4s;
    }

    .alert-validate::after {
        content: "\f06a";
        font-family: FontAwesome, serif;
        font-size: 16px;
        color: #c80000;

        display: block;
        position: absolute;
        background-color: #fff;
        top: 50%;
        -webkit-transform: translateY(-50%);
        -moz-transform: translateY(-50%);
        -ms-transform: translateY(-50%);
        -o-transform: translateY(-50%);
        transform: translateY(-50%);
        right: 5px;
    }

    .alert-validate:hover:before {
        visibility: visible;
        opacity: 1;
    }

    @media (max-width: 992px) {
        .alert-validate::before {
            visibility: visible;
            opacity: 1;
        }
    }
</style>
